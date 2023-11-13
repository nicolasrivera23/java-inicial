package com.mycompany.ejemplo;

/**
 *
 * @author Nicolas
 */

import com.mycompany.entity.Orador;

public class Ejemplo {

    //Main es nuestro punto de entrada a una aplicación Java
    public static void main(String[] args) {
        
        System.out.println("Hello World!" + 2);
        
        //Tipo String cadena de texto
        String cadena = "Hola Mundo";
        
        System.out.println("Length de la variable cadena: " + cadena.length());
        
        System.out.println(cadena);
        
        int numeroInt = -2147483647;
        System.out.println(numeroInt);
        
        long numeroEntero = -2147483648L;
        
        byte nroByte = -127;
        
        short nroShort = -32767;
        
        boolean isVerdad = false;
        
        char letra = 'c';
        
        int nroUno = 2;
        
        int nroDos = 2;
        
        int nroTres = 3;
        
        int nroCuatro = 4;
        
        
        System.out.println( "total: " + (nroUno + nroDos) );
        System.out.println( "total: " + (nroUno - nroDos) );
        System.out.println( "total: " + (nroUno / nroDos) );
        System.out.println( "total: " + (nroUno * nroDos) );
        
        if(nroUno <= nroDos){
            System.out.println("Nro Uno es menor o igual a nro dos");
        } else{
            System.out.println("nro uno es mayor a numero 2");
        }
        
        if( (nroUno == nroDos) && (nroTres == nroCuatro) ){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        if( (nroUno == nroDos) || (nroTres == nroCuatro) ){
            System.out.println("Una sentencia minimo es verdadera");
        } else {
            System.out.println("Ninguna sentencia es verdadera");
        }
        
        
        //Arrays
        String [] palabras = {"Hola", "Mundo", "Palabra"};
        
        System.out.println(palabras[-3]);
        
                
        int [] numeros = new int[10];
        
        numeros[0] = 10;
        numeros[1] = 20;
        
        numeros[9] = 77;

        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); 
        }
              
        
        Orador oradorUno = new Orador(1L, "Bill", "Gates", "Nuevo Orden Mundial");
        
        //System.out.println("Instancia oradorUno: " + oradorUno);
        
        
    }
}
