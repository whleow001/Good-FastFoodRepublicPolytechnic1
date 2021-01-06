package com.example.goodfastfoodrepublicpolytechnic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

@SuppressWarnings("unused")
public class StoreActivity extends ListActivity {

	Store[] northStore;
	Store[] southStore;
	Store[] lawnStore;
	String canteenSelected;
	String storeClicked;
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store);

		northStore = new Store[] { new Store("Fruits and Drink Store"),
				new Store("Mixed Vegetables Rice"),
				new Store("Fishball Noodles"), new Store("Ban Mian"),
				new Store("Western Food"), new Store("Japanese Food"),
				new Store("Nasi Lemak"), new Store("Vegeterian Food"),
				new Store("Indian Food"), new Store("Pizza"),
				new Store("Chicken Rice"), new Store("Malay Food"), };

		lawnStore = new Store[] { new Store("Tea Bar"),
				new Store("The Oven"), new Store("Break time"),
				new Store("Mixed Vegetables"), new Store("Wanton Noodles"),
				new Store("Ban Mian"), new Store("Fish Soup"),
				new Store("Taiwanese cuisine"), new Store("Noodle House"),
				new Store("Thai Food"), new Store("Vegetarian Food"),
				new Store("Chicken Rice"), new Store("Japanese cuisine"),
				new Store("Bakery"), new Store("Indian Muslim Food"),
				new Store("Ayam Penyet"), new Store("Nasi Pandang"),
				new Store("Desserts and Fruit"),
				new Store("Canopy Coffee Club"), new Store("Pi Li Hong"), };

		southStore = new Store[] { new Store("A taste of nanyang 1983"),
				new Store("Beverages"), new Store("Dim Sum"),
				new Store("Fruits"), new Store("Mixed Vegetables"),
				new Store("Yong Tau Foo"), new Store("Chicken Delights"),
				new Store("Ban Mian Fish Soup"),
				new Store("Western Cuisine"), new Store("Snacks"),
				new Store("Korean cuisine"), new Store("Noodles"),
				new Store("Mini Wok"), new Store("Indian Cuisine"),
				new Store("Japanese Cuisine"), new Store("Ayam Penyet"),
				new Store("Nasi Pandang"), };

		canteenSelected = getIntent().getStringExtra("canteen");
		if (canteenSelected != null && canteenSelected.contentEquals("North Canteen")){
			setListAdapter(new StoreAdapter(this, R.layout.store, northStore));
		}
		else if (canteenSelected != null && canteenSelected.contentEquals("South Canteen")){
			setListAdapter(new StoreAdapter(this, R.layout.store, southStore));
		}
		else {
			setListAdapter(new StoreAdapter(this, R.layout.store, lawnStore));
		}

	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Intent i = new Intent(StoreActivity.this, StoreDescription.class);
		if (canteenSelected != null && canteenSelected.contentEquals("North Canteen")){
			storeClicked = northStore[position].getName().toString().trim();
		} else if(canteenSelected != null && canteenSelected.contentEquals("South Canteen")) {
			storeClicked = southStore[position].getName().toString().trim();
		} else {
			storeClicked = lawnStore[position].getName().toString().trim();
		}
		i.putExtra("canteenSelected", canteenSelected);
		i.putExtra("storeSelected", storeClicked);
		startActivity(i);
	}

}
