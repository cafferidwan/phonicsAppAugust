package com.example.phonicsapp.tutorialGame.starting;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.ScaleModifier;
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

import android.content.Intent;

import com.example.phonicsapp.R;
import com.example.phonicsapp.tutorialGame.tutorial.Functions;
import com.example.phonicsapp.tutorialGame.tutorial.TutorialActivity;
import com.example.phonicsapp.tutorialGame.tutorial.Parrot;
import com.example.phonicsapp.tutorialGame.tutorial.SoundFunction;
import com.example.phonicsapp.tutorialGame.tutorialgame.CreateTutorialGameObject;
import com.example.phonicsapp.tutorialGame.tutorialgame.TutorialGameActivity;
import com.example.phonicsapp.tutorialGame.tutorialgame.TutorialGameLetter;

public class LetterActivity extends SimpleBaseGameActivity
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene mScene;

	public static BitmapTextureAtlas mBitmapTextureAtlasBackGraound,
			mBitmapTextureAtlasLetter1, mBitmapTextureAtlasLetter2,
			mBitmapTextureAtlasLetter3, mBitmapTextureAtlasLetter4,
			mBitmapTextureAtlasLetter5, mBitmapTextureAtlasLetter6,
			mBitmapTextureAtlasLetter7, mBitmapTextureAtlasLetter8;

	public static ITextureRegion 
			mLetter1TextureRegion, mLetter2TextureRegion,
			mLetter3TextureRegion, mLetter4TextureRegion,
			mLetter5TextureRegion, mLetter6TextureRegion,
			mLetter7TextureRegion, mLetter8TextureRegion;

	public static ITextureRegion mbackGroundTextureRegion;
	public static ITiledTextureRegion mParrotTextureRegion;

	private BuildableBitmapTextureAtlas mAnimatedBitmapTextureAtlas;

	public static Sprite backGround;
	public static Parrot parrot;
	public static Sprite letter1, letter2, letter3, letter4,
			letter5;

	public static LetterActivity LetterActivityInstace;
	public static VertexBufferObjectManager vertexBufferObjectManager;

	public static float parrotHeight, letter1Pos, letter2Pos, letter3Pos,
			letter4Pos, letter5Pos;
	
	public static int letterNumber;

	@Override
	public EngineOptions onCreateEngineOptions()
	{
		// TODO Auto-generated method stub
		LetterActivityInstace = this;
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;

		parrotHeight = LetterActivity.CAMERA_HEIGHT / 2 - 200;
		letter1Pos = LetterActivity.CAMERA_WIDTH / 2
				- LetterActivity.CAMERA_WIDTH / 4 ;
		letter2Pos = letter1Pos + 300;
		letter3Pos = letter2Pos + 300;
		letter4Pos = letter3Pos + 100;
		letter5Pos = letter4Pos + 100;

		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
				new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
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

		//akar
		mBitmapTextureAtlasLetter2 = new BitmapTextureAtlas(
				this.getTextureManager(), 47, 113, TextureOptions.BILINEAR);
		mLetter2TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter2, this,
						"a.png", 0, 0, 1, 1);

		//u
		mBitmapTextureAtlasLetter3 = new BitmapTextureAtlas(
				this.getTextureManager(), 81, 113, TextureOptions.BILINEAR);
		mLetter3TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter3, this,
						"uu.png", 0, 0, 1, 1);

		//rashu
		mBitmapTextureAtlasLetter4 = new BitmapTextureAtlas(
				this.getTextureManager(), 66, 36, TextureOptions.BILINEAR);
		mLetter4TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter4, this,
						"u.png", 0, 0, 1, 1);

		//e
		mBitmapTextureAtlasLetter5 = new BitmapTextureAtlas(
				this.getTextureManager(), 75, 113, TextureOptions.BILINEAR);
		mLetter5TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter5, this,
						"ii.png", 0, 0, 1, 1);

		//ekar
		mBitmapTextureAtlasLetter6 = new BitmapTextureAtlas(
				this.getTextureManager(), 77, 113, TextureOptions.BILINEAR);
		mLetter6TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter6, this,
						"i.png", 0, 0, 1, 1);
		
		//aa
		mBitmapTextureAtlasLetter7 = new BitmapTextureAtlas(
				this.getTextureManager(), 64, 113, TextureOptions.BILINEAR);
		mLetter7TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter7, this,
						"ee.png", 0, 0, 1, 1);
		
		//akar
		mBitmapTextureAtlasLetter8 = new BitmapTextureAtlas(
				this.getTextureManager(), 54, 113, TextureOptions.BILINEAR);
		mLetter8TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasLetter8, this,
						"e.png", 0, 0, 1, 1);

		mAnimatedBitmapTextureAtlas = new BuildableBitmapTextureAtlas(
				this.getTextureManager(), 1200, 200, TextureOptions.NEAREST);
		mParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(this.mAnimatedBitmapTextureAtlas, this,
						"parrot.png", 6, 1);

		try
		{
			this.mAnimatedBitmapTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 0, 0));
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
	}

	@Override
	protected Scene onCreateScene() 
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		mScene.setTouchAreaBindingOnActionDownEnabled(true);

		vertexBufferObjectManager = getVertexBufferObjectManager();

