package arreglo;

import java.util.ArrayList;

import clase.Docente;

public class ArregloDocentes {
	// Atributo privado
	private ArrayList <Docente> doc;
	// Constructor
	public ArregloDocentes() {
		doc = new ArrayList<Docente>();
		adicionar(new Docente(123,"Now",40,50));
		adicionar(new Docente(124,"Stephano",50,30));
		adicionar(new Docente(125,"Gary",41,35));
		adicionar(new Docente(126,"Luna",31,22));
		adicionar(new Docente(127,"Lina",36,32));
		adicionar(new Docente(128,"Davion",38,30));
		adicionar(new Docente(129,"Ley",45,15));
		adicionar(new Docente(130,"Gloria",30,58));
	}
	// Operaciones públicas básicas
	public void adicionar(Docente x) {
		doc.add(x);
	}
	public int tamanio() {
		return doc.size();
	}
	public Docente obtener(int i) {
		return doc.get(i);
	}
	// Métodos complementarios
	public double sueldoPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += doc.get(i).sueldo();
		}
		return sum/tamanio();
	}
	//  Retorne el sueldo mayor.
	public double sueldoMayor() {
		double sueldoMay = obtener(0).sueldo();
		for(int i = 1; i < tamanio(); i++) {
			if(obtener(i).sueldo() > sueldoMay)	sueldoMay = obtener(i).sueldo();
		}
		return sueldoMay;
	}
	 // Retorne el sueldo menor
	public double sueldoMenor() {
		double sueldoMen = obtener(0).sueldo();
		for(int i = 1; i < tamanio(); i++) {
			if(obtener(i).sueldo() < sueldoMen)	sueldoMen = obtener(i).sueldo();
		}
		return sueldoMen;
	}
	// Retorne la tarifa mayor
	public double tarifaMayor() {
		double tarifaMay = obtener(0).getTarifa();
		for (int i = 1; i < tamanio();i++) {
			if(obtener(i).getTarifa() > tarifaMay)	tarifaMay = obtener(i).getTarifa();
		}
		return tarifaMay;
	}
	//  Retorne la tarifa menor. 
	public double tarifaMenor() {
		double tarifaMen = obtener(0).getTarifa();
		for (int i = 1; i < tamanio();i++) {
			if(obtener(i).getTarifa() < tarifaMen)	tarifaMen = obtener(i).getTarifa();
		}
		return tarifaMen;
	}
}
