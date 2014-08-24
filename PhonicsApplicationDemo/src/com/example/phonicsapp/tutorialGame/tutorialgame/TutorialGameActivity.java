package com.example.phonicsapp.tutorialGame.tutorialgame;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.Entity;
import org.andengine.entity.IEntity;
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
import com.example.phonicsapp.tutorialGame.tutorial.Functions;
import com.example.phonicsapp.tutorialGame.tutorial.TutorialActivity;
import com.example.phonicsapp.tutorialGame.tutorial.Parrot;
import com.example.phonicsapp.tutorialGame.tutorial.SoundFunction;

import android.view.Display;


public class TutorialGameActivity extends SimpleBaseGameActivity
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene mScene;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBackGraound, mBitmapTextureAtlasLetter1, 
									 mBitmapTextureAtlasLetter2, mBitmapTextureAtlasLetter3,
									 mBitmapTextureAtlasLetter4, mBitmapTextureAtlasLetter5,
									 mBitmapTextureAtlasLetter6,mBitmapTextureAtlasLetter7,
									 mBitmapTextureAtlasLetter8, mBitmapTextureAtlasLetter9,
									 mBitmapTextureAtlasLetter10, mBitmapTextureAtlasLetter11,
									 mBitmapTextureAtlasLetter12, mBitmapTextureAtlasLetter13,
									 mBitmapTextureAtlasLetter14, mBitmapTextureAtlasLetter15,
									 mBitmapTextureAtlasLetter16, mBitmapTextureAtlasLetter17,
									 mBitmapTextureAtlasLetter18;
	
	public static ITextureRegion mAamTextureRegion, mMaTextureRegion;
	
	public static ITextureRegion mLetter1TextureRegion, mLetter2TextureRegion, mLetter3TextureRegion, 
								 mLetter4TextureRegion, mLetter5TextureRegion, mLetter6TextureRegion,
								 mLetter7TextureRegion, mLetter8TextureRegion, mLetter9TextureRegion,
								 mLetter10TextureRegion, mLetter11TextureRegion, mLetter12TextureRegion,
								 mLetter13TextureRegion, mLetter14TextureRegion, mLetter15TextureRegion,
								 mLetter16TextureRegion, mLetter17TextureRegion, mLetter18TextureRegion;
	
	public static ITextureRegion mbackGroundTextureRegion;
	public static ITiledTextureRegion mParrotTextureRegion;
	
	private BuildableBitmapTextureAtlas mAnimatedBitmapTextureAtlas;
	
	public static Sprite backGround;
	public static Sprite Object1, Object2;
	public static Parrot parrot; 
	public static TutorialGameLetter letter1, letter2, letter3, letter4, letter5;
	
	public static TutorialGameActivity ActivityInstace;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	
	public static float parrotHeight, letter1Pos, letter2Pos, letter3Pos, letter4Pos, letter5Pos;
	
	public static int loadGame;
	public static boolean touchEnable;
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		ActivityInstace = this;
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;
		
		parrotHeight = TutorialGameActivity.CAMERA_HEIGHT / 2 -200;
		letter1Pos = TutorialGameActivity.CAMERA_WIDTH/2 - TutorialGameActivity.CAMERA_WIDTH/4 +100;
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
		
		mBitmapTextureAtlasLetter1 = new BitmapTextureAtlas(
				this.getTextureManager(), 186, 113, TextureOptions.BILINEAR);
		mLetter1TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter1, this,
				"am_1.png", 0, 0, 1, 1);

		mBitmapTextureAtlasLetter2 = new BitmapTextureAtlas(
				this.getTextureManager(), 122, 113, TextureOptions.BILINEAR);
		mLetter2TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter2, this,
				"am_wrong.png", 0, 0, 1, 1);

		mBitmapTextureAtlasLetter3 = new BitmapTextureAtlas(
				this.getTextureManager(), 122, 113, TextureOptions.BILINEAR);
		mLetter3TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter3, this,
				"ma_1.png", 0, 0, 1, 1);

		mBitmapTextureAtlasLetter4 = new BitmapTextureAtlas(
				this.getTextureManager(), 186, 113, TextureOptions.BILINEAR);
		mLetter4TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter4, this,
				"ma_wrong.png", 0, 0, 1, 1);
		
		//u
		mBitmapTextureAtlasLetter5 = new BitmapTextureAtlas(
				this.getTextureManager(), 149, 113, TextureOptions.BILINEAR);
		mLetter5TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter5, this,
				"ut_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter6 = new BitmapTextureAtlas(
				this.getTextureManager(), 136, 150, TextureOptions.BILINEAR);
		mLetter6TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter6, this,
				"ut_wrong.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter7 = new BitmapTextureAtlas(
				this.getTextureManager(), 147, 150, TextureOptions.BILINEAR);
		mLetter7TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter7, this,
				"chul_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter8 = new BitmapTextureAtlas(
				this.getTextureManager(), 226, 113, TextureOptions.BILINEAR);
		mLetter8TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter8, this,
				"chul_wrong.png", 0, 0, 1, 1);
		
		//e
		mBitmapTextureAtlasLetter9 = new BitmapTextureAtlas(
				this.getTextureManager(), 145, 113, TextureOptions.BILINEAR);
		mLetter9TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter9, this,
				"boi_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter10 = new BitmapTextureAtlas(
				this.getTextureManager(), 114, 113, TextureOptions.BILINEAR);
		mLetter10TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter10, this,
				"boi_wrong_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter11 = new BitmapTextureAtlas(
				this.getTextureManager(), 147, 113, TextureOptions.BILINEAR);
		mLetter11TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter11, this,
				"boi_wrong_2.png", 0, 0, 1, 1);
		
		
		mBitmapTextureAtlasLetter12 = new BitmapTextureAtlas(
				this.getTextureManager(), 229, 113, TextureOptions.BILINEAR);
		mLetter12TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter12, this,
				"chabi_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter13 = new BitmapTextureAtlas(
				this.getTextureManager(), 261, 113, TextureOptions.BILINEAR);
		mLetter13TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter13, this,
				"chabi_wrong_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter14 = new BitmapTextureAtlas(
				this.getTextureManager(), 258, 113, TextureOptions.BILINEAR);
		mLetter14TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter14, this,
				"chabi_wrong_2.png", 0, 0, 1, 1);
		
		//aa
		mBitmapTextureAtlasLetter15 = new BitmapTextureAtlas(
				this.getTextureManager(), 150, 113, TextureOptions.BILINEAR);
		mLetter15TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter15, this,
				"ek_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter16 = new BitmapTextureAtlas(
				this.getTextureManager(), 140, 113, TextureOptions.BILINEAR);
		mLetter16TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter16, this,
				"ek_wrong.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter17 = new BitmapTextureAtlas(
				this.getTextureManager(), 204, 113, TextureOptions.BILINEAR);
		mLetter17TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter17, this,
				"bel_1.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasLetter18 = new BitmapTextureAtlas(
				this.getTextureManager(), 214, 113, TextureOptions.BILINEAR);
		mLetter18TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter18, this,
				"bel_wrong.png", 0, 0, 1, 1);
		
		
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
		mBitmapTextureAtlasLetter16.load();
		mBitmapTextureAtlasLetter17.load();
		mBitmapTextureAtlasLetter18.load();
	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		mScene.setTouchAreaBindingOnActionDownEnabled(true);
		
		vertexBufferObjectManager = getVertexBufferObjectManager();
		touchEnable = false;
		
