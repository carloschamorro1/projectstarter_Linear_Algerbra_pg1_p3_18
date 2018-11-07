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
        retval.x = (x+b.x);
        retval.y = (y+b.y);
        retval.z = (z+b.z);
        return retval;
    }

    public VecR3 sub(VecR3 b){
        VecR3 retval = new VecR3();
        retval.x = (x-b.x);
        retval.y = (y- b.y);
        retval.z = (z-b.z);
        return retval;
    }

    public VecR3 mul(double alpha){
        VecR3 retval = new VecR3();
        retval.x = alpha * x;
        retval.y = alpha * y;
        retval.z = alpha * z;
        return retval;
    }

    public double dotProduct(VecR3 b){
        double retval = 0.0;
        retval = (this.x*b.x)+(this.y*b.y)+(this.z*b.z);
        return retval;
    }

    public VecR3 crossProduct(VecR3 b){
        VecR3 retval = new VecR3();
        retval.x = (y * b.z - z * b.y);
        retval.y = - (x * b.z - b.x * z);
        retval.z = (x * b.y - y * b.x);
        return retval;
    }
    public VecR3 div(double alpha){
        VecR3 retval = new VecR3();
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        retval.z = 1/alpha * z;
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