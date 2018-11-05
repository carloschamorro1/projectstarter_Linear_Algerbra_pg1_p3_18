package hn.edu.hn.edu.ujcv.lib.al;

import hn.edu.ujcv.util.LectorTeclado;

public class VecR3 {
    private double x;
    private double y;
    private double z;
    LectorTeclado lt = new LectorTeclado();
    public VecR3()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public VecR3(double x, double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public VecR3(VecR3 b) {
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }
    //todo: Definir variables y constructores


    //todo: conformar al contrato de un vector

    public VecR3 add(VecR3 b){
        VecR3 retval = new VecR3();
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x+b.x);
        retval.y = (y+b.y);
        retval.z = (z+b.z);
//        System.out.println("La suma de vectores es: (" + retval.x +","+ retval.y+ ","+ retval.z +")");
        return retval;
    }

    public VecR3 sub(VecR3 b){
        VecR3 retval = new VecR3();
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x-b.x);
        retval.y = (y- b.y);
        retval.z = (z-b.z);
//        System.out.println("La suma de vectores es: (" + retval.x +","+ retval.y+ ","+ retval.z +")");
        return retval;
    }

    public VecR3 mul(double alpha){
        VecR3 retval = new VecR3();
//        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
//        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el tercer numero del  vector","Error! Ha ingresado un caracter no valido");
        retval.x = alpha * x;
        retval.y = alpha * y;
        retval.z = alpha * z;
//        System.out.println("La multiplicacion del vector por un escalar es: (" + retval.x +","+ retval.y+ ","+ retval.z + ")");
        return retval;
    }

    public double dotProduct(VecR3 b){
        // segun google:
        // alpha = (u1 * v1) + (u2 * v2) + (u3 * v3)
        // u es this.
        // v es b.
        // 1 es x.
        // 2 es y.
        // 3 es z.
        double retval = 0.0;
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval = (this.x*b.x)+(this.y*b.y)+(this.z*b.z);
//        System.out.println("El producto punto de los vectores es : (" + retval + ")");
        return retval;
    }

    public VecR3 crossProduct(VecR3 b){
        // dividir formula en componentes vectoriales
        // U X V
        //       x y  z
        //sea U [1,2,-2] = this
        //sea V [3,0,1 ] = b
        //               x     y     z
        //          |    i     j     k |
        // U X V =  | x  1     2    -2 |  =  [2, -7, -6]
        //          | y  3     0     1 |
        // formula por componenters
        // i = (u2 * v3 - u3 * v2)
        // j = -(u1 * v3 - v1 * u3)
        // k = (u1 * v2 - u2 * v1) b.
        //(x    b.x  y )
        //(b.y  z   b.z)
        VecR3 retval = new VecR3();
//        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el tercer numero del primer vector","Error! Ha ingresado un caracter no valido");
//        b.y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el segundo numero del segundo vector","Error! Ha ingresado un caracter no valido");
//        b.z = lt.leerReal("Ingrese el tercer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        retval.x = (y * b.z - z * b.y);
        retval.y = - (x * b.z - b.x * z);
        retval.z = (x * b.y - y * b.x);
//        System.out.println("El producto cruz es: ( " +retval.x + "," + retval.y + "," +retval.z + ")");
        return retval;
    }

    public VecR3 div(double alpha){
        VecR3 retval = new VecR3();
//        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
//        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
//        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
//        z = lt.leerReal("Ingrese el tercer numero del vector","Error! Ha ingresado un caracter no valido");
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        retval.z = 1/alpha * z;
//        System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",retval.x) +
//                            "," + String.format("%.2f",retval.y)+ "," + String.format("%.2f",retval.z)+ ")");
        return retval;
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
}