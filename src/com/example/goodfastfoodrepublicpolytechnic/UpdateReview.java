package com.example.goodfastfoodrepublicpolytechnic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class UpdateReview extends Activity {
	Ratings rating = null;
	TextView tvId;
	EditText etName, etReview;
	RadioGroup rgStars;
	RadioButton radio1, radio2, radio3, radio4, radio5;
	Button btnAdd, btnCancel;
	String canteenSelected, storeSelected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_review);
		
		Intent i = getIntent();
		canteenSelected = i.getStringExtra("canteenAddRating");
		storeSelected = i.getStringExtra("storeAddRating");
	
		etName = (EditText) findViewById(R.id.editTextName);
		etReview = (EditText) findViewById(R.id.editTextReview);
		rgStars = (RadioGroup) findViewById(R.id.radioGroupStars);
		radio1 = (RadioButton) findViewById(R.id.radioUpdate1);
		radio2 = (RadioButton) findViewById(R.id.radioUpdate2);
		radio3 = (RadioButton) findViewById(R.id.radioUpdate3);
		radio4 = (RadioButton) findViewById(R.id.radioUpdate4);
		radio5 = (RadioButton) findViewById(R.id.radioUpdate5);
		btnAdd = (Button) findViewById(R.id.buttonAdd);
		btnCancel = (Button) findViewById(R.id.buttonCancel);
		
		btnAdd.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				Ratings rating = new Ratings(-1, canteenSelected, storeSelected, etName.getText().toString(), etReview.getText().toString(), getStars());				
				DBHelper dbh = new DBHelper(UpdateReview.this);
				// Call the add method
				dbh.insertNote(rating);
				// Set result to ok so Rating&review refresh
				setResult(RESULT_OK);
				finish();
			}});
		
		btnCancel.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				// So NotesActivity do nothing
				setResult(RESULT_CANCELED);
				finish();
			}});
	}
	
	private int getStars(){
		int stars = 1;
		if(rgStars.getCheckedRadioButtonId() == R.id.radioUpdate1){	
			stars = 1;
		}
		else if(rgStars.getCheckedRadioButtonId() == R.id.radioUpdate2){	
			stars = 2;
		}
		else if(rgStars.getCheckedRadioButtonId() == R.id.radioUpdate3){	
			stars = 3;
		}
		else if(rgStars.getCheckedRadioButtonId() == R.id.radioUpdate4){	
			stars = 4;
		}
		else if(rgStars.getCheckedRadioButtonId() == R.id.radioUpdate5){	
			stars = 5;
		}		
		return stars;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update_review, menu);
		return true;
	}

}