//		loadGame=1;
		
		CreateTutorialGameObject.createObjects(LetterActivity.letterNumber);
		
		Functions.parrotPath(100, (float)0.1, 2, parrot, 50, 50, -200, 80);
		
		//Enabling the touch function for playing the letters
		mScene.registerUpdateHandler(new TimerHandler(3, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				touchEnable = true;	
			}
		}));
		
		
		//play intro sound
		mScene.registerUpdateHandler(new TimerHandler(1, new ITimerCallback() 
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				playIntroSound();
			}
		}));
		
		
		return mScene;
	}

	public void playIntroSound()
	{
		//shorea 1st part
		if(LetterActivity.letterNumber==1 && TutorialGameActivity.loadGame != 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3aa1, TutorialGameActivity.ActivityInstace);
		}
		//shorea 2nd part
		else if(LetterActivity.letterNumber==1 && TutorialGameActivity.loadGame == 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3a6, TutorialGameActivity.ActivityInstace);
		}
		 
		//u 1st part
		else if(LetterActivity.letterNumber==2 && TutorialGameActivity.loadGame != 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3uu1, TutorialGameActivity.ActivityInstace);
		}
		//u 2nd part
		else if(LetterActivity.letterNumber==2 && TutorialGameActivity.loadGame == 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3u5, TutorialGameActivity.ActivityInstace);
		}
		
		//e 1st part
		else if(LetterActivity.letterNumber==3 && TutorialGameActivity.loadGame != 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3ii1, TutorialGameActivity.ActivityInstace);
		} 
		//e 2nd part
		else if(LetterActivity.letterNumber==3 && TutorialGameActivity.loadGame == 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3i6, TutorialGameActivity.ActivityInstace);
		} 
		
		//aa 1st part
		else if(LetterActivity.letterNumber==4 && TutorialGameActivity.loadGame != 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3ee1, TutorialGameActivity.ActivityInstace);
		}
		//aa 2nd part
		else if(LetterActivity.letterNumber==4 && TutorialGameActivity.loadGame == 1)
		{
			SoundFunction.audioPlay = true;
			SoundFunction.playAudio(R.raw.tgame_t3e5, TutorialGameActivity.ActivityInstace);
		}
	}

}
