package hn.edu.hn.edu.ujcv.lib.al;
public class VecR2 {
    private double x;
    private double y;

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

    public VecR2(VecR2 b) {
        this.x = b.x;
        this.y = b.y;
    }

    public VecR2 add(VecR2 b){
        VecR2 retval = new VecR2();
        retval.x = (x+b.x);
        retval.y = (y+b.y);
        return retval;
    }

    public VecR2 sub(VecR2 b){
        VecR2 retval = new VecR2();
        retval.x = (x-b.x);
        retval.y = (y-b.y);
        return retval;
    }

    public VecR2 mul(double alpha){
        VecR2 retval = new VecR2();
        retval.x = alpha * x;
        retval.y = alpha * y;
        return retval;
    }

    public double dotProduct(VecR2 b){
        double retval;
        retval = (x * b.x) + (y * b.y);
        return retval;
    }

    public VecR2 div(double alpha){
        VecR2 retval = new VecR2();
        retval.x = 1/alpha * x;
        retval.y = 1/alpha * y;
        return retval;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() { return y;
    }

    public void setY(double y) { this.y = y;
    }

}