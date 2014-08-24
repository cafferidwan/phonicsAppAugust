package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.JumpModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import com.example.phonicsapp.R;
import com.example.phonicsapp.tutorialGame.starting.LetterActivity;



public class Letter extends Sprite 
{

	public static int counter;
	
	public Letter(float pX, float pY, 
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

//			this.setScale((float) 1.2);
//			Functions.audioPlay = true;
//			Functions.playAudio(R.raw.mo);
			
			if(!SoundFunction.mediaPlayer.isPlaying() && !SoundFunction.mediaPlayer.isPlaying() 
					&& !SoundFunction.mediaPlayer.isPlaying())
			{
				letterSound(this); 
				
//				counter++;
//				if(counter==1)
//				{
//					Jump(this);
//				}
			}

			break;
		}

		return true;
	}
	
	public static void Jump(final Sprite sprite)
	{
		if(sprite!= null)
		{
		JumpModifier yourModifier = new JumpModifier((float)0.3, sprite.getX(), sprite.getX(), sprite.getY()-50, sprite.getY(), 2)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		                // Your action after starting modifier
		               // sprite.setScale((float) 1.5);
		        }
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		                // Your action after finishing modifier
		                sprite.setScale((float) 1.0);
		                //sprite.setAlpha(1);
		                counter=0;
			     }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
	
	public void letterSound(Sprite a)
	{
		if(LetterActivity.letterNumber == 1)
		{
			//shorea
			if(a == TutorialActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_aa, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_mo, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_mo, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_aa, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_aam, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_ma, TutorialActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				Jump(this);
			}
		}
		//u
		else if(LetterActivity.letterNumber == 2)
		{
			if(a == TutorialActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_uu, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_to, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_chu, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_chu, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_lo, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_ut, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_chul, TutorialActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == TutorialActivity.letter3 )
				{
					Jump(a);
					Jump(TutorialActivity.letter4);
				}
				else if(a == TutorialActivity.letter4 )
				{
					Jump(a);
					Jump(TutorialActivity.letter3);
				}
				else
				{
					Jump(this);
				}
			}
		}
		else if(LetterActivity.letterNumber == 3)
		{
			if(a == TutorialActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_bo, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_ii, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_cha, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_bi, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_bi, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_boi, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_chabi, TutorialActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == TutorialActivity.letter4)
				{
					Jump(a);
					Jump(TutorialActivity.letter5);
				}
				else if(a == TutorialActivity.letter5)
				{
					Jump(a);
					Jump(TutorialActivity.letter4);
				}
				else
				{
					Jump(this);
				}
			}
		}
		else if(LetterActivity.letterNumber == 4)
		{
			if(a == TutorialActivity.letter1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_e, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_ko, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter3)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_be, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter4)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_be, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.letter5)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_lo, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object1)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_ek, TutorialActivity.MainActivityInstace);
			}
			else if(a == TutorialActivity.Object2)
			{
				SoundFunction.audioPlay = true;
				SoundFunction.playAudio(R.raw.tgame_bel, TutorialActivity.MainActivityInstace);
			}
			
			counter++;
			if(counter==1)
			{
				if(a == TutorialActivity.letter3 )
				{
					Jump(a);
					Jump(TutorialActivity.letter4);
				}
				else if(a == TutorialActivity.letter4 )
				{
					Jump(a);
					Jump(TutorialActivity.letter3);
				}
				else
				{
					Jump(this);
				}
			}
		}
	}
};
