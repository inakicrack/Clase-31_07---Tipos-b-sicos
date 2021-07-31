//Autor: Iñaki F.P. 
//Fecha: 31/07/2021
//Ejemplos de usos de tipos básicos

public class TiposBasicos {
   static public void mostrarLimites(){
	   int miEntero = 0;
	   short miShort = 0;
	   byte miByte = 0;
	   long miLong = 0;
	   char miChar = 'a';
	   double miDouble = 0;
	   float miFloat = 0;
   
	   System.out.println("Datos de tipos primitivos: \n");
	   
	   String miCadena = "";
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo int (Integer):";
	   miCadena += "\nEl tamaño en memoria de un int es: " + Integer.toString(Integer.BYTES);
	   miCadena += "\nEl valor máx es: " + Integer.toString(Integer.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Integer.toString(Integer.MIN_VALUE) + "\n";
	 
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo long (Long):";
	   miCadena += "\nEl tamaño en memoria de un long es: " + Integer.toString(Long.BYTES);
	   miCadena += "\nEl valor máx es: " + Long.toString(Long.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Long.toString(Long.MIN_VALUE) + "\n";
	   
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo short (Short):";
	   miCadena += "\nEl tamaño en memoria de un short es: " + Integer.toString(Short.BYTES);
	   miCadena += "\nEl valor máx es: " + Short.toString(Short.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Short.toString(Short.MIN_VALUE) + "\n";
	   
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo byte (Byte):";
	   miCadena += "\nEl tamaño en memoria de un byte es: " + Integer.toString(Byte.BYTES);
	   miCadena += "\nEl valor máx es: " + Byte.toString(Byte.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Byte.toString(Byte.MIN_VALUE) + "\n";
	   
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo float (Float):";
	   miCadena += "\nEl tamaño en memoria de un float es: " + Integer.toString(Float.BYTES);
	   miCadena += "\nEl valor máx es: " + Float.toString(Float.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Float.toString(Float.MIN_VALUE) + "\n";
	   
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo double (Double):";
	   miCadena += "\nEl tamaño en memoria de un double es: " + Integer.toString(Double.BYTES);
	   miCadena += "\nEl valor máx es: " + Double.toString(Double.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Double.toString(Double.MIN_VALUE) + "\n";
	   
	   miCadena += "\nVamos a poner datos sobre el tipo primitivo char (Character):";
	   miCadena += "\nEl tamaño en memoria de un char es: " + Integer.toString(Character.BYTES);
	   miCadena += "\nEl valor máx es: " + Character.toString(Character.MAX_VALUE);
	   miCadena += "\nEl valor mín es: " + Character.MIN_VALUE + "\n";
	   
	   System.out.println(miCadena);

	}
}