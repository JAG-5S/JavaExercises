/*
 *  Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas
y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el
fin de semana comienza el viernes a las 21:30h. Se da por hecho que el usuario
introducirá un día y hora correctos, anterior al viernes a las 15:00h.
 * 
 */
package eje2;

import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Días de la semana
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        
        // Solicitar día
        System.out.println("Introduce el día de la semana (lunes a viernes):");
        String diaInput = scanner.nextLine().toLowerCase();
        
        // Verificar que el día está en el rango
        int diaIndex = -1;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equals(diaInput)) {
                diaIndex = i;
                break;
            }
        }

        if (diaIndex == -1) {
            System.out.println("Día no válido.");
            return;
        }

        // Solicitar hora
        System.out.print("Introduce la hora (hh:mm): ");
        String horaInput = scanner.nextLine();
        String[] horaSplit = horaInput.split(":");

        // Validar hora
        if (horaSplit.length != 2) {
            System.out.println("Formato de hora incorrecto.");
            return;
        }

        int horas;
        int minutos;

        try {
            horas = Integer.parseInt(horaSplit[0]);
            minutos = Integer.parseInt(horaSplit[1]);
        } catch (NumberFormatException e) {
            System.out.println("Formato de hora incorrecto.");
            return;
        }

        if (horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60) {
            System.out.println("La hora debe estar en el rango 00:00 a 23:59.");
            return;
        }

        // Hora fin de semana
        int finSemanaDia = 4; // Viernes
        int finSemanaHora = 21;
        int finSemanaMinutos = 30;

        // Calcular minutos restantes
        int minutosRestantes = 0;

        if (diaIndex < finSemanaDia || (diaIndex == finSemanaDia && (horas < finSemanaHora || (horas == finSemanaHora && minutos < finSemanaMinutos)))) {
            // Calcular minutos hasta el fin de semana
            for (int i = diaIndex; i <= finSemanaDia; i++) {
                if (i == diaIndex) { // Día actual
                    minutosRestantes += (60 - minutos) + (finSemanaHora - horas - 1) * 60;
                } else if (i < finSemanaDia) { // Días intermedios
                    minutosRestantes += 24 * 60; // 24 horas
                } else if (i == finSemanaDia) { // Viernes
                    minutosRestantes += finSemanaMinutos;
                }
            }
        }

        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
		
		
		
		
		
		
	}

}
