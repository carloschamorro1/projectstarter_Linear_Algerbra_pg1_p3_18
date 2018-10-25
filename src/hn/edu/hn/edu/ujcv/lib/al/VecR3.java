package hn.edu.hn.edu.ujcv.lib.al;

public class VecR3 {
    private double x;
    private double y;
    private double z;

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
    //todo: Definir variables y constructores


    //todo: conformar al contrato de un vector

    public VecR3 add(VecR3 b){
        return new VecR3(x+b.x, y+b.y, z+b.z);
    }

    public VecR3 sub(VecR3 b){
        return new VecR3(x-b.x, y-b.y, z-b.z);
    }

    public VecR3 mul(double alpha){
        return new VecR3(x*alpha, y*alpha, z*alpha);
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
        retval = (this.x * b.x)+ (this.y * b.y) + (this.z * b.z);
        return retval;
    }

    public VecR3 crossProduct(VecR3 b){
        // ? buscar formula en google.com o en duckduckgo
        VecR3 retval = new VecR3();

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
