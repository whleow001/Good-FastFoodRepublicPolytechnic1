package com.example.goodfastfoodrepublicpolytechnic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StoreDescription extends ListActivity {
	
	String canteenSelected;
	String storeSelected;
	int menuClick;
	int ratingClick;
	int queueClick;
	
	String[] storeInformation = {"Menu","Ratings & Reviews","Get Queue"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_description);
		
		canteenSelected = getIntent().getStringExtra("canteenSelected");
		storeSelected = getIntent().getStringExtra("storeSelected");
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, storeInformation);
		if(canteenSelected != null && storeSelected != null) {
			getListView().setAdapter(arrayAdapter);
		}
		
		//Ratings rating = new Ratings(-1, canteenSelected, storeSelected, "Dummy01", "Default data01", 5);
		//DBHelper dbh = new DBHelper(StoreDescription.this);
		//dbh.insertNote(rating);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		// Intent menu = new Intent(CanteenStores.this, RatingAndReviews.class);

		// menu.putExtra("canteen", canteen);
		// menu.putExtra("store", storeSelected);
		// startActivity(menu);
		if (position == 0) {
			Intent menu = new Intent(StoreDescription.this,
					MenusActivity.class);

			//rating.putExtra("canteen", canteen);
			//rating.putExtra("store", storeSelected);
			//rating.putExtra("canteenSelectedRating", canteenSelected);
			//rating.putExtra("storeSelectedRating", storeSelected);
			startActivity(menu);

		} else if (position == 1) {
			Intent rating = new Intent(StoreDescription.this,
					RatingAndReviews.class);

			//rating.putExtra("canteen", canteen);
			//rating.putExtra("store", storeSelected);
			rating.putExtra("canteenSelectedRating", canteenSelected);
			rating.putExtra("storeSelectedRating", storeSelected);
			startActivity(rating);
		} else {
			Toast.makeText(getApplicationContext(), "Still under construction",
					Toast.LENGTH_LONG).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store_description, menu);
		return true;
	}

}
