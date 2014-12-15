package com.android;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ClockDemo extends Activity {

	Chronometer chronometer;
	long count;
	long startBase = SystemClock.elapsedRealtime();
	DateFormat fmt = SimpleDateFormat.getTimeInstance();
	
	Logger log = Logger.getLogger(getClass().getName());
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_clock);

		count = 0;
		
		chronometer = (Chronometer) findViewById(R.id.chronometer);
		
		Button btn = (Button) findViewById(R.id.btn_start);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				String s = chronometer.getText().toString();
				try {
					count = fmt.parse(s).getTime();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				chronometer.start();				
			}
		});
		
		btn = (Button) findViewById(R.id.btn_stop);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				chronometer.stop();				
			}
		});
		
		btn = (Button) findViewById(R.id.btn_reset);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				chronometer.setBase( SystemClock.elapsedRealtime());
				
			}
		});
	}

	
}
