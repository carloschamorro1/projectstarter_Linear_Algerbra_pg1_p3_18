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
        // dividir formula en componentes vectoriales
        // U X V
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
        VecR3 retval = new VecR3();
        retval.x = (this.y * b.z - this.z * b.y);
        retval.y = - (x * b.z - b.x * this.z);
        retval.z = (this.x * b.y - b.y * this.x);
        return retval;
    }

    public VecR3 div(double alpha){
        return new VecR3(x*1/alpha, y*1/alpha, z*1/alpha);
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