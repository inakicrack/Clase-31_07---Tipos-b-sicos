//Autor: Iñaki F.P. 
//Fecha: 31/07/2021
//Clase auxiiar que se usa en CheckingEqual

public class MiClase extends Object{
    int valor;
    public MiClase(int valor_inicial) {
    	this.valor = valor_inicial;
    }
    
    public String toString() {
    	return Integer.toString(this.valor);
    }
    
    public int getValor() {
    	return this.valor;
    }
    
  /*  public boolean equal(MiClase derecho) {
    	System.out.println("Estamos llamando a nuestro equals");
    	if (this.valor == derecho.getValor()) {
    		return true;
    	} else {
    		return false;
    	}
    }
  */
    public boolean equals(Object obj) {
    	MiClase aux = (MiClase)obj;
    	System.out.println("Estamos llamando a nuestro equals");
    	if (this.valor == aux.getValor()) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void chorra(){
    	System.out.println("Haciendo el chorra");
    }
}
