package com.example.phonicsapp.HandWriting.ScreenShoot;

import java.io.File;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.util.ScreenCapture;
import org.andengine.entity.util.ScreenCapture.IScreenCaptureCallback;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TextureRegionFactory;
import org.andengine.util.FileUtils;
import org.andengine.util.debug.Debug;

import com.example.accountSystem.AccountDisplayPage;
import com.example.accountSystem.AdminPanel;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;


public class ScreenShot 
{
	
	public static int screenAccountNumber;
	public static String address;
	public static String DEBUG_TAG =  ScreenShot.class.getSimpleName();
	public String IMEI;
	
	public ScreenShot()
	{
//		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), 
//				GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnExternalStorage("/screen"+".jpg")
//		 , new IScreenCaptureCallback() 
		
//		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnInternalStorage
//				(GameActivity.MainActivityInstace.getApplicationContext(), "/screen"+".jpg") , new IScreenCaptureCallback() 
		
		File file = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters");
		if (!file.exists())  
		{
		    file.mkdirs();
		}
		
		
		if(AdminPanel.adminEnable==true)
		{
			adminPanelImage();
		}
		else
		{
			openHandWritingImageFile();
		}
		
		
		//capture the screen shot and save it to external storage
		GameActivity.cursor.setVisible(false);
		//final float time = System.currentTimeMillis();
		
		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), 
		GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnExternalStorage( address )
		, new IScreenCaptureCallback() 
		{ 
			@Override
			public void onScreenCaptured(final String pFilePath) 
			{
				GameActivity.MainActivityInstace.runOnUiThread(new Runnable()
				{ 
					@Override
					public void run() 
					{ 
						//Debug.d("Screenshot: " + pFilePath + " taken!");
//						GameActivity.changeTexture = 1;
						
						new setTexture(FileUtils.getAbsolutePathOnExternalStorage(address));
						
//						new setTexture(FileUtils.getAbsolutePathOnInternalStorage
//								(GameActivity.MainActivityInstace.getApplicationContext(), "/screen"+".jpg"));
					} 
				});
			}

			@Override
			public void onScreenCaptureFailed(final String pFilePath, final Exception pException)
			{
				GameActivity.MainActivityInstace.runOnUiThread(new Runnable()
				{
					@Override
					public void run() 
					{
						GameActivity.changeTexture = 0;
					}
				});
			}
		});

	}
	
	public void openHandWritingImageFile() 
	{
		screenAccountNumber = AccountDisplayPage.accountNumber;
		
		IMEI=GameActivity.loadSavedPreferences("imie");
		Debug.d(DEBUG_TAG, ""+IMEI); 
		
		File[] files = new File[6];
		files[0] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"a");
		files[1] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"b");
		files[2] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"c");
		files[3] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"d");
		files[4] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"e");
		files[5] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"f");
		
		
		
		for(int i=0; i<6; i++)
		{
			//files[i] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+i);
			if (!files[i].exists())  
			{
				files[i].mkdirs();
			}
		}
		
		if(screenAccountNumber==0)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"a/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		else if(screenAccountNumber==1)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"b/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		else if(screenAccountNumber==2)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"c/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		else if(screenAccountNumber==3)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"d/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		else if(screenAccountNumber==4)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"e/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		else if(screenAccountNumber==5)
		{
			address="/PhonicsApp/HandWritingLetters/"+IMEI+"f/account no"+" "+HandWritingMenu.letterNumber+".jpg";
		}
		

	}

	public static class setTexture
	{
		public setTexture(String address)
		{ 
			//this.mDrawnPictureRegion = textureRegion;
			GameActivity.source = new BitmapTextureAtlasSource(BitmapFactory.decodeFile(address));
			GameActivity.texture = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(),
					GameActivity.viewWidth, GameActivity.viewHeight);
			GameActivity.texture.addTextureAtlasSource(GameActivity.source, 0, 0);
			GameActivity.texture.load();
			GameActivity.textureRegion = (TextureRegion) TextureRegionFactory.createFromSource(
					GameActivity.texture, GameActivity.source, 0, 0);
		}
		
	}
	
	//calling for screen shot
	public static void takeScreenShot()
	{
		GameActivity.screenCapture = new ScreenCapture();
			GameActivity.mScene.attachChild(GameActivity.screenCapture);
			
			GameActivity.mScene.registerUpdateHandler(new TimerHandler((float)0.1, new ITimerCallback() 
			{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler)
				{
					// TODO Auto-generated method stub
					
					//trigger the screen shot
					new ScreenShot();
					GameActivity.changeTexture = 1;
				} 
			}));
	}
	
	public void adminPanelImage()
	{
		IMEI=GameActivity.loadSavedPreferences("imie");
		Debug.d(DEBUG_TAG, ""+IMEI); 
		
		File[] files = new File[1];
		files[0] = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters/"+IMEI+"admin");
		
		
		
		for(int i=0; i<1; i++)
		{
			if (!files[i].exists())  
			{
				files[i].mkdirs();
			}
		}
		address = "/PhonicsApp/HandWritingLetters/"+IMEI+"admin/account no"+" "+HandWritingMenu.letterNumber+".jpg";;
		
	}
	
}
