package principal;

import clases.Inmueble;
import clases.Piso;
import clases.Terreno;

public class Ppal {

	public static void main(String[] args) {
		Inmueble p1 = new Piso("A0112", 80, 115000, "piso céntrico", 
				 			75, 3, false, false, 10);
		
		System.out.println("El piso es "+p1);
		
		System.out.println("Descripcion: "+p1.getDescripcion());
		
		Terreno t1 = new Terreno("A00341", 65, 135000, "Casa urbanizada",
				85, true, 0, 20);
		System.out.println("El terreno es " +t1);
		
		Terreno t2 = new Terreno("A00341", 65, 135000, "Casa rural",
				85, false, 0, 20);
		System.out.println("El terreno es " +t2);
		
		Inmueble lista [] = new Inmueble[3];
		
		lista[0]=p1;
		lista[1]=t1;
		lista[2]=t2;
		
		System.out.println("Lista de inmuebles");
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i].toString());
			
			//System.out.println("Attico: "+lista[i].isAtico());
			
			if (lista[i] instanceof Piso) {
				Piso p = (Piso)lista[i];
				System.out.println("Atico: "+p.isAtico());
			} else if (lista[i] instanceof Terreno) {
				Terreno t = (Terreno) lista[i];
				System.out.println("hectareas: "+t.getHa());
			}
		}
		
		

	}

}
