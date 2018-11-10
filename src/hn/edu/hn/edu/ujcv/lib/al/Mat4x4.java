package hn.edu.hn.edu.ujcv.lib.al;

public class Mat4x4 {
    private VecR4 colX;
    private VecR4 colY;
    private VecR4 colZ;
    private VecR4 colW;

    public Mat4x4(){
        colX = new VecR4(1,0,0,0);
        colY = new VecR4(0,1,0,0);
        colZ = new VecR4(0,0,1,0);
        colW = new VecR4(0,0,0,1);
    }

    public Mat4x4(VecR4 col1, VecR4 col2, VecR4 col3, VecR4 col4){
        this.colX = new VecR4(col1);
        this.colY = new VecR4(col2);
        this.colZ = new VecR4(col3);
        this.colW = new VecR4(col4);
    }

    public Mat4x4(Mat4x4 b){
        this.colX = new VecR4(b.colX);
        this.colY = new VecR4(b.colY);
        this.colZ = new VecR4(b.colZ);
        this.colW = new VecR4(b.colW);
    }
    public Mat4x4 suma (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();
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
        retval.setColW(this.colW.add(b.colW));
        return retval;
    }

    // resta
    public Mat4x4 resta (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();
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
        retval.setColW(this.colW.sub(b.colW));
        return retval;
    }

    // multiplicacion escalar
    public  Mat4x4 mulEscalar(double alpha){
        Mat4x4 retval = new Mat4x4();

        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setY(this.colX.getY() * alpha);
        retval.colX.setZ(this.colX.getZ() * alpha);
        retval.colX.setW(this.colX.getW() * alpha);

        retval.colY.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setZ(this.colY.getZ() * alpha);
        retval.colY.setW(this.colY.getW() * alpha);

        retval.colZ.setX(this.colZ.getX() * alpha);
        retval.colZ.setY(this.colZ.getY() * alpha);
        retval.colZ.setZ(this.colZ.getZ() * alpha);
        retval.colZ.setW(this.colZ.getW() * alpha);

        retval.colW.setX(this.colW.getX() * alpha);
        retval.colW.setY(this.colW.getY() * alpha);
        retval.colW.setZ(this.colW.getZ() * alpha);
        retval.colW.setW(this.colW.getW() * alpha);

        return  retval;
    }
    // multiplicacion vector columna
    public VecR4 mulVector(VecR4 v){
        VecR4 retval = new VecR4();
        retval.setX(v.dotProduct(this.getFilaX()));
        retval.setY(v.dotProduct(this.getFilaY()));
        retval.setZ(v.dotProduct(this.getFilaZ()));
        retval.setW(v.dotProduct(this.getFilaW()));
        return retval;
    }
    // multiplicacion por matriz
    public Mat4x4 mul (Mat4x4 b){
        Mat4x4 retval =  new Mat4x4();
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
        //   x es   getX , setX
        //   y es   getY , setY
        retval.setColX(new VecR4(this.colX.dotProduct(b.getFilaX()),this.colX.dotProduct(b.getFilaY()),this.colX.dotProduct(b.getFilaZ()),this.colX.dotProduct(b.getFilaW())));
        retval.setColY(new VecR4(this.colY.dotProduct(b.getFilaX()),this.colY.dotProduct(b.getFilaY()),this.colY.dotProduct(b.getFilaZ()),this.colY.dotProduct(b.getFilaW())));
        retval.setColZ(new VecR4(this.colZ.dotProduct(b.getFilaX()),this.colZ.dotProduct(b.getFilaY()),this.colZ.dotProduct(b.getFilaZ()),this.colZ.dotProduct(b.getFilaW())));
        retval.setColW(new VecR4(this.colW.dotProduct(b.getFilaX()),this.colW.dotProduct(b.getFilaY()),this.colW.dotProduct(b.getFilaZ()),this.colW.dotProduct(b.getFilaW())));
        return retval;
    }

    public VecR4 getFilaX(){
        VecR4 retval = new VecR4(colX.getX(),colY.getX(), colZ.getX(), colW.getX());
        return retval;
    }

    public void  setFilaX(VecR4 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
        this.colW.setX(filaX.getW());
    }

    public VecR4 getFilaY(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getY(),colW.getY());
        return retval;
    }

    public void  setFilaY(VecR4 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
        this.colW.setY(filaY.getW());
    }

    public VecR4 getFilaZ(){
        VecR4 retval = new VecR4(colX.getZ(),colY.getZ(),colZ.getZ(),colW.getZ());
        return retval;
    }

    public void  setFilaZ(VecR4 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
        this.colW.setZ(filaZ.getZ());
    }

    public VecR4 getFilaW(){
        VecR4 retval = new VecR4(colX.getW(),colY.getW(),colZ.getW(),colW.getW());
        return retval;
    }

    public void  setFilaW(VecR4 filaW){
        this.colX.setW(filaW.getX());
        this.colY.setW(filaW.getY());
        this.colZ.setW(filaW.getZ());
        this.colW.setW(filaW.getZ());
    }

    public VecR4 getColX() {
        return colX;
    }

    public void setColX(VecR4 colX) {
        this.colX = colX;
    }

    public VecR4 getColY() {
        return colY;
    }

    public void setColY(VecR4 colY) {
        this.colY = colY;
    }

    public VecR4 getColZ() {
        return colZ;
    }

    public void setColZ(VecR4 colZ) {
        this.colZ = colZ;
    }

    public VecR4 getColW() {
        return colW;
    }

    public void setColW(VecR4 colW) {
        this.colW = colW;
    }
}
