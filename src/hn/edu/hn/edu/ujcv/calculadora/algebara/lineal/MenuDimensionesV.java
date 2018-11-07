package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.hn.edu.ujcv.lib.al.VecR3;
import hn.edu.hn.edu.ujcv.lib.al.VecR4;
import hn.edu.ujcv.util.LectorTeclado;


public class MenuDimensionesV {
    private int opcion;
    LectorTeclado lt = new LectorTeclado();

    public void presentarOpcionesR2() {
        System.out.println("\t \t \t \t Vectores en R2");
        System.out.println("1.............. Suma");
        System.out.println("2.............. Resta");
        System.out.println("3.............. Multiplicacion por un escalar");
        System.out.println("4.............. Producto punto");
        System.out.println("5.............. Division entre un escalar");
        System.out.println("6.............. Regresar");
    }

    public int leerOpcionesR2() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionR2(int opcion) {
            switch (opcion) {
                case 1:
                    VecR2 a1 = new VecR2(1.0,1.1);
                    VecR2 b1 = new VecR2(2.2,3.0);
                    a1.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a1.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b1.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b1.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    VecR2 res1 = a1.add(b1);
                    System.out.println("La suma de vectores es: (" + res1.getX() +","+ res1.getY()+ ")");
                    break;
                case 2:
                    VecR2 a2 = new VecR2(1.0,1.1);
                    VecR2 b2 = new VecR2(2.2,3.0);
                   VecR2 res2 = a2.sub(b2);
                    break;
                case 3:
                    VecR2 a3 = new VecR2(1.0,1.1);
                    double alpha1 = 0;
                    VecR2 res3 = a3.mul(alpha1);
                    break;
                case 4:
                    VecR2 a4 = new VecR2(1.0,1.1);
                    VecR2 b4 = new VecR2(1.0,1.1);
                    a4.dotProduct(b4);
                    break;
                case 5:
                    VecR2 a5 = new VecR2(1.0,1.1);
                    double alpha2 = 0;
                    a5.div(alpha2);
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
        System.out.println("3.............. Multiplicacion por un escalar");
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
            switch (opcion) {
                case 1:
                    VecR3 a1 = new VecR3(1.0,1.1,1.0);
                    VecR3 b1 = new VecR3(2.2,3.0,1.0);
                    VecR3 res1 = a1.add(b1);
                    break;
                case 2:
                    VecR3 a2 = new VecR3(1.0,1.1,1.0);
                    VecR3 b2 = new VecR3(2.2,3.0,1.0);
                    VecR3 res2 = a2.sub(b2);
                    break;
                case 3:
                    VecR3 a3 = new VecR3(1.0,1.1,1.0);
                    double alpha1 = 0;
                    VecR3 res3 = a3.mul(alpha1);
                    break;
                case 4:
                    VecR3 a4 = new VecR3(1.0,1.1,1.0);
                    VecR3 b4 = new VecR3(1.0,1.1,1.0);
                    a4.dotProduct(b4);
                    break;
                case 5:
                    VecR3 a5 = new VecR3(1.0,1.1,1.0);
                    VecR3 b5 = new VecR3(1.0,1.1,1.0);
                    a5.crossProduct(b5);
                    break;
                case 6:
                    VecR3 a6 = new VecR3(1.0,1.1,1.0);
                    double alpha2 = 0;
                    a6.div(alpha2);
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
        System.out.println("3.............. Multiplicacion por un escalar");
        System.out.println("4.............. Producto punto");
        System.out.println("5.............. Division entre un escalar");
        System.out.println("6.............. Regresar al menu principal");
    }

    public int leerOpcionesR4() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionR4(int opcion) {
            switch (opcion) {
                case 1:
                    VecR4 a1 = new VecR4(1.0,1.1,1.0,1.0);
                    VecR4 b1 = new VecR4(2.2,3.0,1.0,1.0);
                    VecR4 res1 = a1.add(b1);
                    break;
                case 2:
                    VecR4 a2 = new VecR4(1.0,1.1,1.0,1.0);
                    VecR4 b2 = new VecR4(2.2,3.0,1.0,1.0);
                    VecR4 res2 = a2.sub(b2);
                    break;
                case 3:
                    VecR4 a3 = new VecR4(1.0,1.1,1.0,1.0);
                    double alpha1 = 0;
                    VecR4 res3 = a3.mul(alpha1);
                    break;
                case 4:
                    VecR4 a4 = new VecR4(1.0,1.1,1.0,1.0);
                    VecR4 b4 = new VecR4(1.0,1.1,1.0, 1.0);
                    a4.dotProduct(b4);
                    break;
                case 5:
                    VecR4 a5 = new VecR4(1.0,1.1,1.0,1.0);
                    double alpha2 = 0;
                    a5.div(alpha2);
                    break;
                case 6:
                    System.out.println("Has regresado al menu principal \n \n");
                    break;
            }
        return opcion;
    }
}
