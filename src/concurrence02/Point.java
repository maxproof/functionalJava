package concurrence02;

import java.util.concurrent.locks.StampedLock;

public class Point {
	
	private double x, y;
	private final StampedLock sl = new StampedLock();
	
	void move (double dx, double dy) {
		long stamp = sl.writeLock();
		
		try {
			x += dx;
			y += dy;
		}
		finally {
			sl.unlock(stamp);
		}
	}
	
	double distance() {
		
		long stamp = sl.tryOptimisticRead();
		double cx = x, cy = y;
		if(!sl.validate(stamp)) {
			stamp = sl.readLock();
			try {
				cx = x;
				cy = y;
			} 
			finally {
				sl.unlockRead(stamp);
			}
		}
		return Math.sqrt(cx*cx + cy*cy);
	}

}
