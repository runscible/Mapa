package Mapa;

public class Ubicacion extends Localidad{
	public Ubicacion(){
		//se declaran los valores correspondientes en esta clase 
		//(los valores de las variables ya estan adentro del metodo de la clase abstracta)
		posicionActual(4000, 785);
		posicionObjetivo();
	}
	//se sobreescriben los metodos que se van a utilizar
	@Override
	protected void ubicarLatitud() {
		System.out.println("estoy a la altura de latitud " + latitud + " del punto de referencia ");
	}
	@Override
	protected void ubicarLongitud() {
		System.out.println("estoy a la altura de longitud " + longitud + " del punto de referencia ");
	}
	
	
}
