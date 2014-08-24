package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

import com.example.phonicsapp.R;


public class AAnimation 
{
	//animation for shorea
	public static void startAAnimation(int a)
	{
		if(a==1)
		{
			if(TutorialActivity.parrotWay == 10)
			{
				Functions.letter(11, 1, TutorialActivity.letter3, 
						TutorialActivity.letter3.getX(), TutorialActivity.letter4.getX()-TutorialActivity.letter3.getWidth(),
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
			
				//6
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t2a4, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 7)
			{
				Functions.letter(8, 2, TutorialActivity.letter4,
						TutorialActivity.letter4.getX(), TutorialActivity.letter4Pos,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5-100);
			
			}
			else if(TutorialActivity.parrotWay == 4)
			{
				Functions.letter(5, 1, TutorialActivity.letter2, TutorialActivity.letter2.getX(), 
						TutorialActivity.letter1Pos+TutorialActivity.letter1.getWidth(),
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
				
				//4
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_t2aa2, TutorialActivity.MainActivityInstace);
			}
			else if(TutorialActivity.parrotWay == 1)
			{ 
				Functions.letter(2, 1, TutorialActivity.letter1, TutorialActivity.letter1.getX(), 
						TutorialActivity.letter1Pos,
						TutorialActivity.CAMERA_HEIGHT / 2 -30, 
						TutorialActivity.CAMERA_HEIGHT-TutorialActivity.CAMERA_HEIGHT/5 - 100);
			
				//3
				SoundFunction.audioPlay = true; 
				SoundFunction.playAudio(R.raw.tgame_t2aa1, TutorialActivity.MainActivityInstace);
			}
		
		}
		
		
		else if(a==2)
		{
			//ends here
			if(TutorialActivity.parrotWay == 11)
			{
				TutorialActivity.mScene.registerUpdateHandler(new TimerHandler(3, new ITimerCallback()
				{
					
					@Override
					public void onTimePassed(TimerHandler pTimerHandler) 
					{
						// TODO Auto-generated method stub
						Functions.path(12, TutorialActivity.parrot, 
								TutorialActivity.letter3Pos, TutorialActivity.parrotHeight,
								TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight,
								TutorialActivity.CAMERA_WIDTH+100, TutorialActivity.parrotHeight
			 					);  
					}
				}));
				
			}
			else if(TutorialActivity.parrotWay == 8)
			{
				Functions.parrotPath(9, (float) 0.1, 2, TutorialActivity.parrot, 
						TutorialActivity.letter4Pos, -150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
				
			}
			else if(TutorialActivity.parrotWay == 5)
			{
				Functions.parrotPath(6, (float) 0.5, 5, TutorialActivity.parrot, 
						TutorialActivity.letter2Pos,
						TutorialActivity.CAMERA_WIDTH+150,
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
				
			} 
			else if(TutorialActivity.parrotWay == 2)
			{
				Functions.parrotPath(3, (float) 0.0 , 2, TutorialActivity.parrot, TutorialActivity.letter1Pos,
						-150, 
						TutorialActivity.parrotHeight,
						TutorialActivity.parrotHeight
						);
			}
		}
		
		
		else if(a==3)
		{
			if(TutorialActivity.parrotWay == 9)
			{
				Functions.parrotWithLetterPath(10, (float) 0.5,
						1, 2, TutorialActivity.letter3, TutorialActivity.parrot, -150, 
						TutorialActivity.letter3Pos, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);

			}
			else if(TutorialActivity.parrotWay == 6)
			{
			
				Functions.parrotWithLetterPath(7, (float) 0.1,
						0, 2, TutorialActivity.letter4, TutorialActivity.parrot, 
						TutorialActivity.CAMERA_WIDTH+150, TutorialActivity.letter4Pos, 
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
				
				//5
				SoundFunction.audioPlay = true;
				SoundFunction.playAudioLoop3(R.raw.tgame_t1e3, R.raw.tgame_t1aa2_4, R.raw.tgame_t2a3, TutorialActivity.MainActivityInstace);
			} 
			else if(TutorialActivity.parrotWay == 3)
			{
				Functions.parrotWithLetterPath(4, (float) 0.1,
						1, 3, TutorialActivity.letter2,TutorialActivity.parrot, 
						-150, TutorialActivity.letter2Pos,
						TutorialActivity.parrotHeight, TutorialActivity.parrotHeight);
			}
		}
		
		
		else if(a==4)
		{

			if(TutorialActivity.parrotWay == 12)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_aa, TutorialActivity.MainActivityInstace); 
				
				Functions.Jump(TutorialActivity.letter1, 13);
			}
		}
		
		
	}
	
}
