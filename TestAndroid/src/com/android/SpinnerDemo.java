package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerDemo extends Activity 
	implements OnItemSelectedListener{

	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
			"consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis",
			"etiam", "vel", "erat", "placerat", "ante",
			"porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	public void onItemSelected(AdapterView<?> paramAdapterView, View paramView,
			int paramInt, long paramLong) {
		selection.setText(items[paramInt]);
		
	}

	public void onNothingSelected(AdapterView<?> paramAdapterView) {
		selection.setText("");
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_spinner);
		
		selection = (TextView) findViewById(R.id.selection);
		Spinner spin = (Spinner) findViewById(R.id.spinner);
		spin.setOnItemSelectedListener(this);
		
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this, 
				android.R.layout.simple_spinner_item,
				items);
		aa.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(aa);
	}
}
