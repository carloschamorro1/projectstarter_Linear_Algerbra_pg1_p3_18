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
                case 1: ;
                    VecR2 col1x = new VecR2(1,0);
                    VecR2 col1y = new VecR2(0,1);
                    VecR2 col2x = new VecR2(1,0);
                    VecR2 col2y = new VecR2(0,1);
                    Mat2x2 a1 = new Mat2x2(col1x, col1y);
                    Mat2x2 a2 = new Mat2x2(col1x, col1y);
                    col1x.setX(lt.leerReal("Ingrese el primer numero de la primera fila de la matriz 1", "Error ha ingresado un caracter no valido"));
                    col1x.setY(lt.leerReal("Ingrese el segundo numero de la primera fila de la matriz 1", "Error ha ingresado un caracter no valido"));
                    col1y.setX(lt.leerReal("Ingrese el primer numero  de la segunda fila de la matriz 1", "Error ha ingresado un caracter no valido"));
                    col1y.setY(lt.leerReal("Ingrese el segundo numero de la segunda fila de la matriz 1", "Error ha ingresado un caracter no valido"));
                    col2x.setX(lt.leerReal("Ingrese el primer numero de la primera fila de la matriz 2", "Error ha ingresado un caracter no valido"));
                    col2x.setY(lt.leerReal("Ingrese el segundo numero de la primera fila de la matriz 2", "Error ha ingresado un caracter no valido"));
                    col2y.setX(lt.leerReal("Ingrese el primer numero  de la segunda fila de la matriz 2", "Error ha ingresado un caracter no valido"));
                    col2y.setY(lt.leerReal("Ingrese el segundo numero de la segunda fila de la matriz 2", "Error ha ingresado un caracter no valido"));
                    Mat2x2 res1 = a1.suma(a2);
                    System.out.println("|" + col1x.getX()+ " "+ col1x.getY()+ "|");
                    System.out.println("|" + col1y.getX()+ " "+ col1y.getY()+ "|");
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
        return opcion;}

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
        return opcion;}
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
        return opcion;}
}



