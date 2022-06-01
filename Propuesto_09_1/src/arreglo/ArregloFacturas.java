package arreglo;

import java.util.ArrayList;

import clase.Factura;

public class ArregloFacturas {
	// Atributo privado
	private ArrayList<Factura> fac;
	// Constructor
	public ArregloFacturas() {
		fac = new ArrayList<Factura>();
		adicionar(new Factura("A100", "POLLITO SAC", 50, 200));
		adicionar(new Factura("A101", "NOW SAC", 60, 205));
		adicionar(new Factura("A102", "DISC SAC", 50, 230));
		adicionar(new Factura("A103", "RUFUS SAC", 55, 100));
		adicionar(new Factura("A104", "LEY SAC", 53, 220));
		adicionar(new Factura("A105", "EDEL SAC", 40, 250));
		adicionar(new Factura("A106", "DONOFIO SAC", 59, 350));
		adicionar(new Factura("A107", "BEMBOS SAC", 46, 300));
	}
	// Métodos básicos
	public void adicionar(Factura x) {
		fac.add(x);
	}
	public int tamanio() {
		return fac.size();
	}
	public Factura obtener(int i) {
		return fac.get(i);
	}
	// Métodos complementarios
	// Retorne suma de todos los importes facturados.
	public double sumaImportes() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += obtener(i).importeFacturado();
		}
		return sum;
	}
	// Retorne importe promedio facturado.
	public double promedio() {
		return sumaImportes()/tamanio();
	}
	//  Retorne menor importe facturado
	public double importeMenor() {
		double menor = obtener(0).importeFacturado();
		for(int i = 1; i < tamanio(); i++) {
			if(obtener(i).importeFacturado() < menor)	menor = obtener(i).importeFacturado();
		}
		return menor;
	}
	// Retorne mayor importe facturado.
	public double importeMayor() {
		double mayor = obtener(0).importeFacturado();
		for(int i = 1; i < tamanio(); i++) {
			if(obtener(i).importeFacturado() > mayor)	mayor = obtener(i).importeFacturado();
		}
		return mayor;
	}
	// Retorne nombre de la primera empresa cuyo importe facturado sea menor al importe promedio facturado.
	public String primeraMenorAlPromedio() {
		for(int i = 0; i < tamanio(); i++) {
			if(obtener(i).importeFacturado() < promedio())	return obtener(i).getEmpresa();
		}
		return null;
	}
	
}
