package clases;

public class Terreno extends Inmueble{

	private boolean urbano;
	private double ha;
	private double precioHa;
	
	

	public Terreno() {
		super();
		setUrbano(true);
		this.ha=0;
		this.precioHa=0;
	}
	

	public Terreno(String referencia, int superficie, double valor, 
			String descripcion, double precioM2, boolean urbano,
			double ha, double precioHa) {
		super(referencia, superficie, valor, descripcion, precioM2);
		setUrbano(urbano);
		this.ha = ha;
		this.precioHa = precioHa;
	}
	

	@Override
	public String toString() {
		return "Terreno [referencia=" + referencia + ", superficie=" 
				+ superficie + ", valor=" + valor
				+ ", descripcion=" + descripcion + ", precioM2=" 
				+ precioM2 + ", urbano=" + urbano + ", ha=" + ha
				+ ", precioHa=" + precioHa + "]";
	}


	
	
	public boolean isUrbano() {
		return urbano;
	}


	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
		if (!urbano) {
			this.superficie=0;
		}
	}


	public double getHa() {
		return ha;
	}


	public void setHa(double ha) {
		this.ha = ha;
	}


	public double getPrecioHa() {
		return precioHa;
	}


	public void setPrecioHa(double precioHa) {
		this.precioHa = precioHa;
	}
	public void setSuperficie(int  superficie) {
		if (isUrbano()) {
			super.setSuperficie(superficie);
		}
	}


	@Override
	public double calculaIBI() {
		if (isUrbano()) {
			return this.valor*coefUrbano;
		} else {
			return this.valor*coefRustico;
		}
	}

	@Override
	public double calculaPrecioVenta() {
		double precio = this.precioHa*this.ha;
		if (isUrbano()) {
			precio=precio+this.superficie*this.precioM2;
		}
		
//		double precio = this.precioHa*this.ha+this.superficie*this.precioM2;
		
		return precio;
	}
	


	
}
