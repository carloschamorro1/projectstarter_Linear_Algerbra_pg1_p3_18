package hn.edu.hn.edu.ujcv.lib.al;


public class VecR4 {
    private double x;
    private double y;
    private double z;
    private double w;


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
        retval.x = (x + b.x);
        retval.y = (y + b.y);
        retval.z = (z + b.z);
        retval.w = (w + b.w);
        return retval;
    }

    public VecR4 sub(VecR4 b){
        VecR4 retval = new VecR4();
        retval.x = (x - b.x);
        retval.y = (y - b.y);
        retval.z = (z - b.z);
        retval.w = (w - b.w);
        return retval;
    }

    public VecR4 mul(double alpha){
        VecR4 retval = new VecR4();
        retval.x = alpha * x;
        retval.y = alpha * y;
        retval.z = alpha * z;
        retval.w = alpha * w;
        return retval;
    }

    public double dotProduct(VecR4 b){
        double retval;
        retval = (x*b.x)+ (y * b.y)+(z*b.z)+(w *b.w);
        return retval;
    }

    public VecR4 div(double alpha){
        VecR4 retval = new VecR4();
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        retval.z = 1/alpha * z;
        retval.w = 1/alpha * w;
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