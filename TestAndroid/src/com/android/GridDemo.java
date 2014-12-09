package com.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class GridDemo extends Activity implements OnItemSelectedListener {

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
		
		setContentView(R.layout.main_grid);
		
		selection = (TextView) findViewById(R.id.selection);
		GridView g = (GridView) findViewById(R.id.grid);
		g.setAdapter(new FunnyLookingAdapter(this, 
						android.R.layout.simple_list_item_2, items));
		g.setOnItemSelectedListener(this);
	}
	
	private class FunnyLookingAdapter extends ArrayAdapter {

		Context ctxt;
		
		FunnyLookingAdapter(Context context, int resource,
				String[] objects) {
			super(context, resource, objects);
			this.ctxt = context;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null) {
				convertView = new TextView(ctxt);
			}
			
			TextView label = (TextView) convertView;
			
			label.setText(items[position]);
			
			return convertView;
		}	
	}
}
