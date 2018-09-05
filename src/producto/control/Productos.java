package producto.control;

import java.util.Vector;

import producto.entity.Producto;

public class Productos {

	private Vector<Producto> productos;

	public Productos() {
		productos = new Vector<Producto>();
	}

	/****************************
	 * Ingresar un producto     *
	 ****************************/
	
	public void ingresar(Producto producto) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		productos.add(producto);
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	
	
	public int getCantidad() {
		return productos.size();
	}
	

	/****************************
	 * Eliminar un producto     *
	 ****************************/
	
	public void eliminar(int codProducto) {
		int �ndice;
		�ndice = buscar(codProducto);

		if (�ndice > -1) {
			if (�ndice != productos.size()) {
				productos.removeElementAt(�ndice);
			}
		}
	}
	
	
	/****************************
	 * Buscar un   producto     *
	 ****************************/

	private int buscar(int codProducto) {
		int �ndice = -1;
		for (int i = 0; i <= productos.size(); i++) {
			if (codProducto == productos.get(i).getCodProducto()) {
				�ndice = i;
			}
		}
		return �ndice;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * productos                *
	 ****************************/

	public Vector<Producto> getProductos() {
		return productos;
	}
}
