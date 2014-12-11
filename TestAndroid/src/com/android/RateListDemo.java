package com.android;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class RateListDemo extends ListActivity {
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
			"consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis",
			"etiam", "vel", "erat", "placerat", "ante",
			"porttitor", "sodales", "pellentesque", "augue",
			"purus"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ArrayList<RowModel> list = new ArrayList<RowModel>();
		
		for(String s : items){
			list.add(new RowModel(s));
		}
		
		setListAdapter(new RatingAdapter(list));
	}
	
	private RowModel getModel(int position){
		return ((RatingAdapter)getListAdapter()).getItem(position);
	}
	
	class RatingAdapter extends ArrayAdapter<RowModel>{

		RatingAdapter(ArrayList<RowModel> list) {
			super(RateListDemo.this, R.layout.rate_row, list);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View row = convertView;
			RateViewWrapper wrapper;
			RatingBar rate;
			
			if(row == null){
				LayoutInflater inflater = getLayoutInflater();
				
				row = inflater.inflate(R.layout.rate_row, parent, false);
				wrapper = new RateViewWrapper(row);
				row.setTag(wrapper);
				rate = wrapper.getRate();
				
				RatingBar.OnRatingBarChangeListener l =
						new RatingBar.OnRatingBarChangeListener() {
							
							public void onRatingChanged(RatingBar ratingBar, float rating,
									boolean fromUser) {
								Integer myPosition = (Integer) ratingBar.getTag();
								RowModel model = getModel(myPosition);
								
								model.rating = rating;
								
								LinearLayout parent = (LinearLayout) ratingBar.getParent();
								TextView label = (TextView) parent.findViewById(R.id.label);
								label.setText(model.toString());
								
							}
						};
				rate.setOnRatingBarChangeListener(l);
			}
			else{
				wrapper = (RateViewWrapper) row.getTag();
				rate = wrapper.getRate();
			}
			
			RowModel model = getModel(position);
			
			wrapper.getLabel().setText(model.toString());
			rate.setTag(new Integer(position));
			rate.setRating(model.rating);
			
			return row;
		}
		
		
		
	}
	
	class RowModel {
		String label;
		float rating = 2.0f;
		
		RowModel(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			if(rating >= 3.0)
				return label.toUpperCase();
			
			return label;
		}
		
		
	}
}
