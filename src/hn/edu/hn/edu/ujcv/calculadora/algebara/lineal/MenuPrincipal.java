package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.ujcv.util.LectorTeclado;

public class MenuPrincipal {
    public int opcion;
    MenuMatrices menuMatrices = new MenuMatrices();
    MenuVectores menuVectores = new MenuVectores();
    LectorTeclado lt = LectorTeclado.getInstance();

    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido");
        System.out.println("\n \t \t Calculadora de Algebra Lineal \n");
        System.out.println("1.............. Matrices");
        System.out.println("2.............. Vectores");
        System.out.println("3.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {

            //opcion1 = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
            switch (opcion) {
                case 1:
                    menuMatrices.presentarOpciones();
                    menuMatrices.procesarOpcion(menuMatrices.leerOpciones());
                    break;
                case 2:
                    menuVectores.presentarOpciones();
                    menuVectores.procesarOpcion(menuVectores.leerOpciones());
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el programa");
                    break;
            }
    }
}
