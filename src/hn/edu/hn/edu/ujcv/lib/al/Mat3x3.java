package hn.edu.hn.edu.ujcv.lib.al;

public class Mat3x3 {
    private VecR3 colX;
    private VecR3 colY;
    private VecR3 colZ;

    public Mat3x3(){
        colX = new VecR3(1,0,0);
        colY = new VecR3(0,1,0);
        colZ = new VecR3(0,0,1);
    }

    public Mat3x3(VecR3 col1, VecR3 col2, VecR3 col3){
        this.colX = new VecR3(col1);
        this.colY = new VecR3(col2);
        this.colZ = new VecR3(col3);
    }

    public Mat3x3(Mat3x3 b){
        this.colX = new VecR3(b.colX);
        this.colY = new VecR3(b.colY);
        this.colZ = new VecR3(b.colZ);
    }
    public Mat3x3 suma (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();
        //            cx cy              cx cy
        // dado A  | 1  2 |  dado b  |  1  1 | x
        //          | 2  3 |          |  0  0 |  y
        //
        //   retval:
        //   |  a.cx.x + b.cx.x     a.cy.x +  b.cy.x |
        //   |  a.cx.y + b.cx.y     a.cy.y + b.cy.y  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX
        //   y es   getY , setY

        retval.setColX(this.colX.add(b.colX));
        retval.setColY(this.colY.add(b.colY));
        retval.setColZ(this.colZ.add(b.colZ));

        return retval;
    }

    // resta
    public Mat3x3 resta (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();
        //            cx cy              cx cy
        // dado A  | 1  2 |  dado b  |  1  1 | x
        //          | 2  3 |          |  0  0 |  y
        //
        //   retval:
        //   |  a.cx.x - b.cx.x     a.cy.x -  b.cy.x |
        //   |  a.cx.y - b.cx.y     a.cy.y - b.cy.y  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX
        //   y es   getY , setY
        retval.setColX(this.colX.sub(b.colX));
        retval.setColY(this.colY.sub(b.colY));
        retval.setColZ(this.colZ.sub(b.colZ));
        return retval;
    }
    // multiplicacion escalar
    public  Mat3x3 mulEscalar(double alpha){
        Mat3x3 retval = new Mat3x3();

        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setY(this.colX.getY() * alpha);
        retval.colX.setZ(this.colX.getZ() * alpha);

        retval.colY.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setZ(this.colY.getZ() * alpha);

        retval.colZ.setX(this.colZ.getX() * alpha);
        retval.colZ.setY(this.colZ.getY() * alpha);
        retval.colZ.setZ(this.colZ.getZ() * alpha);
        return  retval;
    }
    // multiplicacion vector columna
    public VecR3 mulVector(VecR3 v){
        VecR3 retval = new VecR3();
            retval.setX(v.dotProduct(this.getFilaX()));
            retval.setY(v.dotProduct(this.getFilaY()));
            retval.setZ(v.dotProduct(this.getFilaZ()));
        return retval;
    }
    // multiplicacion por matriz
    public Mat3x3 mul (Mat3x3 b){
        Mat3x3 retval =  new Mat3x3();
        //            cx cy              cx cy
        // dado A  x| 1  2 |  dado b  |  1  1 | fx
        //          y| 2  3 |          |  0  0 | fy
        //             x  y
        //   retval:
        //   |   a.fx.dot(b.cx)   a.fx.dot(b.cy) |
        //   |   a.fy.dot(b.cx)   a.fy.dot(b.cy) |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX1
        //   y es   getY , setY
        retval.setColX(new VecR3(this.getFilaX().dotProduct(b.colX),this.getFilaY().dotProduct(b.colX), this.getFilaZ().dotProduct(b.colX)));
        retval.setColY(new VecR3(this.getFilaX().dotProduct(b.colY),this.getFilaY().dotProduct(b.colY), this.getFilaZ().dotProduct(b.colY)));
        retval.setColZ(new VecR3(this.getFilaX().dotProduct(b.colZ),this.getFilaY().dotProduct(b.colZ), this.getFilaZ().dotProduct(b.colZ)));
        return retval;
    }

    public VecR3 getFilaX(){
        VecR3 retval = new VecR3(colX.getX(),colY.getX(), colZ.getX());
        return retval;
    }

    public void  setFilaX(VecR3 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
    }

    public VecR3 getFilaY(){
        VecR3 retval = new VecR3(colX.getY(),colY.getY(),colZ.getY());
        return retval;
    }

    public void  setFilaY(VecR3 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
    }

    public VecR3 getFilaZ(){
        VecR3 retval = new VecR3(colX.getZ(),colY.getZ(),colZ.getZ());
        return retval;
    }

    public void  setFilaZ(VecR3 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
    }

    public VecR3 getColX() {
        return colX;
    }

    public void setColX(VecR3 colX) {
        this.colX = colX;
    }

    public VecR3 getColY() {
        return colY;
    }

    public void setColY(VecR3 colY) {
        this.colY = colY;
    }

    public VecR3 getColZ() {
        return colZ;
    }

    public void setColZ(VecR3 colZ) {
        this.colZ = colZ;
    }
}
