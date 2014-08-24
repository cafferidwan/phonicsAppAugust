package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import com.example.phonicsapp.R;

public class UAnimation 
{
	public static void startUAnimation(int a)
	{
		if(a==1)
		{
			if(TutorialActivity.parrotWay == 13)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2u5, TutorialActivity.MainActivityInstace);
				
				Functions.letter(14, 2, TutorialActivity.letter5, 
						TutorialActivity.letter5.getX(), TutorialActivity.letter5Pos-100,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
			}
			else if(TutorialActivity.parrotWay == 10)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2u4, TutorialActivity.MainActivityInstace);
				
				Functions.letter(11, 2, TutorialActivity.letter4, 
						TutorialActivity.letter4.getX(), TutorialActivity.letter4Pos-65,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
			}
			else if(TutorialActivity.parrotWay == 7)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2u3, TutorialActivity.MainActivityInstace);
				
				Functions.letter(8, 2, TutorialActivity.letter3, 
						TutorialActivity.letter3.getX(), TutorialActivity.letter3Pos+35, 
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5+10);
			}
			else if(TutorialActivity.parrotWay == 4)
			{
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2uu2, TutorialActivity.MainActivityInstace);
				
				Functions.letter(5, 4, TutorialActivity.letter2, 
						TutorialActivity.letter2.getX(), TutorialActivity.letter1.getX()+TutorialActivity.letter1.getWidth(),
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop2(R.raw.tgame_uuanim3, R.raw.tgame_uuanim4, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 1)
			{ 
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2uu1, TutorialActivity.MainActivityInstace);
				
				Functions.letter(2, 2, TutorialActivity.letter1, 
						TutorialActivity.letter1.getX(), TutorialActivity.letter1Pos,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
			}
		}
		
		else if(a==2)
		{
			if(TutorialActivity.parrotWay == 11)
			{
				TutorialActivity.parrot.setFlippedHorizontal(false);
				
				Functions.parrotPath(12, (float) 0.1, 2, TutorialActivity.parrot, 
						TutorialActivity.letter3Pos, -150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
			}
			else if(TutorialActivity.parrotWay == 8)
			{
				Functions.parrotPath(9, (float) 0.1, 2, TutorialActivity.parrot, 
						TutorialActivity.letter3Pos, -150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
			}
			else if(TutorialActivity.parrotWay == 5)
			{
				Functions.parrotPath(6, (float) 2, 2, TutorialActivity.parrot, TutorialActivity.letter2Pos,
						TutorialActivity.CAMERA_WIDTH+150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
				TutorialActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1.5, new ITimerCallback()
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler) 
					{
						// TODO Auto-generated method stub
//						SoundFunction.audioPlay = true;
//						SoundFunction.playAudio(R.raw.uuanim5, MainActivity.MainActivityInstace);
					}
				}));
				
			} 
			else if(TutorialActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.1 , 2, TutorialActivity.parrot, TutorialActivity.letter1Pos,
						-150, 
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
			}
		}
		
		
		else if(a==3)
		{
			if(TutorialActivity.parrotWay == 12)
			{
				Functions.parrotWithLetterPath(13, (float) 0.5,
						1, 2, TutorialActivity.letter5, TutorialActivity.parrot, 
						-150, TutorialActivity.letter5Pos-100, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
				
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.uuanim8, MainActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 0.5,
						1, 2, TutorialActivity.letter4, TutorialActivity.parrot, 
						-150, TutorialActivity.letter4Pos-100, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
				
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.uuanim7, MainActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 0.1,
						0, 2, TutorialActivity.letter3, TutorialActivity.parrot, 
						TutorialActivity.CAMERA_WIDTH+150, TutorialActivity.letter3Pos, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
			} 
			else if(TutorialActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, 3, TutorialActivity.letter2, TutorialActivity.parrot, -150, 
						TutorialActivity.letter2Pos,
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
			}
		}
		
		
		else if(a==4)
		{
			
			if(TutorialActivity.parrotWay == 15)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_uu, TutorialActivity.MainActivityInstace);
				
				Functions.Jump(TutorialActivity.letter1, 16);
			}
			else if(TutorialActivity.parrotWay == 14)
			{
				
				Functions.path(15, TutorialActivity.parrot, 
						TutorialActivity.letter5Pos-100, TutorialActivity.parrotHeight,
						TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight,
						TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight
						);
			}
		}
	}
}
