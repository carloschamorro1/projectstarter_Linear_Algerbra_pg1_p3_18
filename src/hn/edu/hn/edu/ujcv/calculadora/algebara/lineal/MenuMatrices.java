package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.Mat2x2;
import hn.edu.hn.edu.ujcv.lib.al.Mat3x3;
import hn.edu.hn.edu.ujcv.lib.al.Mat4x4;
import hn.edu.ujcv.util.LectorTeclado;

public class MenuMatrices {
    public int opcion;
    MenuDimensionesM menuDimensionesM = new MenuDimensionesM();
    LectorTeclado lt = new LectorTeclado();
    Mat2x2 mat2x2 = new Mat2x2();
    Mat3x3 mat3x3 = new Mat3x3();
    Mat4x4 mat4x4 = new Mat4x4();

    public void presentarOpciones() {
        System.out.println("\t \t \t \t Matrices");
        System.out.println("\n \t \t Dimensiones \n");
        System.out.println("1.............. Matriz 2x2");
        System.out.println("2.............. Matriz 3x3");
        System.out.println("3.............. Matriz 4x4");
        System.out.println("4.............. Regresar al menu principal");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        switch (opcion) {
            case 1:
                menuDimensionesM.presentarOpciones2x2();
                menuDimensionesM.procesarOpcion2x2(menuDimensionesM.leerOpciones2x2());
                break;
            case 2:
                menuDimensionesM.presentarOpciones3x3();
                menuDimensionesM.procesarOpcion3x3(menuDimensionesM.leerOpciones3x3());
                break;
            case 3:
                menuDimensionesM.presentarOpciones4x4();
                menuDimensionesM.procesarOpcion4x4(menuDimensionesM.leerOpciones4x4());
                break;
            case 4:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
    }
}

