package com.example.androidsamples.test;

import org.junit.Test;

import com.example.androidsamples.R;

import android.test.AndroidTestCase;

public class SimpleInstrumentationTest extends AndroidTestCase{

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	@Test
	public void testResourceAccess(){
		assertTrue(getContext().getResources().getString(R.string.app_name).equalsIgnoreCase("AndroidSamples"));
	}

}
