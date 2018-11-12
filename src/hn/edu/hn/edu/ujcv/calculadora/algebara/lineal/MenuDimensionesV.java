package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.hn.edu.ujcv.lib.al.VecR3;
import hn.edu.hn.edu.ujcv.lib.al.VecR4;
import hn.edu.ujcv.util.LectorTeclado;


public class MenuDimensionesV {
    private int opcion;
    LectorTeclado lt = LectorTeclado.getInstance();

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
                    VecR2 a1 = leerVectorR2("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR2 b1 = leerVectorR2("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    VecR2 res1 = a1.add(b1);
                    System.out.println("La suma de vectores es: \n ");
                    imprimirVecR2(res1);
                    break;
                case 2:
                    VecR2 a2 = leerVectorR2("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR2 b2 = leerVectorR2("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    VecR2 res2 = a2.sub(b2);
                    System.out.println("La resta de vectores es: \n ");
                    imprimirVecR2(res2);
                    break;
                case 3:
                    double alpha1 = 0;
                    alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR2 a3 = leerVectorR2("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
                    VecR2 res3 = a3.mul(alpha1);
                    imprimirVecR2(res3);
                    break;
                case 4:
                    VecR2 a4 = leerVectorR2("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR2 b4 = leerVectorR2("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    double x1 = a4.dotProduct(b4);
                    System.out.println("El producto punto es: (" + x1 + ")");
                    break;
                case 5:
                    double alpha2 = 0;
                    alpha2 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR2 a5 = leerVectorR2("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
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
                    VecR3 a1 = leerVectorR3("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR3 b1 = leerVectorR3("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    VecR3 res1 = a1.add(b1);
                    System.out.println("La suma de vectores es: \n ");
                    imprimirVecR3(res1);
                    break;
                case 2:
                    VecR3 a2 = leerVectorR3("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR3 b2 = leerVectorR3("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    VecR3 res2 = a2.add(b2);
                    System.out.println("La resta de vectores es: \n ");
                    imprimirVecR3(res2);
                    break;
                case 3:
                    double alpha1 = 0;
                    alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR3 a3 = leerVectorR3("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
                    VecR3 res3 = a3.mul(alpha1);
                    System.out.println("La multiplicacion por un escalar es: \n");
                    imprimirVecR3(res3);
                    break;
                case 4:
                    VecR3 a4 = leerVectorR3("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR3 b4 = leerVectorR3("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    double x2 = a4.dotProduct(b4);
                    System.out.println("El producto punto es: (" + x2 + ")");
                    break;
                case 5:
                    VecR3 a5 = leerVectorR3("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR3 b5 = leerVectorR3("Vector 2","Ingrese el vector 2", "Error! Ha ingresado un caracter no valido");
                    VecR3 res4 = a5.crossProduct(b5);
                    System.out.println("El producto cruz es: \n ");
                    imprimirVecR3(res4);
                    break;
                case 6:
                    double alpha2 = 0;
                    alpha2 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR3 a6 = leerVectorR3("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
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
                    VecR4 a1 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR4 b1 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR4 res1 = a1.add(b1);
                    System.out.println("La suma de vectores es: \n ");
                    imprimirVecR4(res1);
                    break;
                case 2:
                    VecR4 a2 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR4 b2 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR4 res2 = a2.add(b2);
                    System.out.println("La resta de vectores es: \n ");
                    imprimirVecR4(res2);
                    break;
                case 3:
                    double alpha1 = 0;
                    alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR4 a3 = leerVectorR4("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
                    VecR4 res3 = a3.mul(alpha1);
                    System.out.println("La multiplicacion de un escalor por un vector es: \n ");
                    imprimirVecR4(res3);
                    break;
                case 4:
                    VecR4 a4 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    VecR4 b4 = leerVectorR4("Vector 1","Ingrese el vector 1", "Error! Ha ingresado un caracter no valido");
                    double x3 = a4.dotProduct(b4);
                    System.out.println("El producto punto es: (" + x3 + ")");
                    break;
                case 5:
                    double alpha2 = 0;
                    alpha2 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                    VecR4 a5 = leerVectorR4("Vector","Ingrese el vector", "Error! Ha ingresado un caracter no valido");
                    VecR4 res4 = a5.div(alpha2);
                    System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",res4.getX()) +
                            "," + String.format("%.2f",res4.getY())+ "," + String.format("%.2f",res4.getZ())+ "," +
                            String.format("%.2f",res4.getW())+")");
                    break;
                case 6:
                    System.out.println("Has regresado al menu principal \n \n");
                    break;
            }
        return opcion;
    }

    public VecR2 leerVectorR2(String nombreVector, String mensaje, String mensajeError){
        VecR2 a = new VecR2(1.0,1.1);
        a.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
        a.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR2(a);
    }


    public VecR3 leerVectorR3(String nombreVector, String mensaje, String mensajeError){
        VecR3 a = new VecR3(1.0,1.1,0.3);
        a.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
        a.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        a.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR3(a);
    }

    public VecR4 leerVectorR4(String nombreVector, String mensaje, String mensajeError){
        VecR4 a = new VecR4(1.0,1.1,0.3,0.5);
        a.setX(lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido"));
        a.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        a.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        a.setW(lt.leerReal("Ingrese el cuarto numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR4(a);
    }

    public void imprimirVecR2(VecR2 a){
        System.out.println("(" + a.getX() +","+ a.getY()+ ")");
    }

    public void imprimirVecR3(VecR3 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ()+")");
    }

    public void imprimirVecR4(VecR4 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ() +","+ a.getW()+")");
    }
}
