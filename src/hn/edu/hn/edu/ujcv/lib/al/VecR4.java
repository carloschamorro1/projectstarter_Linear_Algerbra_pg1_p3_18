package hn.edu.hn.edu.ujcv.lib.al;

import hn.edu.ujcv.util.LectorTeclado;

public class VecR4 {
    private double x;
    private double y;
    private double z;
    private double w;
    LectorTeclado lt = new LectorTeclado();
    //todo: Definir variables y constructores
    //todo: conformar al contrato de un vector

    public VecR4()
    {
        this.x = 0;
        this.y = 0;
        this.z= 0;
        this.w = 0;
    }

    public VecR4(double x, double y,double z,double w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public VecR4(VecR4 b) {
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }
    public VecR4 add( VecR4 b){
        VecR4 retval = new VecR4();
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el cuarto numero del primer vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        w = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.w = lt.leerReal("Ingrese el cuarto numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x + b.x);
        retval.y = (y + b.y);
        retval.z = (z + b.z);
        retval.w = (w + b.w);
//        System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",retval.x) +
//                "," + String.format("%.2f",retval.y)+ "," + String.format("%.2f",retval.z)+ "," + String.format("%.2f",retval.w) + ")");
        return retval;
    }

    public VecR4 sub(VecR4 b){
        VecR4 retval = new VecR4();
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el cuarto numero del primer vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        w = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.w = lt.leerReal("Ingrese el cuarto numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x - b.x);
        retval.y = (y - b.y);
        retval.z = (z - b.z);
        retval.w = (w - b.w);
//        System.out.println("La suma de vectores es: (" + retval.x +","+ retval.y+ ","+ retval.z + "," + retval.w+")");
        return retval;
    }

    public VecR4 mul(double alpha){
        VecR4 retval = new VecR4();
//        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
//        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido");
//        w = lt.leerReal("Ingrese el cuarto numero del vector","Error! Ha ingresado un caracter no valido");
        retval.x = alpha * x;
        retval.y = alpha * y;
        retval.z = alpha * z;
        retval.w = alpha * w;
//        System.out.println("La multiplicacion del vector por un escalar es: (" + retval.x +","+ retval.y+ ","+ retval.z + "," + retval.w + ")");
        return retval;
    }

    public double dotProduct(VecR4 b){
        // segun google:
        // alpha = (u1 * v1) + (u2 * v2) + (u3 * v3) + (u4 * v4)
        // u es this.
        // v es b.
        // 1 es x.
        // 2 es y.
        // 3 es z.
        // 4 es w.
        double retval = 0.0;
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el cuarto numero del primer vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        w = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.w = lt.leerReal("Ingrese el cuarto numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval = (x*b.x)+ (y * b.y)+(z*b.z)+(w *b.w);
//        System.out.println("El producto punto de los vectores es : (" + retval + ")");
        return retval;
    }

    public VecR4 div(double alpha){
        VecR4 retval = new VecR4();
//        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
//        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido");
//        w = lt.leerReal("Ingrese el cuarto numero del vector","Error! Ha ingresado un caracter no valido");
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        retval.z = 1/alpha * z;
        retval.w = 1/alpha * w;
//        System.out.println("La multiplicacion del vector por un escalar es: (" + retval.x +","+ retval.y+ ","+ retval.z + "," + retval.w + ")");
        return retval;
    }


    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
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