package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.Mat2x2;
import hn.edu.hn.edu.ujcv.lib.al.Mat3x3;
import hn.edu.hn.edu.ujcv.lib.al.Mat4x4;
import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.ujcv.util.LectorTeclado;

public class MenuDimensionesM {
    private int opcion;
    LectorTeclado lt = new LectorTeclado();

    public void presentarOpciones2x2() {
        System.out.println("\t \t \t \t Matrices de 2x2");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion por un escalar");
        System.out.println("4.............. Multiplicacion por un vector");
        System.out.println("5.............. Multiplicacion por una matriz");
        System.out.println("6.............. Regresar");
    }

    public int leerOpciones2x2() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcion2x2(int opcion) {
        //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        switch (opcion) {
            case 1:
                Mat2x2 mat1 = leerMatriz("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 mat2 = leerMatriz("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat2x2 res1 = mat1.suma(mat2);
                imprimirMatriz(res1);
                break;
            case 2:
                Mat2x2 mat3 = leerMatriz("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 mat4 = leerMatriz("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat2x2 res2 = mat3.resta(mat4);
                imprimirMatriz(res2);
                break;
            case 3:
                double alpha = 0;
                alpha = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                Mat2x2 mat5 = leerMatriz("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 res3 = mat5.mulEscalar(alpha);
                imprimirMatriz(res3);
                break;
            case 4:
                Mat2x2 mat6 = leerMatriz("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                VecR2 v = new VecR2(0,1);
                v.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                v.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                VecR2 res4 = mat6.mulVector(v);
                System.out.println("La multiplicacion de matriz por vector es : ( "+ res4.getX() + "," + res4.getY() + ")");
                break;
            case 5:
                break;
            case 6:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void presentarOpciones3x3() {
        System.out.println("\t \t \t \t Matrices de 3x3");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion por un escalar");
        System.out.println("4.............. Multiplicacion por un vector");
        System.out.println("5.............. Multiplicacion por una matriz");
        System.out.println("6.............. Regresar");
    }

    public int leerOpciones3x3() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcion3x3(int opcion) {

        //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void presentarOpciones4x4() {
        System.out.println("\t \t \t \t Matrices de 4x4");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion por un escalar");
        System.out.println("4.............. Multiplicacion por un vector");
        System.out.println("5.............. Multiplicacion por una matriz");
        System.out.println("6.............. Regresar al menu principal");
    }

    public int leerOpciones4x4() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcion4x4(int opcion) {
        //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public Mat2x2 leerMatriz(String nombreMatriz, String mensaje, String mensajeError) {
        VecR2 colx = new VecR2(1, 0);
        VecR2 coly = new VecR2(0, 1);
        // mensaje:
        // ingrese el valor de fila %i, columna %i de matriz n
        System.out.println(nombreMatriz);
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (i == 1 && j == 1)
                    colx.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    coly.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    colx.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    coly.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new Mat2x2(colx,coly);
    }

    public void imprimirMatriz(Mat2x2 a){
        System.out.println("\n La suma de matrices es");
        System.out.println("|\t" + a.getFilaX().getX() + "  " + a.getFilaX().getY() + "\t|");
        System.out.println("|\t" + a.getFilaY().getX() + "  " + a.getFilaY().getY() + "\t|");
    }
}



