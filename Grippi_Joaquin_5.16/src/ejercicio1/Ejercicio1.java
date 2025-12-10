package ejercicio1;

import libtarea3.*;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        //1
        CuentaBancaria cuentaPrivada;
        CuentaBancaria cuentaConjunta;
        CuentaBancaria cuentaFamiliar;

        //2.1
        try {
            double saldoCuenta = 2000;
            LocalDate fechaDeCreacion = LocalDate.of(2027, 9, 1);
            CuentaBancaria cuentaErronea = new CuentaBancaria(saldoCuenta, fechaDeCreacion);
        } catch (DateTimeException fechaErronea) {
            System.out.printf("Fecha Erronea%n");
        } catch (IllegalArgumentException ex21) {
        	System.out.printf(ex21.getMessage());
        	CuentaBancaria cuentaPrivada3 = new CuentaBancaria();
        }

        //2.2
        try {
            double saldoCuenta = -2000;
            CuentaBancaria cuentaErronea = new CuentaBancaria(saldoCuenta);
        } catch (IllegalArgumentException saldoErroneo) {
            System.out.printf("Saldo Erroneo%n");
        } 

        //2.3
        try {
        double saldoCuenta = 1000;
        double limiteDescubierto = -200;
        LocalDate fechaDeCreacion = LocalDate.of(2021, 7, 1);
        cuentaPrivada = new CuentaBancaria(saldoCuenta, fechaDeCreacion, limiteDescubierto);
        }catch(IllegalArgumentException ex23) {
        	System.out.printf(ex23.getMessage());
        	CuentaBancaria cuentaPrivada2 = new CuentaBancaria();
        } catch (Exception ex23) {
            System.out.printf("Error Desconocido%n");
            CuentaBancaria cuentaPrivada2 = new CuentaBancaria();
        }
        
        
        //2.4
        try {
        double saldoCuenta1 = 200;
        LocalDate fechaDeCreacion1 = LocalDate.of(2021, 7, 1);
        cuentaConjunta = new CuentaBancaria(saldoCuenta1, fechaDeCreacion1);
        }catch(IllegalArgumentException ex24) {
        	System.out.printf(ex24.getMessage());
        	CuentaBancaria cuentaPrivada1 = new CuentaBancaria();
        } catch (Exception ex24) {
            System.out.printf("Error Desconocido%n");
            CuentaBancaria cuentaPrivada1 = new CuentaBancaria();
        }
        
        
        //2.5
        cuentaFamiliar = new CuentaBancaria();

        //3
        System.out.printf("Identificador: %s%n", cuentaPrivada.getId());
        System.out.printf("Creada en: %s%n", cuentaPrivada.getFechaCreacion());
        System.out.printf("Limite Descubierto: %.2f%n", cuentaPrivada.getLimiteDescubierto());
        System.out.printf("Tiene Embargo: %b%n", cuentaPrivada.isEmbargada());
        System.out.printf("Esta Descubierta: %b%n", cuentaPrivada.isDescubierta());
        System.out.printf("Creada hace: %d dias%n", cuentaPrivada.getDiasCuenta());

        //4
        try {
        	 System.out.printf("Saldo cuentaPrivada: %.2f%n", cuentaPrivada.getSaldo());
        	 cuentaFamiliar.ingresar(100);
        	 System.out.printf("Saldo cuentaPrivada: %.2f%n", cuentaPrivada.getSaldo());
        }catch(IllegalArgumentException ex41) {
        	System.out.printf(ex41.getMessage());
        }catch(IllegalStateException ex41) {
        	System.out.printf(ex41.getMessage());
        }
        
        try {
        cuentaConjunta.extraer(100);
        }catch(IllegalArgumentException ex41) {
        	System.out.printf(ex41.getMessage());
        }catch(IllegalStateException ex41) {
        	System.out.printf(ex41.getMessage());
        }
        
        try {
        cuentaPrivada.transferir(1100, cuentaConjunta);
	    }catch(IllegalArgumentException ex41) {
	    	System.out.printf(ex41.getMessage());
	    }catch(IllegalStateException ex41) {
	    	System.out.printf(ex41.getMessage());
	    }
        
        
        //5
        System.out.printf("Saldo cuentaPrivada: %.2f%n", cuentaPrivada.toString());
        System.out.printf("Saldo cuentaFamiliar: %.2f%n", cuentaFamiliar.toString());
        System.out.printf("Saldo cuentaConjunta: %.2f%n", cuentaConjunta.toString());
    }
}