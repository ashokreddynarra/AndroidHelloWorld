package com.example.androidsamples;

import android.os.Handler;
import android.os.Message;

public class ServiceConnectionSm implements Handler.Callback{
	static CallbackInterface callback;
	/*
	 * Id: ServiceConnectionSEMLibB.c
	 *
	 * Function: Contains all API functions.
	 *
	 * Generated: Mon Feb 06 00:48:11 2017
	 *
	 * Coder 7, 5, 1, 2643
	 * 
	 * This is an automatically generated file. It will be overwritten by the
	 * Coder.
	 * 
	 * DO NOT EDIT THE FILE!
	 */

	// - use assert to check if pointers are valid
	/// #define _ASSERT_CHECK_USE_STRONG
	/// #define _ASSERT_CHECK_USE_WEAK
	/// #define _ASSERT_MARK_ERROR

	// --- macros for asserting

	/// #define ASSERT_H_INCLUDED

	// C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced
	// in-line:
	// ORIGINAL LINE: #define ASSERT_STRONG(stmnt) assert((stmnt))

	// some weak checkes

	// C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced
	// in-line:
	// ORIGINAL LINE: #define ASSERT_WEAK(stmnt) assert((stmnt))

	// for marking error positions

	// C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced
	// in-line:
	// ORIGINAL LINE: #define ASSERT_ERROR assert( 0 );

	/*
	 * State Identifier Definitions.
	 */

	/*
	 * State Machine Identifier Definitions.
	 */

	public static int[] System1CSV = new int[1];

	public boolean handleMessage(Message aMsg) {
		ServiceConnectionVSDeduct(aMsg);
		return true;
	}

	public static void ServiceConnectionVSDeduct(Message aMsg)

	{
		int EventNo = aMsg.what;

		/* scoped for events */ {
			int[] WSV = { DefineConstants.STATE_UNDEFINED };

			switch (EventNo) {
			case DefineConstants.MSG_SM_STARTUP: {
				callback.aNotifyServiceDisconnected();
				callback.aShowConnectButton();
				WSV[DefineConstants.M_Service_ConnectionRegion] = DefineConstants.Service_ConnectionRegion_Disconnected; // 0
			}
				break;

			case DefineConstants.eConnect: {
				if ((System1CSV[DefineConstants.M_Service_ConnectionRegion] == DefineConstants.Service_ConnectionRegion_Disconnected)) { // 0
					callback.aNotifyServiceConnected();
					callback.aShowDisconnectButton();
					WSV[DefineConstants.M_Service_ConnectionRegion] = DefineConstants.Service_ConnectionRegion_Connected; // 0
				}
			}
				break;

			case DefineConstants.eDisconnect: {
				if ((System1CSV[DefineConstants.M_Service_ConnectionRegion] == DefineConstants.Service_ConnectionRegion_Connected)) { // 0
					callback.aNotifyServiceDisconnected();
					callback.aShowConnectButton();
					WSV[DefineConstants.M_Service_ConnectionRegion] = DefineConstants.Service_ConnectionRegion_Disconnected; // 0
				}
			}
				break;

			default:
				break;
			}

			/* Change the state vector */ {
				int i;
				for (i = 0; i < 1; ++i) {
					if (WSV[i] != DefineConstants.STATE_UNDEFINED) {
						System1CSV[i] = WSV[i];
					}
				}
			}
		}

	}

	public void init(CallbackInterface callback) {
		ServiceConnectionVSInitAll();
		this.callback = callback;
	}

	public static void ServiceConnectionVSInitAll() {
		int i;
		for (i = 0; i < 1; ++i) {
			System1CSV[i] = DefineConstants.STATE_UNDEFINED;
		}
	}
	
}