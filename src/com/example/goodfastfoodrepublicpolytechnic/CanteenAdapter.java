package com.example.goodfastfoodrepublicpolytechnic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CanteenAdapter extends ArrayAdapter<Canteen> {

	private Canteen[] canteen;
	private Context context;
	private TextView storeName;

	public CanteenAdapter(Context context, int resource, Canteen[] objects) {
		super(context, resource, objects);

		canteen = objects;

		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.store, parent, false);

		storeName = (TextView) rowView.findViewById(R.id.storeName);

		Canteen currentFood = canteen[position];

		storeName.setText(currentFood.getName());
		return rowView;
	}

	
}
