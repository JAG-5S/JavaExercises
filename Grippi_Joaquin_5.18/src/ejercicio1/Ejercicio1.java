package ejercicio1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import libtarea3.*;
public class Ejercicio1 {

	public static void main(String[] args) {
	
		
        // 1. Declaracion de 3 variables referencia
      
        Bombilla b1, b2, b3;

        //---------------------------------------------------------------------
        // 2. Consulta inicial de valores globales
    
        //2.1
        System.out.printf("Bombillas creadas: %d%n", Bombilla.getBombillasCreadas());
        
        //2.2
        System.out.printf("Bombillas encendidas: %d%n%n", Bombilla.getBombillasEncendidas());

        //--------------------------------------------------------------------
        // 3. Intentos fallidos de creacion
        
        //3.1
        try {
            Bombilla error1 = new Bombilla(true, 250);
        } catch (IllegalArgumentException ex3) {
            System.out.printf("Error al crear bombilla 1: %s%n", ex3.getMessage());
        }

        //3.2
        try {
            Bombilla error2 = new Bombilla(5);
        } catch (IllegalArgumentException ex3) {
            System.out.printf("Error al crear bombilla 2: %s%n%n", ex3.getMessage());
        }

      
        // 3.3 / 3.4 / 3.5. Crear correctamente las 3 bombillas
  
        b1 = new Bombilla(true, 100);   // encendida, 100 W
        b2 = new Bombilla(true);        // encendida, potencia por omision
        b3 = new Bombilla();            // todo por omision

        //---------------------------------------------------------
        // 4. Operaciones sobre bombillas
        // 4.1 Intentar encender la primera (ya esta encendida)
        try {
            b1.encender();
        } catch (IllegalStateException ex5) {
            System.out.printf("Error al encender b1: %s%n", ex5.getMessage());
        }

        // 4.2 Conmutar b1 seis veces con esperas
        for (int i = 0; i < 6; i++) {
            b1.conmutar();
            Utilidades.esperar(1); // espera de 1 segundo
        }

        // 4.3 Apagar la segunda bombilla
        b2.apagar();

        // 4.4 Encender la tercera bonbilla
        b3.encender();

        //-------------------------------------------------------
        // 5. Obtener y mostrar dtos de la primera bombilla
    
        // 5.1 / 5.2 / 5.3 / 5.4 / 5.5 / 5.6
        double potencia = b1.getPotencia();
        boolean estado = b1.getEstado();
        LocalDateTime fechaEncendido = b1.getUltimaVezEncendida();
        int veces = b1.getVecesEncendida();
        double tiempo = b1.getTiempoEncendida();
        double consumo = b1.getPotenciaConsumida();
        
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.printf("%n--- Información de la primera bombilla --- %n");
        System.out.printf("Potencia: %.2f W%n", potencia);
        System.out.printf("Estado: %s%n", estado ? "Encendida" : "Apagada");

        if (fechaEncendido != null)
            System.out.printf("Última vez encendida: %s%n", fechaEncendido.format(formato));
        else
            System.out.printf("Última vez encendida: (nunca)%n");

        System.out.printf("Número de veces encendida: %d%n", veces);
        System.out.printf("Tiempo encendida: %.2f s%n", tiempo);
        System.out.printf("Potencia consumida: %.2f W·s%n%n", consumo);

        //---------------------------------------------
        // 6. Consulta final de valores globales

        System.out.printf("Bombillas creadas: %d%n", Bombilla.getBombillasCreadas());
        System.out.printf("Bombillas encendidas: %d%n", Bombilla.getBombillasEncendidas());
		
		

	}
	
}
