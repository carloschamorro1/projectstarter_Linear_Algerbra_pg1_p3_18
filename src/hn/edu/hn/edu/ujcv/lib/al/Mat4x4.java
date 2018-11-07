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

        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());
        retval.colZ.setZ(this.colZ.getX()+ b.colZ.getX());
        retval.colZ.setZ(this.colZ.getY()+ b.colZ.getY());
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
        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        retval.colZ.setZ(this.colY.getX()- b.colY.getX());
        retval.colZ.setZ(this.colY.getY()- b.colY.getY());
        return retval;
    }

    public VecR4 getFilaX(){
        VecR4 retval = new VecR4(colX.getX(),colY.getX(), colZ.getZ(), colW.getW());
        return retval;
    }

    public void  setFilaX(VecR4 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
        this.colW.setX(filaX.getW());
    }

    public VecR4 getFilaY(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getZ(),colW.getW());
        return retval;
    }

    public void  setFilaY(VecR4 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
        this.colW.setY(filaY.getW());
    }

    public VecR4 getFilaZ(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getZ(),colW.getW());
        return retval;
    }

    public void  setFilaZ(VecR4 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
        this.colW.setZ(filaZ.getZ());
    }

    public VecR4 getFilaW(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getZ(),colW.getW());
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
