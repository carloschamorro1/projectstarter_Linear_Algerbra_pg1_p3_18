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
                    a2.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a2.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b2.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b2.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                   VecR2 res2 = a2.sub(b2);
                    System.out.println("La resta de vectores es: (" + res2.getX() +","+ res2.getY()+ ")");
                    break;
                case 3:
                    VecR2 a3 = new VecR2(1.0,1.1);
                    double alpha1 = 0;
                    alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    a3.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                    a3.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    VecR2 res3 = a3.mul(alpha1);
                    System.out.println("La multiplicacion por un escalar es: (" + res3.getX() +","+ res3.getY()+ ")");
                    break;
                case 4:
                    VecR2 a4 = new VecR2(1.0,1.1);
                    VecR2 b4 = new VecR2(1.0,1.1);
                    a4.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a4.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b4.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b4.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    double x1 = a4.dotProduct(b4);
                    System.out.println("El producto punto es: (" + x1 + ")");
                    break;
                case 5:
                    VecR2 a5 = new VecR2(1.0,1.1);
                    double alpha2 = 0;
                    alpha2 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    a5.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                    a5.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    VecR2 res4 = a5.div(alpha2);
                    System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",res4.getX()) + "y:"
                            + String.format("%.2f",res4.getY()));
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
                    a1.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a1.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    a1.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b1.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b1.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    b1.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    VecR3 res1 = a1.add(b1);
                    System.out.println("La suma de vectores es: (" + res1.getX() +","+ res1.getY()+ ","+ res1.getZ()+ ")");
                    break;
                case 2:
                    VecR3 a2 = new VecR3(1.0,1.1,1.0);
                    VecR3 b2 = new VecR3(2.2,3.0,1.0);
                    a2.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a2.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    a2.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b2.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b2.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    b2.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    VecR3 res2 = a2.sub(b2);
                    System.out.println("La resta de vectores es: (" + res2.getX() +","+ res2.getY()+ ","+ res2.getZ()+ ")");
                    break;
                case 3:
                    VecR3 a3 = new VecR3(1.0,1.1,1.0);
                    double alpha1 = 0;
                    alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    a3.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                    a3.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    a3.setZ(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    VecR3 res3 = a3.mul(alpha1);
                    System.out.println("La multiplicacion por un escalar es: (" + res3.getX() +","+ res3.getY()+ ","+ res3.getZ()+ ")");
                    break;
                case 4:
                    VecR3 a4 = new VecR3(1.0,1.1,1.0);
                    VecR3 b4 = new VecR3(1.0,1.1,1.0);
                    a4.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a4.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    a4.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b4.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b4.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    b4.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    double x2 = a4.dotProduct(b4);
                    System.out.println("El producto punto es: (" + x2 + ")");
                    break;
                case 5:
                    VecR3 a5 = new VecR3(1.0,1.1,1.0);
                    VecR3 b5 = new VecR3(1.0,1.1,1.0);
                    a5.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    a5.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    a5.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    b5.setX(lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido"));
                    b5.setY (lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido"));
                    b5.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
                    VecR3 res4 = a5.crossProduct(b5);
                    System.out.println("El producto cruz es: (" + res4.getX() +","+ res4.getY()+ ","+ res4.getZ()+ ")");
                    break;
                case 6:
                    VecR3 a6 = new VecR3(1.0,1.1,1.0);
                    double alpha2 = 0;
                    alpha2 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    a6.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                    a6.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    a6.setZ(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                    VecR3 res5 = a6.div(alpha2);
                    System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",res5.getX()) +
                            "," + String.format("%.2f",res5.getY())+ "," + String.format("%.2f",res5.getZ())+ ")");
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
