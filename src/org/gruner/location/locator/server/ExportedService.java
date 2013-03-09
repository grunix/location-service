/**
 * 
 */
package org.gruner.location.locator.server;

import org.gruner.location.locator.service.IExportedService;
import org.gruner.location.locator.service.IExportedService.Stub;

import android.os.RemoteException;

/**
 * @author mg
 *
 */
public class ExportedService extends Stub implements IExportedService
{

	public String sayHello(String greeting) throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello Binder";
	}

}
