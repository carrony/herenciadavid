package principal;

import clases.Inmueble;
import clases.Piso;

public class Ppal {

	public static void main(String[] args) {
		Piso p1 = new Piso("A0112", 80, 115000, "piso céntrico", 
				 			75, 3, false, false, 10);
		
		System.out.println("El piso es "+p1);
		
		System.out.println("Descripcion: "+p1.getDescripcion());

	}

}
