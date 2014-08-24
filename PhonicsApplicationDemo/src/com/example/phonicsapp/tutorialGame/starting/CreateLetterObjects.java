package com.example.phonicsapp.tutorialGame.starting;

import org.andengine.entity.sprite.Sprite;

import com.example.phonicsapp.tutorialGame.tutorial.Parrot;

public class CreateLetterObjects 
{

	public static void createObjects(int a)
	{
		LetterActivity.backGround = new Sprite(0, 0, LetterActivity.mbackGroundTextureRegion, LetterActivity.vertexBufferObjectManager);
		LetterActivity.backGround.setHeight(LetterActivity.CAMERA_HEIGHT);
		LetterActivity.backGround.setWidth(LetterActivity.CAMERA_WIDTH);
		LetterActivity.mScene.attachChild(LetterActivity.backGround);
		
		LetterActivity.parrot = new Parrot(LetterActivity.CAMERA_WIDTH, LetterActivity.parrotHeight, LetterActivity.mParrotTextureRegion, LetterActivity.vertexBufferObjectManager);
		LetterActivity.parrot.animate(new long[]{80, 80, 80, 80, 80, 80}, 0, 5, true);
		LetterActivity.parrot.setFlippedHorizontal(true);
		LetterActivity.mScene.registerTouchArea(LetterActivity.parrot); 
		LetterActivity.mScene.attachChild(LetterActivity.parrot);
		
		if(a==1)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos , 120, 
					LetterActivity.mLetter1TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos, 120,
					LetterActivity.mLetter2TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		else if(a==2)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter3TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					200, LetterActivity.mLetter4TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		else if(a==3)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter5TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					120, LetterActivity.mLetter6TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		else if(a==4)
		{
			LetterActivity.letter1 = new Sprite(LetterActivity.letter1Pos ,
					120, LetterActivity.mLetter7TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
			
			LetterActivity.letter2 = new Sprite(LetterActivity.letter2Pos,
					120, LetterActivity.mLetter8TextureRegion,
					LetterActivity.vertexBufferObjectManager); 
		}
		
		LetterActivity.mScene.attachChild(LetterActivity.letter1);
		LetterActivity.letter1.setAlpha(0);
		
		LetterActivity.mScene.attachChild(LetterActivity.letter2);
		LetterActivity.letter2.setAlpha(0);
		
 	}
}
