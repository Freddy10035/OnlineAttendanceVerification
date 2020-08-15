package com.dream.freddie.onlineattendanceverification.activity;

import java.util.ArrayList;

import com.dream.freddie.onlineattendanceverification.R;
import com.dream.freddie.onlineattendanceverification.bean.AttendanceBean;
import com.dream.freddie.onlineattendanceverification.context.ApplicationContext;
import com.dream.freddie.onlineattendanceverification.db.DBAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {

	Button addStudent;
	Button addFaculty;
	Button viewStudent;
	Button viewFaculty;
	Button logout;
	Button attendancePerStudent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		addStudent = findViewById(R.id.buttonaddstudent);
		addFaculty = findViewById(R.id.buttonaddfaculty);
		viewStudent = findViewById(R.id.buttonViewstudent);
		viewFaculty = findViewById(R.id.buttonviewfaculty);
		logout = findViewById(R.id.buttonlogout);
		attendancePerStudent= findViewById(R.id.attendancePerStudentButton);
		
		addStudent.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MenuActivity.this,AddStudentActivity.class);
				startActivity(intent);
			}
		});
		
		addFaculty.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MenuActivity.this,AddFacultyActivity.class);
				startActivity(intent);
			}
		});
		
		viewFaculty.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MenuActivity.this,ViewFacultyActivity.class);
				startActivity(intent);
			}
		});


		viewStudent.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MenuActivity.this,ViewStudentActivity.class);
				startActivity(intent);
			}
		});
		logout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent =new Intent(MenuActivity.this,MainActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});

		attendancePerStudent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				DBAdapter dbAdapter;
                dbAdapter = new DBAdapter(MenuActivity.this);

                ArrayList<AttendanceBean> attendanceBeanList;
                attendanceBeanList = dbAdapter.getAllAttendanceByStudent();
                ((ApplicationContext)MenuActivity.this.getApplicationContext()).setAttendanceBeanList(attendanceBeanList);
				Intent intent;
                intent = new Intent(MenuActivity.this,ViewAttendancePerStudentActivity.class);
                startActivity(intent);
				
			}
		});
		

	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
