package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.hn.edu.ujcv.lib.al.VecR3;
import hn.edu.hn.edu.ujcv.lib.al.VecR4;
import hn.edu.ujcv.util.LectorTeclado;

public class MenuDimensionesV {
    private int opcion;
    VecR2 b;
    private double x;
    private double y;
    private double z;
    private double w;
    LectorTeclado lt = new LectorTeclado();
    VecR2 r2 = new VecR2();
    VecR3 r3 = new VecR3();
    VecR4 r4 = new VecR4();



    public void presentarOpcionesR2() {
        System.out.println("\t \t \t \t Vectores en R2");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion");
        System.out.println("4.............. Producto punto");
        System.out.println("5.............. Division entre un escalar");
        System.out.println("6.............. Regresar");
    }

    public int leerOpcionesR2() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionR2(int opcion) {
            //opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
            switch (opcion) {
                case 1:
                    VecR2 a = new VecR2(1.0,1.1);
                    VecR2 b = new VecR2(2.2,3.0);
                    VecR2 res = a.add(b);
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
    public void presentarOpcionesR3() {
        System.out.println("\t \t \t \t Vectores en R3");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion");
        System.out.println("4.............. Producto punto");
        System.out.println("5.............. Producto cruz");
        System.out.println("6.............. Division entre un escalar");
        System.out.println("7.............. Regresar");
    }

    public int leerOpcionesR3() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionR3(int opcion) {
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
                    break;
                case 7:
                    System.out.println("Has regresado al menu principal \n \n");
                    break;
            }
        return opcion;}

    public void presentarOpcionesR4() {
        System.out.println("\t \t \t \t Vectores en R4");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion");
        System.out.println("4.............. Producto punto");
        System.out.println("5.............. Division entre un escalar");
        System.out.println("6.............. Regresar al menu principal");
    }

    public int leerOpcionesR4() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionR4(int opcion) {
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}
