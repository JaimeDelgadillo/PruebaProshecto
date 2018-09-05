package categor�a.control;

import java.util.Vector;

import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;

public class Categor�as {

	private Vector<Categor�a> categor�as;

	public Categor�as() {
		categor�as = new Vector<Categor�a>();
	}

	/****************************
	 * Ingresar una Categor�a    *
	 ****************************/
	
	public void ingresar(Categor�a Categor�a) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		categor�as.add(Categor�a);
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	
	
	public int getCantidad() {
		return categor�as.size();
	}
	

	/****************************
	 * Eliminar una Categor�a     
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void eliminar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice;
		�ndice = buscar(codCategor�a);

			if (�ndice != categor�as.size()) {
				categor�as.removeElementAt(�ndice);
			}
	}
	
	
	/****************************
	 * Buscar una   Categor�a     
	 * @throws NoExisteCategor�a *
	 ****************************/

	public int buscar(int codCategor�a) throws NoExisteCategor�a {
		int �ndice = -1;
		for (int i = 0; i <= categor�as.size(); i++) {
			if (codCategor�a == categor�as.get(i).getCodCategor�a()) {
				�ndice = i;
			}
		}
		if (�ndice == -1) {
			throw new NoExisteCategor�a();
		}
		return �ndice;
	}
	
	/****************************
	 * Devuelve el vector de    * 
	 * Categor�as                *
	 ****************************/

	public Vector<Categor�a> getCategor�as() {
		return categor�as;
	}
}