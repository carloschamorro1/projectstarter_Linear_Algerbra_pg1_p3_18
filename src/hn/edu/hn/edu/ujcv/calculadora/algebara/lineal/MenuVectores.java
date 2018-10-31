package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.ujcv.util.LectorTeclado;

public class MenuVectores {
    public int opcion2;
    MenuDimensionesV menuDimensionesV = new MenuDimensionesV();
    LectorTeclado lt = new LectorTeclado();

    public void presentarOpciones(){
        System.out.println("\t \t \t \t Vectores");
        System.out.println("\n \t \t Dimensiones \n");
        System.out.println("1.............. Vector en R2");
        System.out.println("2.............. Vector en R3");
        System.out.println("3.............. Vector en R4");
        System.out.println("4.............. Regresar al menu principal");
    }
    public int leerOpciones() {
        opcion2 = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion2;
    }

    public int procesarOpcion(int opcion2) {
            //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
            switch (opcion2) {
                case 1: menuDimensionesV.presentarOpcionesR2();
                    menuDimensionesV.procesarOpcionR2(menuDimensionesV.leerOpcionesR2());
                    break;
                case 2: menuDimensionesV.presentarOpcionesR3();
                    menuDimensionesV.procesarOpcionR3(menuDimensionesV.leerOpcionesR3());
                    break;
                case 3: menuDimensionesV.presentarOpcionesR4();
                    menuDimensionesV.procesarOpcionR4(menuDimensionesV.leerOpcionesR4());
                    break;
                case 4:
                    System.out.println("Has regresado al menu principal \n \n");
                    break;
            }
        return opcion2;
    }
}
