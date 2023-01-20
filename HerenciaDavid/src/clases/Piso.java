package clases;

public class Piso extends Inmueble {

	private int numHabitaciones;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;
	
	
	
	public Piso() {
		super();
		this.numHabitaciones=0;
		this.vpo=false;
		this.atico=false;
		this.antiguedad=0;
	}

	
	
	
	public Piso(String referencia, int superficie, double valor, 
		   String descripcion, double precioM2,
		   int numHabitaciones, boolean vpo, boolean atico, int antiguedad) {
		super(referencia, superficie, valor, descripcion, precioM2);
		this.numHabitaciones = numHabitaciones;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}
	
	public Piso (Piso p) {
		super(p);
		this.numHabitaciones = p.numHabitaciones;
		this.vpo = p.vpo;
		this.atico = p.atico;
		this.antiguedad = p.antiguedad;
	}


	


	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isVpo() {
		return vpo;
	}

	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}

	public boolean isAtico() {
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	

	




	




	




	




	@Override
	public String toString() {
		return "Piso [referencia=" + referencia + ", superficie=" + superficie + ", valor=" + valor + ", descripcion="
				+ descripcion + ", precioM2=" + precioM2 + ", numHabitaciones=" + numHabitaciones + ", vpo=" + vpo
				+ ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
	}




	@Override
	public String getDescripcion() {
		// return "No permitido"; Sobreescritura
		return "Descripcion: "+super.getDescripcion(); // refinamiento
	}


	@Override
	public double calculaIBI() {
		double ibi= this.valor*coefUrbano;
		if (this.vpo ) {
			ibi=ibi-ibi*0.5;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precio= this.precioM2*this.superficie;
		if (isAtico()) {
			precio = precio + precio*0.06;
		}
		if (isVpo() && this.antiguedad<25) {
			precio=0;
		}
		return precio;
	}

}
