package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;

import com.example.phonicsapp.tutorialGame.tutorialgame.TutorialGameActivity;

import android.content.Intent;
import android.sax.StartElementListener;

public class CreateObjects 
{

	public static void createObject(int a)
	{
		TutorialActivity.backGround = new Sprite(0, 0, TutorialActivity.mbackGroundTextureRegion, TutorialActivity.vertexBufferObjectManager);
		TutorialActivity.backGround.setHeight(TutorialActivity.CAMERA_HEIGHT);
		TutorialActivity.backGround.setWidth(TutorialActivity.CAMERA_WIDTH);
		TutorialActivity.mScene.attachChild(TutorialActivity.backGround);
		
		TutorialActivity.parrot = new Parrot(TutorialActivity.CAMERA_WIDTH, TutorialActivity.parrotHeight, TutorialActivity.mParrotTextureRegion, TutorialActivity.vertexBufferObjectManager);
		TutorialActivity.parrot.animate(new long[]{80, 80, 80, 80, 80, 80}, 0, 5, true);
		TutorialActivity.parrot.setFlippedHorizontal(true);
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.parrot); 
		TutorialActivity.mScene.attachChild(TutorialActivity.parrot);
		
		if(a==1)
		{
			TutorialActivity.letter1 = new Letter(TutorialActivity.CAMERA_WIDTH , TutorialActivity.parrotHeight, TutorialActivity.mLetter1TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter2 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter2TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter3 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter2TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter4 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter3TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.Object1 = new Letter(TutorialActivity.letter1Pos , 60, TutorialActivity.mObject1TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.Object2 = new Letter(TutorialActivity.letter3Pos , 60, TutorialActivity.mObject2TextureRegion,
					TutorialActivity.vertexBufferObjectManager);
		}
		else if(a==2)
		{
			TutorialActivity.letter1 = new Letter(TutorialActivity.CAMERA_WIDTH , TutorialActivity.parrotHeight, TutorialActivity.mLetter4TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter2 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter6TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter3 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter5TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter4 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter7TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter5 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter8TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter5);
			TutorialActivity.mScene.attachChild(TutorialActivity.letter5);
			
			TutorialActivity.Object1 = new Letter(TutorialActivity.letter1Pos , 60, TutorialActivity.mObject3TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.Object2 = new Letter(TutorialActivity.letter3Pos , 60, TutorialActivity.mObject7TextureRegion,
					TutorialActivity.vertexBufferObjectManager);
		}
		else if(a==3)
		{
			TutorialActivity.letter1 = new Letter(TutorialActivity.CAMERA_WIDTH , TutorialActivity.parrotHeight, TutorialActivity.mLetter14TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter2 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter9TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter3 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter15TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter4 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter10TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter5 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter14TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter5);
			TutorialActivity.mScene.attachChild(TutorialActivity.letter5);
			
			
			TutorialActivity.Object1 = new Letter(TutorialActivity.letter1Pos , 60, TutorialActivity.mObject4TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.Object2 = new Letter(TutorialActivity.letter3Pos , 60, TutorialActivity.mObject6TextureRegion,
					TutorialActivity.vertexBufferObjectManager);
		}
		else if(a==4)
		{
			TutorialActivity.letter1 = new Letter(TutorialActivity.CAMERA_WIDTH , TutorialActivity.parrotHeight, TutorialActivity.mLetter11TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter2 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter13TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter3 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter12TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter4 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter14TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.letter5 = new Letter(TutorialActivity.CAMERA_WIDTH +100,TutorialActivity.CAMERA_HEIGHT / 18, TutorialActivity.mLetter8TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter5);
			TutorialActivity.mScene.attachChild(TutorialActivity.letter5);
			
			TutorialActivity.Object1 = new Letter(TutorialActivity.letter1Pos , 60, TutorialActivity.mObject8TextureRegion,
					TutorialActivity.vertexBufferObjectManager); 
			
			TutorialActivity.Object2 = new Letter(TutorialActivity.letter3Pos , 60, TutorialActivity.mObject5TextureRegion,
					TutorialActivity.vertexBufferObjectManager);
		}
		
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter1);
		TutorialActivity.mScene.attachChild(TutorialActivity.letter1);
		
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter2);
		TutorialActivity.mScene.attachChild(TutorialActivity.letter2);
		
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter3);
		TutorialActivity.mScene.attachChild(TutorialActivity.letter3);
		
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.letter4);
		TutorialActivity.mScene.attachChild(TutorialActivity.letter4);
		
		//Object1 for showing
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.Object1);
//		MainActivity.Object1.setWidth(130);
//		MainActivity.Object1.setHeight(130);
		TutorialActivity.mScene.attachChild(TutorialActivity.Object1);
		TutorialActivity.Object1.setVisible(false);
		
		//Object2 for showing
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.Object2);
//		MainActivity.Object2.setWidth(130);
//		MainActivity.Object2.setHeight(130);
		TutorialActivity.mScene.attachChild(TutorialActivity.Object2);
		TutorialActivity.Object2.setVisible(false);
		
		TutorialActivity.nextButton = new Letter(TutorialActivity.CAMERA_WIDTH/2-40 , TutorialActivity.CAMERA_HEIGHT/2-80, TutorialActivity.mNextButtonTextureRegion,
				TutorialActivity.vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
						
					if(TutorialActivity.nextButton.isVisible() == true)
					{
						TutorialActivity.MainActivityInstace.finish();
						TutorialActivity.MainActivityInstace.startActivity(
								new Intent(TutorialActivity.MainActivityInstace, TutorialGameActivity.class));
						
					}
						 
					break;
				}

				return true;
			}
		}; 
		
		TutorialActivity.mScene.registerTouchArea(TutorialActivity.nextButton);
		TutorialActivity.nextButton.setWidth(130);
		TutorialActivity.nextButton.setHeight(130);
		TutorialActivity.mScene.attachChild(TutorialActivity.nextButton);
		TutorialActivity.nextButton.setVisible(false);
	}
	
}
