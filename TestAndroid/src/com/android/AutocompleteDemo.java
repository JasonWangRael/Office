package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutocompleteDemo extends Activity implements TextWatcher {

	TextView selection;
	AutoCompleteTextView edit;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
			"consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis",
			"etiam", "vel", "erat", "placerat", "ante",
			"porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub

	}

	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		selection.setText(edit.getText());

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_autocomplete);
		
		selection = (TextView) findViewById(R.id.selection);
		
		edit = (AutoCompleteTextView) findViewById(R.id.edit);
		edit.addTextChangedListener(this);
		edit.setAdapter(new ArrayAdapter<String>(this, 
							android.R.layout.simple_dropdown_item_1line,
							items));
	}
}
