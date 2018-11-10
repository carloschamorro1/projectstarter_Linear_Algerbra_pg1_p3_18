package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.*;

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
        switch (opcion) {
            case 1:
                Mat2x2 mat1 = leerMatriz2x2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 mat2 = leerMatriz2x2("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat2x2 res1 = mat1.suma(mat2);
                System.out.println("La suma de matrices es \n");
                imprimirMatriz2x2(res1);
                break;
            case 2:
                Mat2x2 mat3 = leerMatriz2x2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 mat4 = leerMatriz2x2("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat2x2 res2 = mat3.resta(mat4);
                imprimirMatriz2x2(res2);
                System.out.println("La resta de matrices es \n");
                break;
            case 3:
                double alpha = 0;
                alpha = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                Mat2x2 mat5 = leerMatriz2x2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 res3 = mat5.mulEscalar(alpha);
                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatriz2x2(res3);
                break;
            case 4:
                Mat2x2 mat6 = leerMatriz2x2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                VecR2 v = new VecR2(0,1);
                v.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                v.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                VecR2 res4 = mat6.mulVector(v);
                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ res4.getX()+"\t|");
                System.out.println("|\t"+ res4.getY()+"\t|");
                break;
            case 5:
                Mat2x2 mat7 = leerMatriz2x2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat2x2 mat8 = leerMatriz2x2("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat2x2 res5 = mat8.mul(mat7);
                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatriz2x2(res5);
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
        switch (opcion) {
            case 1:
                Mat3x3 mat1 = leerMatriz3x3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat3x3 mat2 = leerMatriz3x3("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat3x3 res1 = mat1.suma(mat2);
                System.out.println("La suma de matrices es \n");
                imprimirMatriz3x3(res1);
                break;
            case 2:
                Mat3x3 mat3 = leerMatriz3x3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat3x3 mat4 = leerMatriz3x3("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat3x3 res2 = mat3.resta(mat4);
                System.out.println("La suma de matrices es \n");
                imprimirMatriz3x3(res2);
                break;
            case 3:
                double alpha = 0;
                alpha = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                Mat3x3 mat5 = leerMatriz3x3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat3x3 res3 = mat5.mulEscalar(alpha);
                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatriz3x3(res3);
                break;
            case 4:
                Mat3x3 mat6 = leerMatriz3x3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                VecR3 v = new VecR3(0,1,0);
                v.setX(lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setY(lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setZ(lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));
                VecR3 res4 = mat6.mulVector(v);
                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ res4.getX()+"\t|");
                System.out.println("|\t"+ res4.getY()+"\t|");
                System.out.println("|\t"+ res4.getZ()+"\t|");
                break;
            case 5:
                Mat3x3 mat7 = leerMatriz3x3("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat3x3 mat8 = leerMatriz3x3("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat3x3 res5 = mat8.mul(mat7);
                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatriz3x3(res5);
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
        switch (opcion) {
            case 1:
                Mat4x4 mat1 = leerMatriz4x4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat4x4 mat2 = leerMatriz4x4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat4x4 res1 = mat1.suma(mat2);
                System.out.println("La suma de matrices es \n");
                imprimirMatriz4x4(res1);
                break;
            case 2:
                Mat4x4 mat3 = leerMatriz4x4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat4x4 mat4 = leerMatriz4x4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat4x4 res2 = mat3.suma(mat4);
                System.out.println("La suma de matrices es \n");
                imprimirMatriz4x4(res2);
                break;
            case 3:
                double alpha = 0;
                alpha = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                Mat4x4 mat5 = leerMatriz4x4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat4x4 res3 = mat5.mulEscalar(alpha);
                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatriz4x4(res3);
                break;
            case 4:
                Mat4x4 mat6 = leerMatriz4x4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                VecR4 v = new VecR4(0,1,0,0);
                v.setX(lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setY(lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setZ(lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));
                v.setW(lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido"));
                VecR4 res4 = mat6.mulVector(v);
                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ res4.getX()+"\t|");
                System.out.println("|\t"+ res4.getY()+"\t|");
                System.out.println("|\t"+ res4.getZ()+"\t|");
                System.out.println("|\t"+ res4.getW()+"\t|");
                break;
            case 5:
                Mat4x4 mat7 = leerMatriz4x4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                Mat4x4 mat8 = leerMatriz4x4("\n Matriz 2", "Ingrese la matriz 2", "Error ha ingresado un caracter no valido");
                Mat4x4 res5 = mat8.mul(mat7);
                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatriz4x4(res5);
                break;
            case 6:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public Mat2x2 leerMatriz2x2(String nombreMatriz, String mensaje, String mensajeError) {
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

    public Mat3x3 leerMatriz3x3(String nombreMatriz, String mensaje, String mensajeError) {
        VecR3 colx = new VecR3(1,0,0);
        VecR3 coly = new VecR3(0, 1,0);
        VecR3 colz = new VecR3(0,0,1);
        // mensaje:
        // ingrese el valor de fila %i, columna %i de matriz n
        System.out.println(nombreMatriz);
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 && j == 1)
                    colx.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    coly.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 3)
                    colz.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    colx.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    coly.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 3)
                    colz.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 1)
                    colx.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 2)
                    coly.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 3)
                    colz.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new Mat3x3(colx,coly,colz);
    }

    public Mat4x4 leerMatriz4x4(String nombreMatriz, String mensaje, String mensajeError) {
        VecR4 colx = new VecR4(1,0,0,0);
        VecR4 coly = new VecR4(0, 1,0,0);
        VecR4 colz = new VecR4(0,0,1,0);
        VecR4 colw = new VecR4(0,0,1,0);
        // mensaje:
        // ingrese el valor de fila %i, columna %i de matriz n
        System.out.println(nombreMatriz);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 1 && j == 1)
                    colx.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 2)
                    coly.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 3)
                    colz.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 1 && j == 4)
                    colw.setX(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 1)
                    colx.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 2)
                    coly.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 3)
                    colz.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 2 && j == 4)
                    colw.setY(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 1)
                    colx.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 2)
                    coly.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 3)
                    colz.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 3 && j == 4)
                    colw.setZ(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 1)
                    colx.setW(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 2)
                    coly.setW(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 3)
                    colz.setW(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
                if (i == 4 && j == 4)
                    colw.setW(lt.leerReal("Ingrese el valor de fila " + i + " de la columna " + j, "Error ha ingresado un caracter no valido"));
            }
        }
        return new Mat4x4(colx,coly,colz,colw);
    }

    public void imprimirMatriz2x2(Mat2x2 a){
        System.out.println("|\t" + a.getFilaX().getX() + "  " + a.getFilaX().getY() + "\t|");
        System.out.println("|\t" + a.getFilaY().getX() + "  " + a.getFilaY().getY() + "\t|");
    }

    public void imprimirMatriz3x3(Mat3x3 a){
        System.out.println("|\t" + a.getColX().getX() + "  " + a.getColY().getX() + "  " + a.getColZ().getX() + "\t|");
        System.out.println("|\t" + a.getColX().getY() + "  " + a.getColY().getY() + "  " + a.getColZ().getY() + "\t|");
        System.out.println("|\t" + a.getColX().getZ() + "  " + a.getColY().getZ() + "  " + a.getColZ().getZ() + "\t|");
    }

    public void imprimirMatriz4x4(Mat4x4 a){
        System.out.println("|\t" + a.getColX().getX() + "  " + a.getColY().getX() + "  " + a.getColZ().getX() + "  "+ a.getColW().getX() + "\t|");
        System.out.println("|\t" + a.getColX().getY() + "  " + a.getColY().getY() + "  " + a.getColZ().getY() + "  "+ a.getColW().getY() + "\t|");
        System.out.println("|\t" + a.getColX().getZ() + "  " + a.getColY().getZ() + "  " + a.getColZ().getZ() + "  "+ a.getColW().getZ() + "\t|");
        System.out.println("|\t" + a.getColX().getW() + "  " + a.getColY().getW() + "  " + a.getColZ().getW() + "  "+ a.getColW().getW() + "\t|");
    }
}



