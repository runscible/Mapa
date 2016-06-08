package Mapa;

public class Main {
public static void main(String[] args ){
	//se declara el metodo (primero la abstracta y despues la clase hija)
	Localidad aca = new Ubicacion();
	//los metodos que se van a utilizar (no se tienen porque usar todos)
	aca.ubicarLatitud();
	aca.ubicarLongitud();
	}
}
