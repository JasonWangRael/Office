package com.android;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class RateViewWrapper {

	View base;
	RatingBar rate = null;
	TextView label = null;
	
	public RateViewWrapper(View base) {
		this.base = base;
	}

	public RatingBar getRate() {
		if(rate == null)
			rate = (RatingBar) base.findViewById(R.id.rate);
		
		return rate;
	}

	public TextView getLabel() {
		if(label == null)
			label = (TextView) base.findViewById(R.id.label);
		
		return label;
	}
	
	
}
