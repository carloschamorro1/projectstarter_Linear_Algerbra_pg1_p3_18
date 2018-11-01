package hn.edu.hn.edu.ujcv.lib.al;
import hn.edu.ujcv.util.LectorTeclado;
public class VecR2 {
    private double x;
    private double y;

    LectorTeclado lt = new LectorTeclado();

    public VecR2 add(VecR2 b){
        VecR2 retval = new VecR2();
        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
        y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        b.y = lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x+y);
        retval.y = (b.x+b.y);
        System.out.println("La suma de vectores es: (" + retval.x +","+ retval.y+ ")");
        return retval;
    }

    public VecR2 sub(VecR2 b){
        VecR2 retval = new VecR2();
        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
        y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        b.y = lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido");
        retval.x = (x-y);
        retval.y = (b.x-b.y);
        System.out.println("La resta de vectores es: (" + retval.x +","+ retval.y+ ")");
        return retval;
    }

    public VecR2 mul(double alpha){
        VecR2 retval = new VecR2();
        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
        retval.x = alpha * x;
        retval.y = alpha * y;
        System.out.println("La multiplicacion del vector por un escalar es: (" + retval.x +","+ retval.y+ ")");
        return retval;
    }

    public double dotProduct(VecR2 b){
        // segun google:
        // alpha = (u1 * v1) + (u2 * v2)
        // u es this.
        // v es b.
        // 1 es x.
        // 2 es y.
        double retval;
        x = lt.leerReal("Ingrese el primer numero del primer vector","Error! Ha ingresado un caracter no valido");
        b.x = lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido");
        y = lt.leerReal("Ingrese el primer numero del segundo vector","Error! Ha ingresado un caracter no valido");
        b.y = lt.leerReal("Ingrese el segundo numero del primer vector","Error! Ha ingresado un caracter no valido");
        retval = (x * y) + (b.x * b.y);
        System.out.println("El producto punto de los vectores es : (" + retval + ")");
        return retval;
    }

    public VecR2()
    {
        this.x = 0;
        this.y = 0;
    }

    public VecR2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public VecR2 div(double alpha){
        VecR2 retval = new VecR2();
        alpha = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
        x = lt.leerReal("Ingrese el primer numero del vector","Error! Ha ingresado un caracter no valido");
        y = lt.leerReal("Ingrese el segundo numero del vector","Error! Ha ingresado un caracter no valido");
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        System.out.println("La division del vector entre un escalar es: (" + String.format("%.2f",retval.x) + "y:" + String.format("%.2f",retval.y));
        return retval;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() { return y;}

    public void setY(double y) { this.y = y;}

}
