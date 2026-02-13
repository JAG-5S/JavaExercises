package cocheDeportivo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainCoche {

	public static void main(String[] args) {
		try {
		Coche coche1 = new Coche("1234AA2", "Antonio Lobato", LocalDate.now(), 100, 150);
		}catch (IllegalArgumentException ex1) {
			System.out.print("La matricula es incorrecta" + ex1.getMessage());
		}
		Coche coche2 = new Coche("1234AAA", "Antonio Lobato", LocalDate.of(2000, 05, 12), 100, 150 );
		
		
	}

}
