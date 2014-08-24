package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import com.example.phonicsapp.R;

public class EAnimation 
{
	public static void startEAnimation(int a)
	{
		if(a==1)
		{
			if(TutorialActivity.parrotWay == 13)
			{
				Functions.letter(14, 2, TutorialActivity.letter3, 
						TutorialActivity.letter3.getX(), TutorialActivity.letter4.getX()-TutorialActivity.letter3.getWidth(),
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
			
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2i3, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 10)
			{
				Functions.letter(11, 2, TutorialActivity.letter5, 
						TutorialActivity.letter5.getX(), TutorialActivity.letter4.getX()+TutorialActivity.letter4.getWidth()-33,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
				
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2i2, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 7)
			{
				Functions.letter(8, 1, TutorialActivity.letter4, 
						TutorialActivity.letter4.getX(), TutorialActivity.letter4Pos,  
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t2i1, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 4)
			{
				Functions.letter(5, (float)1.5, TutorialActivity.letter1, 
						TutorialActivity.letter1.getX(), TutorialActivity.letter2.getX()-TutorialActivity.letter1.getWidth(),
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
			}
			else if(TutorialActivity.parrotWay == 1)
			{ 
				Functions.letter(2, 1, TutorialActivity.letter2, 
						TutorialActivity.letter2.getX(), TutorialActivity.letter2Pos-20,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
			}
		}
		
		else if(a==2)
		{
			if(TutorialActivity.parrotWay == 11)
			{
				TutorialActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback() 
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub
						
						TutorialActivity.parrot.setFlippedHorizontal(false);
						
						Functions.parrotPath(12, (float) 0.1, 2, TutorialActivity.parrot, 
								TutorialActivity.letter3Pos, -150,
								TutorialActivity.parrotHeight,
								TutorialActivity.parrotHeight
								);
					}
				}));
				
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
				Functions.parrotPath(6, (float) 3.5, 4, TutorialActivity.parrot, TutorialActivity.letter1Pos,
						TutorialActivity.CAMERA_WIDTH+150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
			} 
			else if(TutorialActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.1 , 2, TutorialActivity.parrot, 
						TutorialActivity.letter2Pos, -150, 
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
						1, 2, TutorialActivity.letter3, TutorialActivity.parrot, 
						-150, TutorialActivity.letter3Pos-100, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
			}
			else if(TutorialActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 1,
						1, 2, TutorialActivity.letter5, TutorialActivity.parrot, 
						-150, TutorialActivity.letter4Pos-100, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
			}
			else if(TutorialActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 5,  
						0, 2, TutorialActivity.letter4, TutorialActivity.parrot, 
						TutorialActivity.CAMERA_WIDTH+150, TutorialActivity.letter3Pos, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t1i1, TutorialActivity.MainActivityInstace);
			} 
			else if(TutorialActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, (float)1.5, TutorialActivity.letter1, TutorialActivity.parrot, 
						-150, TutorialActivity.letter1Pos,
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
				
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t2ii1, TutorialActivity.MainActivityInstace);
			}
		}
		
		
		else if(a==4)
		{
			
			if(TutorialActivity.parrotWay == 18)
			{
				TutorialActivity.mScene.registerUpdateHandler(new TimerHandler(5, new ITimerCallback() 
				{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub
						
						SoundFunction.audioPlay = true; 
						SoundFunction.playAudio(R.raw.tgame_bo, TutorialActivity.MainActivityInstace);
						
						Functions.Jump(TutorialActivity.letter1, 19);
					}
				}));
				
			}
			else if(TutorialActivity.parrotWay == 14)
			{
				
				Functions.path(18, TutorialActivity.parrot, 
						TutorialActivity.letter3Pos-100, TutorialActivity.parrotHeight,
						TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight,
						TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight 
						);
//				SoundFunction.audioPlay = true;
//				SoundFunction.playAudio(R.raw.seven);
			} 
		}
	}
}
