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
		int índice;
		índice = buscar(codProducto);

		if (índice > -1) {
			if (índice != productos.size()) {
				productos.removeElementAt(índice);
			}
		}
	}
	
	
	/****************************
	 * Buscar un   producto     *
	 ****************************/

	private int buscar(int codProducto) {
		int índice = -1;
		for (int i = 0; i <= productos.size(); i++) {
			if (codProducto == productos.get(i).getCodProducto()) {
				índice = i;
			}
		}
		return índice;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * productos                *
	 ****************************/

	public Vector<Producto> getProductos() {
		return productos;
	}
}
