package com.example.androidsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SampleActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample_activity);
	}
	public void clickMe(View view){
		((TextView)findViewById(R.id.name)).setText("Chinni");
	}

}
