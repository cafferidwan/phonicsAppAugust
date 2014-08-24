package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.R;
import com.example.phonicsapp.tutorialGame.starting.LetterActivity;
import com.example.phonicsapp.tutorialGame.tutorialgame.TutorialGameActivity;

import android.content.Intent;
import android.view.Display;

public class TutorialActivity extends SimpleBaseGameActivity
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene mScene;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBackGraound, mBitmapTextureAtlasLetter1, 
									 mBitmapTextureAtlasLetter2, mBitmapTextureAtlasLetter3,
									 mBitmapTextureAtlasLetter4, mBitmapTextureAtlasLetter5,
									 mBitmapTextureAtlasLetter6, mBitmapTextureAtlasLetter7,
									 mBitmapTextureAtlasLetter8, mBitmapTextureAtlasLetter9,
									 mBitmapTextureAtlasLetter10, mBitmapTextureAtlasLetter11,
									 mBitmapTextureAtlasLetter12, mBitmapTextureAtlasLetter13,
									 mBitmapTextureAtlasLetter14, mBitmapTextureAtlasLetter15,
									 
									 mBitmapTextureAtlasObject1, mBitmapTextureAtlasObject2,
									 mBitmapTextureAtlasObject3, mBitmapTextureAtlasObject4,
									 mBitmapTextureAtlasObject5, mBitmapTextureAtlasObject6,
									 mBitmapTextureAtlasObject7, mBitmapTextureAtlasObject8,
									 mBitmapTextureAtlasNextButton;

	public static ITextureRegion mLetter1TextureRegion, mLetter2TextureRegion,
								 mLetter3TextureRegion, mLetter4TextureRegion, 
								 mLetter5TextureRegion, mLetter6TextureRegion,
								 mLetter7TextureRegion, mLetter8TextureRegion, 
								 mLetter9TextureRegion, mLetter10TextureRegion, 
								 mLetter11TextureRegion, mLetter12TextureRegion,
								 mLetter13TextureRegion, mLetter14TextureRegion,
								 mLetter15TextureRegion,
								 
								 mObject1TextureRegion, mObject2TextureRegion,
								 mObject3TextureRegion, mObject4TextureRegion,
								 mObject5TextureRegion, mObject6TextureRegion,
								 mObject7TextureRegion, mObject8TextureRegion,
								 mNextButtonTextureRegion;
	
	public static ITextureRegion mbackGroundTextureRegion;
	public static ITiledTextureRegion mParrotTextureRegion;
	
	private BuildableBitmapTextureAtlas mAnimatedBitmapTextureAtlas;
	
	public static Sprite backGround, backGround2;
	public static Sprite Object1, Object2, nextButton;
	public static Parrot parrot; 
	public static Letter letter1, letter2, letter3, letter4, letter5, letter6;
	
	public static TutorialActivity MainActivityInstace;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	
	public static float parrotHeight, letter1Pos, letter2Pos, letter3Pos, letter4Pos, letter5Pos;
	public static int parrotWay;
	
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		MainActivityInstace = this;
//		Display display = getWindowManager().getDefaultDisplay();
//		CAMERA_HEIGHT = display.getHeight();
//		CAMERA_WIDTH = display.getWidth();
		CAMERA_WIDTH = 800;
		CAMERA_HEIGHT = 454;
		
		parrotHeight = TutorialActivity.CAMERA_HEIGHT / 2 -200;
		letter1Pos = TutorialActivity.CAMERA_WIDTH/2 - TutorialActivity.CAMERA_WIDTH/4 - 90;
		letter2Pos = letter1Pos + 100;
		letter3Pos = letter2Pos + 300;
		letter4Pos = letter3Pos + 100; 
		letter5Pos = letter4Pos + 100; 
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources()
	{
		// TODO Auto-generated method stub
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("GameMenuGfx/");

		mBitmapTextureAtlasBackGraound = new BitmapTextureAtlas(
				this.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		mbackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasBackGraound, this,
				"JungleBG.png", 0, 0, 1, 1);
		
		//shorea
		mBitmapTextureAtlasLetter1 = new BitmapTextureAtlas(
				this.getTextureManager(), 111, 113, TextureOptions.BILINEAR);
		mLetter1TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter1, this,
				"aa.png", 0, 0, 1, 1);
 
		//mo
		mBitmapTextureAtlasLetter2 = new BitmapTextureAtlas(
				this.getTextureManager(), 75, 113, TextureOptions.BILINEAR);
		mLetter2TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter2, this,
				"mo.png", 0, 0, 1, 1);

		//akar
		mBitmapTextureAtlasLetter3 = new BitmapTextureAtlas(
				this.getTextureManager(), 47, 113, TextureOptions.BILINEAR);
		mLetter3TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter3, this,
				"a.png", 0, 0, 1, 1);

		//u
		mBitmapTextureAtlasLetter4 = new BitmapTextureAtlas(
				this.getTextureManager(), 81, 113, TextureOptions.BILINEAR);
		mLetter4TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter4, this,
				"uu.png", 0, 0, 1, 1);
		//rashu
		mBitmapTextureAtlasLetter5 = new BitmapTextureAtlas(
				this.getTextureManager(), 66, 36, TextureOptions.BILINEAR);
		mLetter5TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter5, this,
				"u.png", 0, 0, 1, 1);
		
		//toh
		mBitmapTextureAtlasLetter6 = new BitmapTextureAtlas(
				this.getTextureManager(), 69, 113, TextureOptions.BILINEAR);
		mLetter6TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter6, this,
				"to.png", 0, 0, 1, 1);
		
		//cho
		mBitmapTextureAtlasLetter7 = new BitmapTextureAtlas(
				this.getTextureManager(), 66, 113, TextureOptions.BILINEAR);
		mLetter7TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter7, this,
				"cho.png", 0, 0, 1, 1);
		
		//lo
		mBitmapTextureAtlasLetter8 = new BitmapTextureAtlas(
				this.getTextureManager(), 81, 113, TextureOptions.BILINEAR);
		mLetter8TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter8, this,
				"lo.png", 0, 0, 1, 1);
		
		//e
		mBitmapTextureAtlasLetter9 = new BitmapTextureAtlas(
				this.getTextureManager(), 75, 113, TextureOptions.BILINEAR);
		mLetter9TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter9, this,
				"ii.png", 0, 0, 1, 1);
		
		//ekar
		mBitmapTextureAtlasLetter10 = new BitmapTextureAtlas(
				this.getTextureManager(), 77, 113, TextureOptions.BILINEAR);
		mLetter10TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter10, this,
				"i.png", 0, 0, 1, 1);
		
		//aa
		mBitmapTextureAtlasLetter11 = new BitmapTextureAtlas(
				this.getTextureManager(), 64, 113, TextureOptions.BILINEAR);
		mLetter11TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter11, this,
				"ee.png", 0, 0, 1, 1);
		
		//aakar
		mBitmapTextureAtlasLetter12 = new BitmapTextureAtlas(
				this.getTextureManager(), 54, 113, TextureOptions.BILINEAR);
		mLetter12TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter12, this,
				"e.png", 0, 0, 1, 1);
		
		//ko
		mBitmapTextureAtlasLetter13 = new BitmapTextureAtlas(
				this.getTextureManager(), 86, 113, TextureOptions.BILINEAR);
		mLetter13TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter13, this,
				"ko.png", 0, 0, 1, 1);
		
		//bo
		mBitmapTextureAtlasLetter14 = new BitmapTextureAtlas(
				this.getTextureManager(), 70, 113, TextureOptions.BILINEAR);
		mLetter14TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter14, this,
				"bo.png", 0, 0, 1, 1);
		
		//cha
		mBitmapTextureAtlasLetter15 = new BitmapTextureAtlas(
				this.getTextureManager(), 113, 113, TextureOptions.BILINEAR);
		mLetter15TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter15, this,
				"cha.png", 0, 0, 1, 1);


		//aam
		mBitmapTextureAtlasObject1 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject1TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject1, this,
				"am.png", 0, 0, 1, 1);

		//ma
		mBitmapTextureAtlasObject2 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject2TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject2, this,
				"ma1.png", 0, 0, 1, 1);
		
		//ut
		mBitmapTextureAtlasObject3 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject3TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject3, this,
				"ut.png", 0, 0, 1, 1);

		//boi
		mBitmapTextureAtlasObject4 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject4TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject4, this,
				"boi.png", 0, 0, 1, 1);
		
		//bel
		mBitmapTextureAtlasObject5 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject5TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject5, this,
				"bel.png", 0, 0, 1, 1);

		//chabi
		mBitmapTextureAtlasObject6 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject6TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject6, this,
				"chabi.png", 0, 0, 1, 1);
		
		//chul
		mBitmapTextureAtlasObject7 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject7TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject7, this,
				"chul.png", 0, 0, 1, 1);

		//ek
		mBitmapTextureAtlasObject8 = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mObject8TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasObject8, this,
				"ek.png", 0, 0, 1, 1);
		
		//next button
		mBitmapTextureAtlasNextButton = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		mNextButtonTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasNextButton, this,
				"dan.png", 0, 0, 1, 1);
		
		mAnimatedBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 1200, 200, TextureOptions.NEAREST);
		mParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
				createTiledFromAsset(this.mAnimatedBitmapTextureAtlas, this, "parrot.png", 6, 1);
		
		try 
		{
			this.mAnimatedBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			this.mAnimatedBitmapTextureAtlas.load();
		} 
		catch (TextureAtlasBuilderException e) 
		{
			Debug.e(e);
		}
		
		mBitmapTextureAtlasBackGraound.load();
		mBitmapTextureAtlasLetter1.load();
		mBitmapTextureAtlasLetter2.load();
		mBitmapTextureAtlasLetter3.load();
		mBitmapTextureAtlasLetter4.load();
		mBitmapTextureAtlasLetter5.load();
		mBitmapTextureAtlasLetter6.load();
		mBitmapTextureAtlasLetter7.load();
		mBitmapTextureAtlasLetter8.load();
		mBitmapTextureAtlasLetter9.load();
		mBitmapTextureAtlasLetter10.load();
		mBitmapTextureAtlasLetter11.load();
		mBitmapTextureAtlasLetter12.load();
		mBitmapTextureAtlasLetter13.load();
		mBitmapTextureAtlasLetter14.load();
		mBitmapTextureAtlasLetter15.load();
		
		mBitmapTextureAtlasObject1.load(); 
		mBitmapTextureAtlasObject2.load();
		mBitmapTextureAtlasObject3.load();
		mBitmapTextureAtlasObject4.load();
		mBitmapTextureAtlasObject5.load();
		mBitmapTextureAtlasObject6.load();
		mBitmapTextureAtlasObject7.load();
		mBitmapTextureAtlasObject8.load();
		mBitmapTextureAtlasNextButton.load();
	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		mScene.setTouchAreaBindingOnActionDownEnabled(true);
		
		vertexBufferObjectManager = getVertexBufferObjectManager();
		
		CreateObjects.createObject(LetterActivity.letterNumber);
		
