package ticket;

import java.time.DayOfWeek;
import java.time.LocalDate; 
import java.time.LocalTime; 
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Ticket {
	
	 private static final int MAX_SECUENCIA = 99999999;  //Secuencia maxima de generacion de tickets

    private static int ultimoAnio = 0; //
    private static int secuencia = 0;
   

    private String id;
    private LocalDate fechaUso;
    private String usado = null;
    private LocalTime horaUso;


    // Constructor sin parámetros
    public Ticket() {
        this(LocalDate.now());
    }

    // Constructor con fecha
    public Ticket(LocalDate fechaUso) throws IllegalArgumentException  {
        LocalDate hoy = LocalDate.now();

        if (fechaUso.isBefore(hoy)) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a hoy.");
        }

        if (fechaUso.getYear() != hoy.getYear()) {
            throw new IllegalArgumentException("La fecha debe pertenecer al año actual.");
        }

        this.fechaUso = fechaUso;
        generarId();
    }

    // Genera el Id
    private void generarId() throws IllegalStateException {
        int anioActual = LocalDate.now().getYear();

        if (anioActual != ultimoAnio) {
            ultimoAnio = anioActual;
            secuencia = 0;
        }

        if (secuencia >= MAX_SECUENCIA) {
            throw new IllegalStateException("No se pueden generar mas tickets este año.");
        }

        secuencia++;
        this.id = String.format("%d-%08d", anioActual, secuencia);
    }

    // los get
    public String getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fechaUso;
    }

    public String isUsado() {
        return usado;
    }

    public boolean isFinDeSemana() {
        DayOfWeek dia = fechaUso.getDayOfWeek();
        return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
    }

    // usar ticket
    public void usar()throws IllegalStateException{ 
        LocalDate hoy = LocalDate.now();

        if (!hoy.equals(fechaUso)) {
            throw new IllegalStateException("El ticket no puede usarse en esta fecha.");
        }

        if (usado != null) {
            throw new IllegalStateException("El ticket ya ha sido usado.");
        }

        this.usado = "usado";
        this.horaUso = LocalTime.now().withSecond(0);
    }

    // El toString
    
    public String toString() {
        DateTimeFormatter fechaF = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm");

        String usadoS = usado != null ? horaUso.format(horaF) : "no";

        return String.format("{ID: %s, Fecha:%s, Usado: %s}",id,fechaUso.format(fechaF),usadoS);
        
    }

    // par de metodos Fabrca

    // La fecha aleatoria del mes acutual
    public static Ticket randomEsteMes() {
        LocalDate hoy = LocalDate.now();
        Random r1 = new Random();

        int ultimoDiaMes = hoy.lengthOfMonth();
        int dia = r1.nextInt(ultimoDiaMes - hoy.getDayOfMonth() + 1)
                + hoy.getDayOfMonth();

        LocalDate fecha = LocalDate.of(hoy.getYear(), hoy.getMonth(), dia);
        return new Ticket(fecha);
    }

    //La fehca aleatoria del año actual
    public static Ticket random() {
        LocalDate hoy = LocalDate.now();
        Random randomsito = new Random();

        int diasRestantes = hoy.lengthOfYear() - hoy.getDayOfYear();
        int desplazamiento = randomsito.nextInt(diasRestantes + 1);

        LocalDate fecha = hoy.plusDays(desplazamiento);
        return new Ticket(fecha);
    }

}
