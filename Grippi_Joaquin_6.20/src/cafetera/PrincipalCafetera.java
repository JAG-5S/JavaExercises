package cafetera;

public class PrincipalCafetera {

	public static void main(String[] args) {
		Cafetera cafe1 = new Cafetera(250);
			
		for (int i=0;i<50;i++) {
			try {
			cafe1.servirTaza(50);
			}catch(IllegalArgumentException ex1) {
				System.out.println(ex1.getMessage()+"--Rellenando cafetera--N.Tazas servidas: "+i);
				cafe1.llenarCafetera(250);
			}
			
			
		}
	}

}
