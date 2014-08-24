package com.example.phonicsapp.tutorialGame.tutorial;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.modifier.IModifier;


public class Parrot extends AnimatedSprite 
{

	public Parrot(float pX, float pY, 
			ITiledTextureRegion pTiledTextureRegion,
			VertexBufferObjectManager vertexBufferObjectManager) 
	{
		super(pX, pY,  pTiledTextureRegion,
				vertexBufferObjectManager);
		// TODO Auto-generated constructor stub
	}
		@Override
		public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
		{
			switch (pSceneTouchEvent.getAction()) 
			{
				case TouchEvent.ACTION_DOWN:
				
					this.setScale((float) 1.2);
					
					
				break;
				
				case TouchEvent.ACTION_UP:
					
					this.setScale((float) 1.0);
					
				break;
			}

			return true;
		}

}
