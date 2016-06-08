package Mapa;
//implementa una clase abstracta para aplicar a las interfaces
public abstract class Localidad {
	public int latitud;
	public int longitud;
//primer metodo: indica cuales son los valores con los que se trabaja
protected void posicionActual(int latitudActual, int longitudActual){
	latitud = latitudActual;
	longitud = longitudActual;
	}
//segundo metodo: los contextualiza
protected void posicionObjetivo(){
	String lugar = "la latitud del objetivo es: " + latitud + " y la longitud es : " + longitud;
	System.out.println(lugar);
	}
//metodos que van a usar las clases hijas (que por ser esta una clase abstracta puede heredarle a las hijas los metodos y valores pero las hijas tambien pueden modificarlas)
protected abstract void ubicarLatitud();
protected abstract void ubicarLongitud();
}
