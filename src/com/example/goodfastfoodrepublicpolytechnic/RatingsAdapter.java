package com.example.goodfastfoodrepublicpolytechnic;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RatingsAdapter extends ArrayAdapter<Ratings>{
	
	private ArrayList<Ratings> ratings;
	private Context context;
	private TextView textView1, textView2;
	private ImageView imageView1;
	private ImageView imageView2;
	private ImageView imageView3;
	private ImageView imageView4;
	private ImageView imageView5;
	
	public RatingsAdapter(Context context, int resource, ArrayList<Ratings> rating) {
		super(context, resource, rating);
		// TODO Auto-generated constructor stub
		ratings = rating;
		this.context = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// The usual way to get the LayoutInflater object to 
		//  "inflate" the XML file into a View object
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// "Inflate" the row.xml as the layout for the View object
		View rowView = inflater.inflate(R.layout.row, parent, false);
		
		textView1 = (TextView)rowView.findViewById(R.id.tvName);
		textView2 = (TextView)rowView.findViewById(R.id.tvContent);
		imageView1 = (ImageView)rowView.findViewById(R.id.imageView1);
		imageView2 = (ImageView)rowView.findViewById(R.id.imageView2);
		imageView3 = (ImageView)rowView.findViewById(R.id.imageView3);
		imageView4 = (ImageView)rowView.findViewById(R.id.imageView4);
		imageView5 = (ImageView)rowView.findViewById(R.id.imageView5);
		
		Ratings currentData = ratings.get(position);
		int num = currentData.getStars();
		
		textView1.setText(currentData.getName());
		textView2.setText(currentData.getReview());
		
		if(num >= 5){
			imageView5.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if(num >= 4){
			imageView4.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if(num >= 3){
			imageView3.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (num >= 2){
			imageView2.setImageResource(android.R.drawable.btn_star_big_on);
		}
		if (num >= 1){
			imageView1.setImageResource(android.R.drawable.btn_star_big_on);
		}
		
		return rowView;
	}
}

