package com.example.phonicsapp.tutorialGame.tutorialgame;

import org.andengine.entity.Entity;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;

import com.example.phonicsapp.tutorialGame.tutorial.Parrot;


public class CreateTutorialGameObject 
{
	public static void createObjects(int a)
	{
		TutorialGameActivity.backGround = new Sprite(0, 0, TutorialGameActivity.mbackGroundTextureRegion, TutorialGameActivity.vertexBufferObjectManager);
		TutorialGameActivity.backGround.setHeight(TutorialGameActivity.CAMERA_HEIGHT);
		TutorialGameActivity.backGround.setWidth(TutorialGameActivity.CAMERA_WIDTH);
		TutorialGameActivity.mScene.attachChild(TutorialGameActivity.backGround);
		
		TutorialGameActivity.parrot = new Parrot(TutorialGameActivity.CAMERA_WIDTH, TutorialGameActivity.parrotHeight, TutorialGameActivity.mParrotTextureRegion, TutorialGameActivity.vertexBufferObjectManager);
		TutorialGameActivity.parrot.animate(new long[]{80, 80, 80, 80, 80, 80}, 0, 5, true);
		TutorialGameActivity.parrot.setFlippedHorizontal(true);
		TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.parrot); 
		TutorialGameActivity.mScene.attachChild(TutorialGameActivity.parrot);
		
		if(a==1)
		{
			if(TutorialGameActivity.loadGame==1)
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos , 80, 
						TutorialGameActivity.mLetter4TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40, 280,
						TutorialGameActivity.mLetter3TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			
			}
			else 
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos, 80, 
						TutorialGameActivity.mLetter1TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40, 280,
						TutorialGameActivity.mLetter2TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter1);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter1);
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter2);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter2);
		}
		//u
		else if(a==2)
		{
			//2nd part
			if(TutorialGameActivity.loadGame==1)
			{
			TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40 ,
					80, TutorialGameActivity.mLetter7TextureRegion,
					TutorialGameActivity.vertexBufferObjectManager); 
			
			TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos,
					280, TutorialGameActivity.mLetter8TextureRegion,
					TutorialGameActivity.vertexBufferObjectManager); 
			
			}
			//1st part
			else
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40 ,
						80, TutorialGameActivity.mLetter6TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						280, TutorialGameActivity.mLetter5TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter1);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter1);
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter2);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter2);
		}
			
		else if(a==3)
		{
			//2nd part
			if(TutorialGameActivity.loadGame==1)
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40 ,
						30, TutorialGameActivity.mLetter14TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						170, TutorialGameActivity.mLetter13TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter3 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						310, TutorialGameActivity.mLetter12TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			//1st part
			else
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40 ,
						30, TutorialGameActivity.mLetter10TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						170, TutorialGameActivity.mLetter9TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter3 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						310, TutorialGameActivity.mLetter11TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter1);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter1);
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter2);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter2);

			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter3);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter3);
			
		}
		else if(a==4)
		{
			//2nd part
			if(TutorialGameActivity.loadGame==1)
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40 ,
						80, TutorialGameActivity.mLetter17TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						290, TutorialGameActivity.mLetter18TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			//1st part
			else
			{
				TutorialGameActivity.letter1 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						80, TutorialGameActivity.mLetter16TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
				
				TutorialGameActivity.letter2 = new TutorialGameLetter(TutorialGameActivity.letter1Pos+40,
						290, TutorialGameActivity.mLetter15TextureRegion,
						TutorialGameActivity.vertexBufferObjectManager); 
			}
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter1);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter1);
			
			TutorialGameActivity.mScene.registerTouchArea(TutorialGameActivity.letter2);
			TutorialGameActivity.mScene.attachChild(TutorialGameActivity.letter2);
		}
		
	}
}
