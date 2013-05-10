import java.util.Calendar;



public class Proceso implements Runnable {
	
	public void run() {
		try {
			
			Calendar cal1 = Calendar.getInstance();
			System.out.println("Lanzando Proceso 1 a las : " + cal1.get(Calendar.HOUR) 
					+ ":" + cal1.get(Calendar.MINUTE) +":" + cal1.get(Calendar.SECOND));
			//Thread.sleep(120000);
			Thread.sleep(60000);
			
			Calendar cal2 = Calendar.getInstance();
			System.out.println("Terminando Proceso 2 a las: " + cal2.get(Calendar.HOUR) 
			+ ":" + cal2.get(Calendar.MINUTE) +":" + cal2.get(Calendar.SECOND));
			
		} catch (InterruptedException e) {
			// sin error
		} 
	}
	public void iniciarProceso() {
		new Thread(this).start();
		
	}
}
	
