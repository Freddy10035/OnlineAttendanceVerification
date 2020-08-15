package com.dream.freddie.onlineattendanceverification.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.dream.freddie.onlineattendanceverification.R;

public class MainActivity extends Activity {

	Button start;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start =(Button)findViewById(R.id.buttonstart);
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MainActivity.this,LoginActivity.class);
				startActivity(intent);
			}
		});



	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		//getMenuInflater().inflate(R.menu.main, menu);
//		getMenuInflater().inflate(R.menu.main,menu);
//		return true;
//	}

}