//		letterNumber = 4;     
		
		CreateLetterObjects.createObjects(letterNumber);
		
//		finish();
//		startActivity(new Intent(getBaseContext(), MainActivity.class));
		
		//First letter introduction
		LetterActivity.mScene.registerUpdateHandler(new TimerHandler(1, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				
				playLetterSound(1);
				
				fadeIn(LetterActivity.letter1);
			}
		}));
		
		LetterActivity.mScene.registerUpdateHandler(new TimerHandler(6, new ITimerCallback()
		{ 
			@Override 
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				
				playLetterSound(2);
				
				LetterActivity.letter1.setAlpha((float) 0.3);
				fadeIn(LetterActivity.letter2);
			}
		}));
		
		LetterActivity.mScene.registerUpdateHandler(new TimerHandler(11, new ITimerCallback()
		{ 
			@Override 
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				
				playLetterSound(3);
				
				fadeIn(LetterActivity.letter1);
				Grow(LetterActivity.letter1);
				Grow(LetterActivity.letter2);
				
			}
		}));
		
		LetterActivity.mScene.registerUpdateHandler(new TimerHandler(14, new ITimerCallback()
		{
			@Override 
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				finish();
				startActivity(new Intent(getBaseContext(), TutorialActivity.class));
			}
		}));
		
		return mScene;
	}
	
	public void playLetterSound(int number)
	{
		if(letterNumber==1)
		{
			if(number==1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_t1aa1, R.raw.tgame_t1aa2_4, LetterActivityInstace);
			}
			else if(number==2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_t1a3, R.raw.tgame_t1aa2_4, LetterActivityInstace);
			}
			else if(number==3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1a5, LetterActivityInstace);
			}
		}
		else if(letterNumber==2)
		{
			if(number==1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1uu1, LetterActivityInstace);
			}
			else if(number==2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1u1, LetterActivityInstace);
			}
			else if(number==3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1uu5, LetterActivityInstace);
			}
		}
		//e
		else if(letterNumber==3)
		{
			if(number==1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1ii1, LetterActivityInstace);
			} 
			else if(number==2)
			{ 
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_t1i3, R.raw.tgame_t1ii2_4, LetterActivityInstace);
			}
			else if(number==3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1i5, LetterActivityInstace);
			}
		}
		//aa
		else if(letterNumber==4)
		{
			if(number==1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_t1ee1, R.raw.tgame_t1ee2, LetterActivityInstace);
			}
			else if(number==2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_t1e3, R.raw.tgame_t1ee2, LetterActivityInstace);
			}
			else if(number==3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1e5, LetterActivityInstace);
			}
		}
	}
	
	//first growing and then decrease into normal size
	public static void Grow(final Sprite a)
	{
		
		if(a!=null)
		{
			ScaleModifier yourModifier = new ScaleModifier(1, (float) 1, (float)1.4)
			{
			        @Override
			        protected void onModifierStarted(IEntity pItem)
			        {
			                super.onModifierStarted(pItem);
			        }
			       
			        @Override
			        protected void onModifierFinished(IEntity pItem)
			        {
			                super.onModifierFinished(pItem);
			        }
			};
			a.registerEntityModifier(yourModifier);
			
		}
		
	}

	public static void fadeIn(final Sprite sprite)
	{
		if(sprite!= null)
		{
		AlphaModifier yourModifier = new AlphaModifier(1, (float) 0.3, 1)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		        }
		       
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
}
