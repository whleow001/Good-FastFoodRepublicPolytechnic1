package com.example.goodfastfoodrepublicpolytechnic;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MenusActivity extends ListActivity {

	Menus[] drinkMenu;
	Menus[] mixedVegetablesMenu;
	String menus;
	String storeClicked;
	int store;
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menus);

		drinkMenu = new Menus[] { new Menus("Ice Milo", "$0.80"),
				new Menus("Bandung", "$0.80"), };

		mixedVegetablesMenu = new Menus[] { new Menus("1 Vegetables", "$2"),
				new Menus("1 Meat", "$2.50"), };

//		menus = getIntent().getStringExtra("canteen" );
//		storeClicked = getIntent().getStringExtra("storeSelected");
//		store = Integer.parseInt(storeClicked);
		
		
		//if (menus != null && menus.contentEquals("North Canteen") && store == 0) {
			if (store == 0) {
				setListAdapter(new MenusAdapter(this, R.layout.menus, drinkMenu));
			} else {
				setListAdapter(new MenusAdapter(this, R.layout.menus,
						mixedVegetablesMenu));
			}

		//}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
