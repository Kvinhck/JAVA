package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo();
		System.out.println("=============Vehiculo 1: Creado=============");
		v.anio="2022";
		v.marca="Chevrolet";
		v.modelo="Nuevo";
		
		System.out.println("=============Vehiculo 1: Valores Asignados=============");

		System.out.println("Año: "+v.anio);
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		
		System.out.println("=============Vehiculo 2: Creado=============");
		Vehiculo v2 = new Vehiculo();
		
		v2.anio="2023";
		v2.marca="Nissan";
		v2.modelo="El mas rapido";
		
		System.out.println("=============Vehiculo 1: Valores Asignados=============");
		
		System.out.println("Año: "+v2.anio);
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
	}	 

}