//		finish();
//		startActivity(new Intent(getBaseContext(), TutorialGameActivity.class));
//		startActivity(new Intent(getBaseContext(), LetterActivity.class));
		 
		mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback() 
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub
				
				SoundFunction.audioPlay = true;
				 
				if(LetterActivity.letterNumber == 1)
				{
					SoundFunction.playAudioLoop2(R.raw.tgame_t1aa1, R.raw.tgame_t1aa2_4, TutorialActivity.MainActivityInstace);
					
					Functions.parrotWithLetterPath(1, 2, 
							0, 4,  letter1, parrot, TutorialActivity.CAMERA_WIDTH  , letter1Pos,
							parrotHeight, parrotHeight);
				}
				else if(LetterActivity.letterNumber == 2)
				{
					SoundFunction.playAudio(R.raw.tgame_t1uu1, TutorialActivity.MainActivityInstace);
					
					Functions.parrotWithLetterPath(1, 2, 
							0, 4,  letter1, parrot, TutorialActivity.CAMERA_WIDTH  , letter1Pos,
							parrotHeight, parrotHeight);
				}
				else if(LetterActivity.letterNumber == 3)
				{
					SoundFunction.playAudio(R.raw.tgame_t1ii1, TutorialActivity.MainActivityInstace);
					
					Functions.parrotWithLetterPath(1, 2, 
							0, 6,  letter2, parrot, TutorialActivity.CAMERA_WIDTH  , letter2Pos,
							parrotHeight, parrotHeight);
				}
				else if(LetterActivity.letterNumber == 4)
				{
					SoundFunction.playAudioLoop2(R.raw.tgame_t1ee1, R.raw.tgame_t1ee2, TutorialActivity.MainActivityInstace);
					
					Functions.parrotWithLetterPath(1, 7, 
							0, 6,  letter1, parrot, TutorialActivity.CAMERA_WIDTH  , letter1Pos,
							parrotHeight, parrotHeight); 
				}
			}
		}));
		
		return mScene;
	}

}
