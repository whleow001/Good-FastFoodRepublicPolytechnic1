package com.example.goodfastfoodrepublicpolytechnic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MenusAdapter extends ArrayAdapter<Menus> {

	private Menus[] menus;
	private Context context;
	private TextView tvName, tvPrice;

	public MenusAdapter(Context context, int resource, Menus[] objects) {
		super(context, resource, objects);

		menus = objects;

		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.menus, parent, false);

		tvName = (TextView) rowView.findViewById(R.id.textViewFoodName);
		tvPrice = (TextView) rowView.findViewById(R.id.textViewFoodPrice);

		Menus currentMenu = menus[position];

		tvName.setText(currentMenu.getFood());
		tvPrice.setText(currentMenu.getMoney());
		return rowView;
	}

}
