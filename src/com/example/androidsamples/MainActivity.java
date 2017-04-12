package com.example.androidsamples;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements CallbackInterface{

	 Button btnCheck;
	 TextView textInfo;
	 ServiceConnectionSm sm;

	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnCheck = (Button) findViewById(R.id.check);
		textInfo = (TextView) findViewById(R.id.info);
		Message msg = new Message();
		msg.what = DefineConstants.MSG_SM_STARTUP;
		sm = new ServiceConnectionSm();
		sm.init(this);
		sm.handleMessage(msg);
		btnCheck.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				sendConnect();
			}
		});
	}

	 
	 public void sendConnect(){
		 Message msg = new Message();
		 msg.what = DefineConstants.eConnect;
		 sm.handleMessage(msg);
	 }

	@Override
	public void aNotifyServiceDisconnected() {
		// TODO Auto-generated method stub
		Log.d("Testing", "aNotifyServiceDisconnected");
	}

	@Override
	public void aShowConnectButton() {
		// TODO Auto-generated method stub
		Log.d("Testing", "aShowConnectButton");
	}

	@Override
	public void aNotifyServiceConnected() {
		// TODO Auto-generated method stub
		Log.d("Testing", "aNotifyServiceConnected");
	}

	@Override
	public void aShowDisconnectButton() {
		// TODO Auto-generated method stub
		Log.d("Testing", "aShowDisconnectButton");
		
	}
	


}
