package com.android;

import java.text.DateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class ChronoDemo extends Activity {

	DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();
	TextView dateAndTimeLabel;
	Calendar dateAndTime = Calendar.getInstance();
	
	DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
		
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			dateAndTime.set(Calendar.YEAR, year);
			dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
			dateAndTime.set(Calendar.MONTH, monthOfYear);
			updateLabel();
			
		}

	};
	
	TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
		
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
			dateAndTime.set(Calendar.MINUTE, minute);
			updateLabel();
			
		}
	};
	
	private void updateLabel() {
		dateAndTimeLabel.setText(fmtDateAndTime.format(dateAndTime.getTime()));
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_datetime);
		
		Button btn = (Button) findViewById(R.id.btn_setdate);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				new DatePickerDialog(ChronoDemo.this, 
						d, 
						dateAndTime.get(Calendar.YEAR), 
						dateAndTime.get(Calendar.MONTH), 
						dateAndTime.get(Calendar.DAY_OF_MONTH)).show();
				
			}
		});
		
		btn = (Button) findViewById(R.id.btn_settime);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				new TimePickerDialog(ChronoDemo.this, t, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
				
			}
		});
		
		dateAndTimeLabel = (TextView) findViewById(R.id.tx_date_time);
		updateLabel();
	}
	
	
}
