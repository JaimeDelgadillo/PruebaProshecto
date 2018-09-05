package categoría.control;

import java.util.Vector;

import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;

public class Categorías {

	private Vector<Categoría> categorías;

	public Categorías() {
		categorías = new Vector<Categoría>();
	}

	/****************************
	 * Ingresar una Categoría    *
	 ****************************/
	
	public void ingresar(Categoría Categoría) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		categorías.add(Categoría);
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	
	
	public int getCantidad() {
		return categorías.size();
	}
	

	/****************************
	 * Eliminar una Categoría     
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void eliminar(int codCategoría) throws NoExisteCategoría {
		int índice;
		índice = buscar(codCategoría);

			if (índice != categorías.size()) {
				categorías.removeElementAt(índice);
			}
	}
	
	
	/****************************
	 * Buscar una   Categoría     
	 * @throws NoExisteCategoría *
	 ****************************/

	public int buscar(int codCategoría) throws NoExisteCategoría {
		int índice = -1;
		for (int i = 0; i <= categorías.size(); i++) {
			if (codCategoría == categorías.get(i).getCodCategoría()) {
				índice = i;
			}
		}
		if (índice == -1) {
			throw new NoExisteCategoría();
		}
		return índice;
	}
	
	/****************************
	 * Devuelve el vector de    * 
	 * Categorías                *
	 ****************************/

	public Vector<Categoría> getCategorías() {
		return categorías;
	}
}