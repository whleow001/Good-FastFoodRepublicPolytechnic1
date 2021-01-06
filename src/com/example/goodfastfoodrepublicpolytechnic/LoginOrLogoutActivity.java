package com.example.goodfastfoodrepublicpolytechnic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginOrLogoutActivity extends Activity {

	Button btnBack, btnSubmit, btnRegister;

	EditText loginUser, loginPassword, registerUser, registerPassword,
			registerCfmPassword;

	String sLoginUser, sLoginPassword, sRegisterUser, sRegisterPassword,
			sRegisterCfmPassword;

	int numberCfmPassword, numberPassword, numberUsername;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_or_logout);

		loginUser = (EditText) findViewById(R.id.etUsername);
		sLoginUser = loginUser.getText().toString();
		loginPassword = (EditText) findViewById(R.id.etPassword);
		sLoginPassword = loginPassword.getText().toString();
		registerUser = (EditText) findViewById(R.id.registerUsername);
		sRegisterUser = registerUser.getText().toString();
		registerPassword = (EditText) findViewById(R.id.registerPassword);
		sRegisterPassword = registerPassword.getText().toString();
		registerCfmPassword = (EditText) findViewById(R.id.registerConfirmPassword);
		sRegisterCfmPassword = registerCfmPassword.getText().toString();

		btnBack = (Button) findViewById(R.id.buttonBack1);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LoginOrLogoutActivity.this,
						CanteenActivity.class);
				startActivity(intent);
			}

		});

		btnSubmit = (Button) findViewById(R.id.buttonLoginSubmit);

		btnSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sLoginUser = loginUser.getText().toString();
				sLoginPassword = loginPassword.getText().toString();

				if (sLoginUser.equals("") || sLoginPassword.equals("")) {
					
					if (sLoginUser.equals("")) {
						Toast.makeText(getApplicationContext(),
								"Your username is empty", Toast.LENGTH_LONG)
								.show();
					}
					
					else if (sLoginPassword.equals("")) {
						Toast.makeText(getApplicationContext(),
								"Your password is empty", Toast.LENGTH_LONG)
								.show();
					}
				}

				else {

					if (sLoginUser.equalsIgnoreCase("Username")
							&& sLoginPassword.equalsIgnoreCase("Password")) {
						Toast.makeText(getApplicationContext(),
								("Welcome! " + loginUser.getText().toString()),
								Toast.LENGTH_LONG).show();
						Intent intent = new Intent(LoginOrLogoutActivity.this,
								CanteenActivity.class);
						startActivity(intent);
					}

					else {
						
						if (sLoginUser != ("Username")) {
							Toast.makeText(getApplicationContext(),
									"Your username does not match",
									Toast.LENGTH_LONG).show();
						} 
						
						else if (sLoginPassword != ("Password")) {
							Toast.makeText(getApplicationContext(),
									"Your password does not match",
									Toast.LENGTH_LONG).show();
						}
					}

				}

			}
		});

		btnRegister = (Button) findViewById(R.id.buttonRegisterSubmit);

		btnRegister.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sRegisterCfmPassword = registerCfmPassword.getText().toString();
				sRegisterPassword = registerPassword.getText().toString();
				sRegisterUser = registerUser.getText().toString();

				numberUsername = sRegisterUser.length();
				numberPassword = sRegisterPassword.length();
				numberCfmPassword = sRegisterCfmPassword.length();

				if (sRegisterUser.equals("") || sRegisterPassword.equals("")
						|| sRegisterCfmPassword.equals("")) {

					if (sRegisterUser.equals("")) {
						Toast.makeText(getApplicationContext(),
								"Your username is empty", Toast.LENGTH_LONG)
								.show();
					} 
					
					else if (sRegisterPassword != sRegisterCfmPassword) {
						Toast.makeText(getApplicationContext(),
								"Your password doesn't match",
								Toast.LENGTH_LONG).show();
					} 
					
					else {
						Toast.makeText(getApplicationContext(),
								"Your password is empty", Toast.LENGTH_LONG)
								.show();
					}

				} else {

					if (numberUsername == 7 || numberPassword == 5
							&& numberCfmPassword == 5) {
						Toast.makeText(
								getApplicationContext(),
								("Welcome to RP Good and fast food " + registerUser
										.getText().toString()),
								Toast.LENGTH_LONG).show();
						Intent intent = new Intent(LoginOrLogoutActivity.this,
								CanteenActivity.class);
						startActivity(intent);
						
					} 
					
					else {
						
						if (numberUsername < 7) {
							Toast.makeText(getApplicationContext(),
									"Your username is too fucking short",
									Toast.LENGTH_LONG).show();
						} 
						
						else if (numberPassword < 5) {
							Toast.makeText(getApplicationContext(),
									"Your password is too fucking short",
									Toast.LENGTH_LONG).show();
						} 
						
						else if (numberCfmPassword < 5) {
							Toast.makeText(getApplicationContext(),
									"Your password is too fucking short",
									Toast.LENGTH_LONG).show();
						}
					}
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_or_logout, menu);
		return true;
	}

}
