package org.gruner.location.locator.client;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocationService extends Service {

	IBinder mBinder = new org.gruner.location.locator.server.LocationService(); 

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
