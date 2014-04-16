package com.android;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewDemo extends android.app.ListActivity {

	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
			"consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis",
			"etiam", "vel", "erat", "placerat", "ante",
			"porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_list);
		setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_multiple_choice,
				items));
		getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		
		selection = (TextView) findViewById(R.id.selection);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, position);
		String text = "";
		for (int i = 0; i < l.getCheckedItemPositions().size(); i++) {
			if(l.getCheckedItemPositions().valueAt(i))
				text += "+" + items[i];
		}
		if(text.length() > 0)
			text = text.substring(1);
		selection.setText(text);
	}
}
