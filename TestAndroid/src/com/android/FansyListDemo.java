package com.android;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FansyListDemo extends ListActivity {

	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
			"consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis",
			"etiam", "vel", "erat", "placerat", "ante",
			"porttitor", "sodales", "pellentesque", "augue",
			"purus"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_fancylist);
		
		// static
		//setListAdapter(new ArrayAdapter<String>(this, R.layout.row, R.id.label, items));
		
		//dynamic
		setListAdapter(new IconicAdapter());
		
		selection = (TextView) findViewById(R.id.selection);
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		selection.setText(items[position]);
	}
	
	class IconicAdapter extends ArrayAdapter {
		
		IconicAdapter() {
			super(FansyListDemo.this, R.layout.row, items);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View row = convertView;
			ViewWrapper wrapper = null;
			
			if(row == null) {
				LayoutInflater inflater = getLayoutInflater();
				row = inflater.inflate(R.layout.row, parent, false);
				wrapper = new ViewWrapper(row);
				row.setTag(wrapper);
			}
			else
				wrapper = (ViewWrapper) row.getTag();
			
			//TextView label = (TextView) row.findViewById(R.id.label);
			//label.setText(items[position]);
			wrapper.getLabel().setText(getModel(position));
			
			/*ImageView icon = (ImageView) row.findViewById(R.id.icon);
			if(items[position].length() > 4)
				icon.setImageResource(R.drawable.delete);
			else
				icon.setImageResource(R.drawable.ok);*/
			
			if(getModel(position).length() > 4) {
				wrapper.getIcon().setImageResource(R.drawable.delete);
			}
			else {
				wrapper.getIcon().setImageResource(R.drawable.ok);
			}
			
			return row;
		}
		
		
	}

	public String getModel(int position) {
		return ((IconicAdapter)getListAdapter()).getItem(position).toString();
	}
}
