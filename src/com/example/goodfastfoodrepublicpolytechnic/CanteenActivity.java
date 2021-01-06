package com.example.goodfastfoodrepublicpolytechnic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class CanteenActivity extends ListActivity {

	Canteen[] canteen;
	Button btnFav, btnShare, btnLog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_canteen);

		canteen = new Canteen[] { new Canteen("North Canteen"),
				new Canteen("South Canteen"), new Canteen("Lawn Canteen") };
		setListAdapter(new CanteenAdapter(this, R.layout.canteen, canteen));
		
		/*
		OnItemClickListener itemClickListener = new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long id) {
				Intent intent = new Intent(StoreActivity.this,
						CanteenActivity.class);
				// Get the value of the item you clicked
				String itemClicked = canteen[position].toString();
				intent.putExtra("canteen", itemClicked);
				startActivity(intent);

			}
		};
		*/
		
		btnFav = (Button) findViewById(R.id.buttonFav);
		btnFav.setOnClickListener(new OnClickListener(){
			

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CanteenActivity.this,
						FavActivity.class);
				startActivity(intent);
			}
			
		});
		
		btnShare = (Button) findViewById(R.id.buttonShare);
		btnShare.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		btnLog = (Button) findViewById(R.id.buttonLog);
		btnLog.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CanteenActivity.this,
						LoginOrLogoutActivity.class);
				startActivity(intent);
			}
			
		});
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Intent i = new Intent(CanteenActivity.this, StoreActivity.class);
		String itemClicked = canteen[position].getName().toString().trim();
		i.putExtra("canteen", itemClicked);
		startActivity(i);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
