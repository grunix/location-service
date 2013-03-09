package org.gruner.location.locator.server;

import java.io.FileDescriptor;

import org.gruner.location.locator.service.ILocationService;
import org.gruner.location.locator.service.ILocationService.Stub;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class LocationService extends Stub {

	@Override
	public String lookWhereWeAre(String greeting) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



}
