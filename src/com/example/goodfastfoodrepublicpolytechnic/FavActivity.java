package com.example.goodfastfoodrepublicpolytechnic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FavActivity extends ListActivity {
	Favourite[] fav;
	Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fav);

		fav = new Favourite[] { new Favourite("50", "North Canteen", 
				"Western Food") };
		setListAdapter(new FavouriteAdapter(this, R.layout.favourite, fav));

		btnBack = (Button) findViewById(R.id.buttonBack);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FavActivity.this,
						CanteenActivity.class);
				startActivity(intent);
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fav, menu);
		return true;
	}

}
