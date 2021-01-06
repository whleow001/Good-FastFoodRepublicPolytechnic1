package com.example.goodfastfoodrepublicpolytechnic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StoreAdapter extends ArrayAdapter<Store> {

	private Store[] stores;
	private Context context;
	private TextView storeName;

	public StoreAdapter(Context context, int resource, Store[] objects) {
		super(context, resource, objects);

		stores = objects;

		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.canteen, parent, false);

		storeName = (TextView) rowView.findViewById(R.id.canteenName);

		Store currentFood = stores[position];

		storeName.setText(currentFood.getName());
		return rowView;
	}
	
	
}