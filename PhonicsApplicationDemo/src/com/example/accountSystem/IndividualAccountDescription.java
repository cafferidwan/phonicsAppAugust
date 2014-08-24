package com.example.accountSystem;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phonicsapp.R;

public class IndividualAccountDescription extends Activity 
{


	ImageView accountImage;
	TextView accountId;

	ListView list;
	String[] text1 = new String[4];
	String[] text2 = new String[4]; 
	
	public File acoountImageFile;
	public Bitmap accountPicture;
	public static int accountNumber;
	
	public static int number;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_description);
		
		accountImage = (ImageView) findViewById(R.id.imageView1);
		accountId = (TextView) findViewById(R.id.tv1);
		String s = AdminPanel.currentAccount;
		char s2 = s.charAt(s.length() - 1);
		accountId.setText(s);
		
		text1[0]="Letters";
		text1[1]="Correctness";
		text1[2]="Stickers";
		text1[3]="Hand Writing";
		
		if(s2=='a')
		{
			accountNumber=0;
			
			number = loadSavedPreferences("0");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		else if(s2=='b')
		{
			accountNumber=1;
			
			number = loadSavedPreferences("1");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		else if(s2=='c')
		{
			accountNumber=2;
			
			number = loadSavedPreferences("2");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		else if(s2=='d')
		{
			accountNumber=3;
			
			number = loadSavedPreferences("3");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		else if(s2=='e')
		{
			accountNumber=4;
			
			number = loadSavedPreferences("4");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		else if(s2=='f')
		{
			accountNumber=5;
			
			number = loadSavedPreferences("5");
			
			if(number>=5 && number<11)
			{
				number = number-1;
			}
			else if(number>=11 && number<17)
			{
				number = number-2;
			}
			else if(number>=17 && number<=23)
			{
				number = number-3;
			}
			
			text2[0]= loadLetters(number);
			text2[1]="b";
			text2[2]="c";
			text2[3]="d";
		}
		
			
		loadingAccountImage(accountNumber);
		
		CustomList adapter = new CustomList(IndividualAccountDescription.this, text1, text2);
		list=(ListView)findViewById(R.id.list_id);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{
		       @Override
		       public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
		       {
		              Toast.makeText(IndividualAccountDescription.this, 
		                    "You Clicked at " +text2[+ position], Toast.LENGTH_SHORT).show();
		              
		              if(position==3)
		              {
		            	  finish();
			              startActivity(new Intent(getBaseContext(), HandWritingMain.class));
		              }
		              
		       }
		});
		
	}
	
	public int loadSavedPreferences(String key)
	{
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		return sharedPreferences.getInt(key, 0);
	}
	
	public void loadingAccountImage(int accountNumber)
	{
		acoountImageFile = new  File("/sdcard/PhonicsApp/AccountPic/"+accountNumber+".jpg");
		//if the camera snap shot image file exists, then load the snap shot
		if(acoountImageFile.exists())
		{
				
			Bitmap scaled = BitmapFactory.decodeFile(acoountImageFile.getAbsolutePath());
			accountPicture =  Bitmap.createScaledBitmap(scaled, 50,
					50, false);
				
		}
		//else load the default image   
		else
		{
			Bitmap b=BitmapFactory.decodeResource(getResources(),R.drawable.images);
			accountPicture = Bitmap.createScaledBitmap(b, 50,
					50, false);
		}  
		
		accountImage.setImageBitmap(accountPicture);
	}
	
	
	public String loadLetters(int a)
	{
		String b = null;
		
		if(a==0)
		{
			b="ম";
		}
		else if(a==1)
		{
			b="আ";
		}
		else if(a==2)
		{
			b="ল";
		}
		else if(a==3)
		{
			b="ক";
		}
		else if(a==4)
		{
			b="ত";
		}
		else if(a==5)
		{
			b="ব";
		}
		else if(a==6)
		{
			b="ন";
		}
		else if(a==7)
		{
			b="চ";
		}
		else if(a==8)
		{
			b="ই";
		}
		else if(a==9)
		{
			b="প";
		}
		else if(a==10)
		{
			b="র";
		}
		else if(a==11)
		{
			b="শ";
		}
		else if(a==12)
		{
			b="ড";
		}
		else if(a==13)
		{
			b="এ";
		}
		else if(a==14)
		{
			b="দ";
		}
		else if(a==15)
		{
			b="ট";
		}
		else if(a==16)
		{
			b="খ";
		}
		else if(a==17)
		{
			b="উ";
		}
		else if(a==18)
		{
			b="গ";
		}
		else if(a==19)
		{
			b="হ";
		}
		else
		{
			b="All completed";
		}
		
		return b;
	}

}