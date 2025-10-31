package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		short numeroEmpleado;
		byte edad;
		float salarioHora, horasTrabajadas;
		boolean esJornadaCompleta;
		
		System.out.print("Ingresa el numero de empleado: ");
		numeroEmpleado = teclado.nextShort();
		System.out.print("Ingresa la edad: ");
		edad = teclado.nextByte();
		System.out.print("Ingresa el Salario por hora del empleado: ");
		salarioHora = teclado.nextFloat();
		
		System.out.print("Ingresa las horas trabajadas: ");
		horasTrabajadas = teclado.nextInt();
			if (horasTrabajadas >= 40) {
				esJornadaCompleta = true;
			}
			else {
				esJornadaCompleta = false;
			}
		float salarioBruto = horasTrabajadas * salarioHora;
		float iRPF = salarioBruto / 100 * 12.0f ;
		float salarioNeto = salarioBruto - iRPF ; 
		
		boolean elegibleParaBono;
			if ( esJornadaCompleta == true  && horasTrabajadas >= 40 ) {
				elegibleParaBono = true;
			}else {
				elegibleParaBono = false;
			}
			System.out.print("El numero del empleado es: " + numeroEmpleado + "\nSu edad es: " + edad + "\nSu salario por hora es: " + salarioHora + "\nSu salario Bruto es: " + salarioBruto + "\nEl IRPF retenido es: " + iRPF + "\nSu salario neto es: " + salarioNeto + "\nSu elegibilidad para el bono es: " + elegibleParaBono);
	
			
	}

}
