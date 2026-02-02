package ticket;

public class MainTicket {

	public static void main(String[] args) {
		Ticket t1 = new Ticket(); 
		System.out.println(t1); 
		try { t1.usar(); System.out.println("Ticket usado correctamente"); 
		} catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); } 
		System.out.println(t1);
		try { t1.usar(); System.out.println("Ticket usado correctamente"); 
		} catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); } 
		Ticket t2 = new Ticket(); 
		System.out.println(t2); 
		try { t2.usar(); System.out.println("Ticket usado correctamente"); 
		} catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); } 
		System.out.println(t2);
	}

}
