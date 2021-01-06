package com.example.goodfastfoodrepublicpolytechnic;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME="ratingandreview.db";
	private static final int DATABASE_VERSION = 6;
	private static final String TABLE_RATING_REVIEW = "rating";
	private static final String RATING_ID = "id";
	private static final String CANTEEN_NAME ="canteenName";
	private static final String STORE_NAME ="storeName";
	private static final String NAME ="name";
	private static final String STORE_REVIEW ="review";
	private static final String COLUMN_STARS = "stars";

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		String createRatingTableSql = "CREATE TABLE " + 
			TABLE_RATING_REVIEW + "(" + RATING_ID + 
			" INTEGER PRIMARY KEY AUTOINCREMENT," + CANTEEN_NAME + " TEXT," +
			STORE_NAME + " TEXT," + NAME + " TEXT," + STORE_REVIEW + " TEXT," + COLUMN_STARS + " INTEGER )";
		
		db.execSQL(createRatingTableSql);
		
		ContentValues values = new ContentValues();
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(STORE_NAME, "Fruits and Drink Store");
		values.put(NAME, "Dummy");
		values.put(STORE_REVIEW, "Default data");
		values.put(COLUMN_STARS, 3);
		db.insert(TABLE_RATING_REVIEW, null, values);
		
//		String createMenuTableSql = "CREATE TABLE " +
//		
//		ContentValues dummyMenu1 = new ContentValues();
//		dummyMenu1.put()
		
		/*values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		values.put(CANTEEN_NAME, "North Canteen");
		
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		values.put(CANTEEN_NAME, "South Canteen");
		
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		values.put(CANTEEN_NAME, "Lawn Canteen");
		
		values.put(STORE_NAME, "Fruits and Drink Store");
		values.put(STORE_NAME, "Mixed Vegetables Rice");
		values.put(STORE_NAME, "Fishball Noodles");
		values.put(STORE_NAME, "Ban Mian");
		values.put(STORE_NAME, "Western Food");
		values.put(STORE_NAME, "Japanese Food");
		values.put(STORE_NAME, "Nasi Lemak");
		values.put(STORE_NAME, "Vegeterian Food");
		values.put(STORE_NAME, "Indian Food");
		values.put(STORE_NAME, "Pizza");
		values.put(STORE_NAME, "Chicken Rice");
		values.put(STORE_NAME, "Malay Food");
		
		values.put(STORE_NAME, "A taste of nanyang 1983");
		values.put(STORE_NAME, "Beverages");
		values.put(STORE_NAME, "Dim Sum");
		values.put(STORE_NAME, "Fruits");
		values.put(STORE_NAME, "Mixed Vegetables");
		values.put(STORE_NAME, "Yong Tau Foo");
		values.put(STORE_NAME, "Chicken Delights");
		values.put(STORE_NAME, "Ban Mian Fish Soup");
		values.put(STORE_NAME, "Western Cuisine");
		values.put(STORE_NAME, "Snacks");
		values.put(STORE_NAME, "Korean cuisine");
		values.put(STORE_NAME, "Noodles");
		values.put(STORE_NAME, "Mini Wok");
		values.put(STORE_NAME, "Indian Cuisine");
		values.put(STORE_NAME, "Japanese Cuisine");
		values.put(STORE_NAME, "Ayam Penyet");
		values.put(STORE_NAME, "Nasi Pandang");
		
		values.put(STORE_NAME, "Tea Bar");
		values.put(STORE_NAME, "The Oven");
		values.put(STORE_NAME, "Break time");
		values.put(STORE_NAME, "Mixed Vegetables");
		values.put(STORE_NAME, "Wanton Noodles");
		values.put(STORE_NAME, "Ban Mian");
		values.put(STORE_NAME, "Fish Soup");
		values.put(STORE_NAME, "Taiwanese cuisine");
		values.put(STORE_NAME, "Noodle House");
		values.put(STORE_NAME, "Thai Food");
		values.put(STORE_NAME, "Vegetarian Food");
		values.put(STORE_NAME, "Chicken Rice");
		values.put(STORE_NAME, "Japanese cuisine");
		values.put(STORE_NAME, "Bakery");
		values.put(STORE_NAME, "Indian Muslim Food");
		values.put(STORE_NAME, "Ayam Penyet");
		values.put(STORE_NAME, "Nasi Pandang");
		values.put(STORE_NAME, "Desserts and Fruit");
		values.put(STORE_NAME, "Canopy Coffee Club");
		values.put(STORE_NAME, "Pi Li Hong");
		
		db.insert(TABLE_RATING_REVIEW, null, values);*/
		Log.i("note", "created tables");
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_RATING_REVIEW);
		onCreate(db);
	}
	
	public ArrayList<Ratings> getAllNotes() {
		ArrayList<Ratings> notes = new ArrayList<Ratings>();
		String selectQuery = "SELECT " + RATING_ID + "," + CANTEEN_NAME + 
				"," + STORE_NAME + "," + NAME + "," + STORE_REVIEW +
				"," + COLUMN_STARS + " FROM " + TABLE_RATING_REVIEW;

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {
				int id = cursor.getInt(0);
				String canteenName = cursor.getString(1);
				String storeName = cursor.getString(2);
				String name = cursor.getString(3);
				String review = cursor.getString(4);
				int stars = cursor.getInt(5);

				Ratings note = new Ratings(id,canteenName, storeName, name, review, stars);
				notes.add(note);
			} while (cursor.moveToNext());
		}		
		cursor.close();
		db.close();
		return notes;
	}
	public void insertNote(Ratings note) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(CANTEEN_NAME, note.getCanteenName());
		values.put(STORE_NAME, note.getStoreName());
		values.put(NAME, note.getName());
		values.put(STORE_REVIEW, note.getReview());
		values.put(COLUMN_STARS, note.getStars());
		db.insert(TABLE_RATING_REVIEW, null, values);
		db.close();
	}
	public ArrayList<Ratings> getRatings(String canteen, String store) {
		ArrayList<Ratings> notes = new ArrayList<Ratings>();
		String selectQuery = "SELECT " + RATING_ID + "," + CANTEEN_NAME + 
				"," + STORE_NAME + "," + NAME + "," + STORE_REVIEW +
				"," + COLUMN_STARS + " FROM " + TABLE_RATING_REVIEW +
				" WHERE " + CANTEEN_NAME + " LIKE '" + canteen + 
				"' AND " + STORE_NAME + " LIKE '" + store + 
				"' ";

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {
				int id = cursor.getInt(0);
				String canteenName = cursor.getString(1);
				String storeName = cursor.getString(2);
				String name = cursor.getString(3);
				String review = cursor.getString(4);
				int stars = cursor.getInt(5);

				Ratings note = new Ratings(id,canteenName, storeName, name, review, stars);
				notes.add(note);
			} while (cursor.moveToNext());
		}		
		cursor.close();
		db.close();
		return notes;
	}
}
