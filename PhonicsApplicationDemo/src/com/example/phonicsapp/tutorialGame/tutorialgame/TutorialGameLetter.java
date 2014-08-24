package com.example.phonicsapp.tutorialGame.tutorialgame;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import com.example.phonicsapp.GameMainPage;
import com.example.phonicsapp.R;
import com.example.phonicsapp.tutorialGame.starting.LetterActivity;
import com.example.phonicsapp.tutorialGame.tutorial.SoundFunction;

import android.content.Intent;
import android.os.Debug;
import android.sax.StartElementListener;
import android.util.Log;

public class TutorialGameLetter extends Sprite 
{
	
	public TutorialGameLetter(float pX, float pY, 
			ITextureRegion pTextureRegion, VertexBufferObjectManager VertexBufferObject) 
	{
		super(pX, pY, pTextureRegion, VertexBufferObject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
			final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
	{
		switch (pSceneTouchEvent.getAction()) 
		{
		case TouchEvent.ACTION_DOWN:

			if(TutorialGameActivity.touchEnable == true)
			{
				if(SoundFunction.mediaPlayer.isPlaying()==false && 
						SoundFunction.mediaPlayer1.isPlaying()==false &&
						SoundFunction.mediaPlayer2.isPlaying()==false)
				{
					letterTouch();
				}
			}
			
			break;
		case TouchEvent.ACTION_UP:
				
			if(TutorialGameActivity.letter1!=null)
			{
				TutorialGameActivity.letter1.setScale((float) 1.0);
			}
			if(TutorialGameActivity.letter2!=null)
			{
				TutorialGameActivity.letter2.setScale((float) 1.0);
			}
			if(TutorialGameActivity.letter3!=null)
			{
				TutorialGameActivity.letter3.setScale((float) 1.0);
			}
			
			break;
		}

		return true;
	}
	
	
	public void letterTouch()
	{
		//shorea 1st part
		if(LetterActivity.letterNumber == 1 && TutorialGameActivity.loadGame != 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
						
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3aa4, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
			else if(TutorialGameActivity.letter2==this)
			{
					TutorialGameActivity.letter2.setScale(2);
					
					SoundFunction.audioPlay = true;
					SoundFunction.playAudio(R.raw.tgame_t3aa3, TutorialGameActivity.ActivityInstace);
			}
		}
		//shorea 2nd part
		else if(LetterActivity.letterNumber == 1 && TutorialGameActivity.loadGame == 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3a7, TutorialGameActivity.ActivityInstace);
				
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3a8, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
		}
		
		//u 1st part
		else if(LetterActivity.letterNumber == 2 && TutorialGameActivity.loadGame != 1)
		{
			if(TutorialGameActivity.letter1==this)
			{ 
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3uu3, TutorialGameActivity.ActivityInstace);
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3uu2, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
		}
		//u 2nd part
		else if(LetterActivity.letterNumber == 2 && TutorialGameActivity.loadGame == 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3u8, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
				
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3u7, TutorialGameActivity.ActivityInstace);
			}
		}
		
		//e 1st part
		else if(LetterActivity.letterNumber == 3 && TutorialGameActivity.loadGame != 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3ii3, TutorialGameActivity.ActivityInstace);
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3ii5, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
			else if(TutorialGameActivity.letter3==this)
			{
				TutorialGameActivity.letter3.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3ii4, TutorialGameActivity.ActivityInstace);
			}
		}
		//e 2nd part
		else if(LetterActivity.letterNumber == 3 && TutorialGameActivity.loadGame == 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3i8, TutorialGameActivity.ActivityInstace);
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3i9, TutorialGameActivity.ActivityInstace);
				
			}
			else if(TutorialGameActivity.letter3==this)
			{
				TutorialGameActivity.letter3.setScale(2);
			
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3i10, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
		}
		
		//aa 1st part
		else if(LetterActivity.letterNumber == 4 && TutorialGameActivity.loadGame != 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3ee3, TutorialGameActivity.ActivityInstace);
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3ee4, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
			}
		}
		//aa 2nd part
		else if(LetterActivity.letterNumber == 4 && TutorialGameActivity.loadGame == 1)
		{
			if(TutorialGameActivity.letter1==this)
			{
				TutorialGameActivity.letter1.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3e8, TutorialGameActivity.ActivityInstace);
				
				//start next activity
				setStart();
				
			}
			else if(TutorialGameActivity.letter2==this)
			{
				TutorialGameActivity.letter2.setScale(2);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t3e7, TutorialGameActivity.ActivityInstace);
			}
		}
	}
	
	public void setStart()
	{
		//unregister touch
		if(TutorialGameActivity.letter1 != null)
		{
			TutorialGameActivity.mScene.unregisterTouchArea(TutorialGameActivity.letter1);
		}
		if(TutorialGameActivity.letter1 != null)
		{
			TutorialGameActivity.mScene.unregisterTouchArea(TutorialGameActivity.letter2);
		}
		if(TutorialGameActivity.letter1 != null)
		{
			TutorialGameActivity.mScene.unregisterTouchArea(TutorialGameActivity.letter3);
		}

		
		if(TutorialGameActivity.loadGame==1)
		{
			TutorialGameActivity.loadGame = 0;
			TutorialGameActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback()
			{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler) 
				{
					// TODO Auto-generated method stub
					TutorialGameActivity.ActivityInstace.finish();
					//Call next game from here
					TutorialGameActivity.ActivityInstace.startActivity(
								new Intent(TutorialGameActivity.ActivityInstace.getBaseContext(), 
										GameMainPage.class));
				}
			}));
		}
		else 
		{
			TutorialGameActivity.loadGame = 1;
			TutorialGameActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback()
			{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler) 
				{
					// TODO Auto-generated method stub
					TutorialGameActivity.ActivityInstace.finish();
					
						TutorialGameActivity.ActivityInstace.startActivity(
								new Intent(TutorialGameActivity.ActivityInstace.getBaseContext(), 
										TutorialGameActivity.class));
				}
			}));
		}
		
	}

	
};
