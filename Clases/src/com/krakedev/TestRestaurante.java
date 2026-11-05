package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		rest1.nombre="El Manglar de las Conchas";
		rest1.direccion="Av. La Prensa y Logroño";
		rest1.calificacion = 4.5f;
		
		rest2.nombre="La Casa del Sabor";
		rest2.direccion="Av. Amazonas y Naciones Unidas";
		rest2.calificacion = 4.2f;
		
		System.out.println("===========RESTAURANTE 1===========");
		
		System.out.println("Nombre del Restaurante: "+rest1.nombre);
		System.out.println("Direccion del Restaurante: "+rest1.direccion);
		System.out.println("Calificacion del Restaurante: "+rest1.calificacion);
		
		System.out.println("===========RESTAURANTE 2===========");
		
		System.out.println("Nombre del Restaurante: "+rest2.nombre);
		System.out.println("Direccion del Restaurante: "+rest2.direccion);
		System.out.println("Calificacion del Restaurante: "+rest2.calificacion);
	}

}
