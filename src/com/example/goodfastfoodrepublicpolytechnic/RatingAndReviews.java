package com.example.goodfastfoodrepublicpolytechnic;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RatingAndReviews extends ListActivity {
	
	ArrayList<Ratings> ratings;
	Button btnAddReview;
	String canteenSelected;
	String storeSelected;
	
	int requestCode = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating_and_reviews);
		
		canteenSelected = getIntent().getStringExtra("canteenSelectedRating");
		storeSelected = getIntent().getStringExtra("storeSelectedRating");
		
		btnAddReview = (Button) findViewById(R.id.buttonAddReviews);
		
		DBHelper dbh = new DBHelper(this);
		//get reviews of stores
		//ratings = dbh.getAllNotes();
		ratings = dbh.getRatings(canteenSelected, storeSelected);
		//if(canteenSelected != null && storeSelected != null) {
			//ratings = dbh.getRatings(canteenSelected);
		//}
		
		RatingsAdapter adapter = new RatingsAdapter(getBaseContext(), R.layout.row, ratings);
        this.setListAdapter(adapter);
        
        btnAddReview.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				Intent i = new Intent(RatingAndReviews.this, UpdateReview.class);
				i.putExtra("canteenAddRating", canteenSelected);
				i.putExtra("storeAddRating", storeSelected);
				startActivityForResult(i, requestCode);
			}});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == this.requestCode && resultCode == RESULT_OK){
			DBHelper dbh = new DBHelper(this);
	        ratings = dbh.getRatings(canteenSelected, storeSelected); 
	        RatingsAdapter adapter = new RatingsAdapter(this, R.layout.row, ratings);
		    this.setListAdapter(adapter);
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rating_and_reviews, menu);
		return true;
	}

}
