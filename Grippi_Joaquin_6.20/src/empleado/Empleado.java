package empleado;

public class Empleado {
	
	public static final boolean ESTA_CASADO_DEFAULT = false;	// Contante predeterminada de estado civil
	public static final int SUELDO_BASE_DEFAULT = 1200;			//Constante predeterminada Fijada al salario minimo
	public static final int PAGO_HORA_EXTRA_DEFAULT = 12; 		// Constante predeterminada de Pago por hora extra
	public static final int HORAS_POR_MES_DEFAULT = 173;		//Constante predeterminada de horas extra realizadas en un mes
	public static final int IRPF_DEFAULT = 19;					//Constante de IRPF Default
	public static final byte NUMERO_HIJOS_DEFAULT= 0;			//constante de numero de hijos
	public static final int CANTIDAD_EMPLEADOS_DEFAULT = 0;		//Constatne de Empleados Default
	public static final int HORAS_EXTRAS_REALIZADAS = 0;		//Horas Extra realizadas
	
	private String nif;
	private String apellidos; 
	private String nombre; 
	private int sueldoBase;
	private int pagoPorHoraExtra ; 
	private int horasExtraRealizadas;
	private int horasPorMes;		//Considere adecuado agregar este atributo para poder calcular el salario por hora. y posteriormente asi podes calcular si las horas extras estan pagadas sobre las horas laborales comunes
	private float iRFP;
	private boolean estaCasado;
	private byte numeroHijos;
	private int cantidadEmpleados;
	
	public Empleado(String nif, String apellidos, String nombre, int sueldoBase, int pagoPorHoraExtra, int horasPorMes,
			int iRFP, boolean estaCasado, byte numeroHijos, int cantidadEmpleados, int horasExtraRealizadas)throws IllegalArgumentException {
		if(nif==null||apellidos==null||nombre==null) {
			throw new IllegalArgumentException ("Algunos parametros son invalidos");
		}else if (sueldoBase / horasPorMes < pagoPorHoraExtra) {
			throw new IllegalArgumentException ("El pago por Horas Extra no puede ser menor al pago horario regular");
		}
		
		this.nif = nif;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.pagoPorHoraExtra = pagoPorHoraExtra;
		this.horasPorMes = horasPorMes;
		this.iRFP = iRFP;
		this.estaCasado = estaCasado;
		this.numeroHijos = numeroHijos;
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
	public Empleado(String nif, String apellidos, String nombre)throws IllegalArgumentException {
		this (nif, apellidos, nombre, SUELDO_BASE_DEFAULT, PAGO_HORA_EXTRA_DEFAULT, HORAS_POR_MES_DEFAULT, IRPF_DEFAULT, ESTA_CASADO_DEFAULT,
		NUMERO_HIJOS_DEFAULT, CANTIDAD_EMPLEADOS_DEFAULT, HORAS_EXTRAS_REALIZADAS);
		
		this.nif = nif;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	
	//---------------------------------------------
	//------------GET y SET------------------------
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public void setPagoPorHoraExtra(int pagoPorHoraExtra) {
		this.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public int getHorasPorMes() {
		return horasPorMes;
	}

	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	public double getiRFP() {
		return iRFP;
	}

	public void setiRFP(int iRFP) {
		this.iRFP = iRFP;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(byte numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	//-------------------------------------------------------
	//----------------Resto de metodos-----------------------
	public void horasExtras() {
		int complementoExtra = (pagoPorHoraExtra * horasExtraRealizadas);
		System.out.print("El complemento es: "+ complementoExtra);
	}
	
	
	

}
