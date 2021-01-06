package com.example.goodfastfoodrepublicpolytechnic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FavouriteAdapter extends ArrayAdapter<Favourite> {

	private Favourite[] topFav;
	private Context context;
	private TextView FavouriteName, FavouriteNumber, FavouriteLocation;

	public FavouriteAdapter(Context context, int resource, Favourite[] objects) {
		super(context, resource, objects);

		topFav = objects;

		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.favourite, parent, false);

		FavouriteName = (TextView) rowView.findViewById(R.id.tvNumber1);
		FavouriteNumber = (TextView) rowView.findViewById(R.id.tvName1);
		FavouriteLocation = (TextView) rowView.findViewById(R.id.tvLocation);

		Favourite currentFood = topFav[position];

		FavouriteName.setText(currentFood.getName());
		FavouriteNumber.setText(currentFood.getNumber());
		FavouriteLocation.setText(currentFood.getLocation());
		return rowView;
	}
}
