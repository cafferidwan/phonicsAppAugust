package com.example.phonicsapp.tutorialGame.tutorial;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SoundFunction
{

	public static Boolean audioPlay = false;
	public static MediaPlayer mediaPlayer = new MediaPlayer();
	public static MediaPlayer mediaPlayer1 = new MediaPlayer();
	public static MediaPlayer mediaPlayer2 = new MediaPlayer();

	//Audio play Function
	public static void playAudio(int val, Context c)
	{
		if(audioPlay)
		{
			if(!mediaPlayer.isPlaying())
			{
				mediaPlayer.reset();
				mediaPlayer = MediaPlayer.create(c, val);
				
				try 
				{
					mediaPlayer.start();
					mediaPlayer.setLooping(false);
				} 
				catch (IllegalStateException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			audioPlay = true;
		}
	}
	
	// Audio play Function//not needed
	public static void playAudioAnotherOne(int val, Context c)
	{
		if (audioPlay) 
		{
			if (!mediaPlayer.isPlaying() && !mediaPlayer1.isPlaying()) 
			{
				mediaPlayer.reset();
				mediaPlayer = MediaPlayer.create(c, val);

				try
				{
					mediaPlayer.start();
					mediaPlayer.setLooping(false);
					mediaPlayer.setOnCompletionListener(new OnCompletionListener()
					{
						@Override
						public void onCompletion(MediaPlayer mp) 
						{
							mediaPlayer.stop();
						}
					});
				}
				catch (IllegalStateException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			audioPlay = true;
		}
	}

	// Audio play Function
	public static void playAudioLoop2(int val, int val1, Context c) 
	{
		if (audioPlay)
		{ 
			if (!mediaPlayer.isPlaying() && !mediaPlayer1.isPlaying())
			{
				mediaPlayer.reset();
				mediaPlayer1.reset();
				mediaPlayer = MediaPlayer.create(c, val);
				mediaPlayer1 = MediaPlayer.create(c, val1);

				try 
				{
					mediaPlayer.start();
					mediaPlayer.setLooping(false);
					mediaPlayer.setOnCompletionListener(new OnCompletionListener()
							{
								@Override
								public void onCompletion(MediaPlayer mp) 
								{
									mediaPlayer.stop();
									mediaPlayer1.start();
									mediaPlayer1.setLooping(false);
								}
							});
					mediaPlayer1.setOnCompletionListener(new OnCompletionListener() 
							{
								@Override
								public void onCompletion(MediaPlayer mp)
								{
									mediaPlayer1.stop();
								}
							});

				} 
				catch (IllegalStateException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			audioPlay = true;
		}
	}

	// Audio play Function
	public static void playAudioLoop3(int val, int val1, int val2, Context c) 
	{
		if (audioPlay)
		{
			if (!mediaPlayer.isPlaying() && !mediaPlayer1.isPlaying() && !mediaPlayer2.isPlaying())
			{
				mediaPlayer.reset();
				mediaPlayer1.reset();
				mediaPlayer2.reset();
				mediaPlayer = MediaPlayer.create(c, val);
				mediaPlayer1 = MediaPlayer.create(c, val1);
				mediaPlayer2 = MediaPlayer.create(c, val2);

				try
				{
					mediaPlayer.start();
					mediaPlayer.setLooping(false);
					mediaPlayer.setOnCompletionListener(new OnCompletionListener() 
							{
								@Override
								public void onCompletion(MediaPlayer mp)
								{
									mediaPlayer.stop();
									mediaPlayer1.start();
									mediaPlayer1.setLooping(false);
								}
							});
					mediaPlayer1.setOnCompletionListener(new OnCompletionListener()
							{
								@Override
								public void onCompletion(MediaPlayer mp)
								{
									mediaPlayer1.stop();
									mediaPlayer2.start();
									mediaPlayer2.setLooping(false);
								}
							});
					mediaPlayer2.setOnCompletionListener(new OnCompletionListener()
					{
								@Override
								public void onCompletion(MediaPlayer mp) 
								{
									mediaPlayer2.stop();
								}
							});

				} 
				catch (IllegalStateException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			audioPlay = true;
		}
	}
}
