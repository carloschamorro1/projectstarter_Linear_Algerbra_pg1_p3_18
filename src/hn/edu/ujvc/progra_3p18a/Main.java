package hn.edu.ujvc.progra_3p18a;

import hn.edu.hn.edu.ujcv.calculadora.algebra.lineal.Run;
import hn.edu.ujcv.util.LectorTeclado;

public class Main {

    public static void main(String[] args) {
        Run programa = new Run();
        programa.run();
        LectorTeclado lt = new LectorTeclado();
        System.out.println("ingrese un entero");
        int x = lt.leerEntero("_?","ingrese un entero");
        System.out.println("el entero que ingreso es: " + x);
	System.out.println("hola mundo!!");
    }
}
