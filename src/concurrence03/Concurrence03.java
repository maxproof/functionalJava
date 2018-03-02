package concurrence03;

import java.net.URLPermission;
import java.security.AccessControlException;
import java.security.AccessController;

public class Concurrence03 {

	
	
	public static void main(String[] args) {
		
		URLPermission permission = new URLPermission("https://github.com/maxproof");
		
		try {
		AccessController.checkPermission(permission);
		System.out.println("ok permission");
		}
		catch(AccessControlException ace) {
			System.out.println(ace);
		}

	}

}
