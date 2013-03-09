package org.gruner.location.locator.client;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ExportedService extends Service {

	IBinder mBinder = new org.gruner.location.locator.server.ExportedService(); 
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder;
	}

}
