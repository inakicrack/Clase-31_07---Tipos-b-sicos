//Autor: Iñaki F.P. 
//Fecha: 31/07/2021
//Checkeando == y ===

public class CheckingEqual {
    public void ejecutar() {
    	MiClase a = new MiClase(7);
    	MiClase b = new MiClase(7);
    	MiClase c = a;
    	
    	String miCadena = "";
    	miCadena += "El valor de a es: " + a.toString();
    	miCadena += "\nEl valor de b es: " + b.toString();
    	miCadena += "\nEl valor de c es: " + c.toString() + "\n";
    	System.out.println(miCadena);
    	
    	if (a.equals(b)) {
    		System.out.println("a == b es true");
    	} else {
    		System.out.println("a == b es falso");
    	}
    	
    	if (a == c) {
    		System.out.println("a == c es true");
    	} else {
    		System.out.println("a == c es falso");
    	}
    	int d = a.getValor() + b.getValor();
    }
}
