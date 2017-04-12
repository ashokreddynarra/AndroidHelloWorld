package com.example.androidsamples.test;

import org.junit.Test;

import com.example.androidsamples.R;
import com.example.androidsamples.SampleActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInstrumentationTest extends ActivityInstrumentationTestCase2<SampleActivity>{

	SampleActivity activity;
	public ActivityInstrumentationTest() {
		super("com.example.androidsamples", SampleActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		activity = (SampleActivity)getActivity();
		
	}

	@Test
	public void testInit() {
		assertNotNull(activity);
		Button clickMe = (Button) activity.findViewById(R.id.btn_click_me);
		assertNotNull(clickMe);
	}
	
	@Test
	public void testClickMeButtonClickEvent(){
		
		final Button clickMe = (Button) activity.findViewById(R.id.btn_click_me);
		activity.runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				clickMe.performClick();
			}
		});
		getInstrumentation().waitForIdleSync();
		TextView name = (TextView) activity.findViewById(R.id.name);
		assertTrue(name.getText().toString().equalsIgnoreCase("Chinni"));
		
	}

}
