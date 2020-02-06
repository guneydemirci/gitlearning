package utils;

/**
 * 
 * February, 3 2020
 * 
 * @author guney
 *
 */

public final class Common {
	
	private Common () {}
	
	public static void sleep ( int seconds) {
		
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
