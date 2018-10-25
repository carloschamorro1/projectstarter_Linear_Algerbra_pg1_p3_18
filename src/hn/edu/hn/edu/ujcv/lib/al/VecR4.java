package hn.edu.hn.edu.ujcv.lib.al;

public class VecR4 {
    private double x;
    private double y;
    private double z;
    private double w;

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

    public VecR4 add( VecR4 b){
        return new VecR4(x+b.x,y+b.y,z+b.z,w+b.w);
    }

    public VecR4 sub(VecR4 b){
        return new VecR4(x-b.x,y-b.y,z-b.z,w-b.w);
    }

    public VecR4 mul(double alpha){
        return new VecR4(x*alpha, y*alpha,z*alpha,w*alpha);
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
        retval = (this.x * b.x)+ (this.y * b.y) + (this.z * b.z) +(this.w * b.w);
        return retval;
    }

}
