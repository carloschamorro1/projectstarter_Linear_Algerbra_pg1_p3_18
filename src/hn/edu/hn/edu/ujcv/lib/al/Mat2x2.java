package hn.edu.hn.edu.ujcv.lib.al;

public class Mat2x2 {

    //double[][] arr;

    //double m11;  double m12;
    //double m21;  double m22;


    // principios de la contencion
    // 1. miembros de la clase privados
    // 2. constructor.
    // 3. accesores y mutadores (a.k.a. geters y seters)
    private VecR2 colX;
    private VecR2 colY;

    public Mat2x2(){
        colX = new VecR2(1,0);
        colY = new VecR2(0,1);
    }

    public Mat2x2(VecR2 col1, VecR2 col2){
        this.colX = new VecR2(col1);
        this.colY = new VecR2(col2);
    }

    public Mat2x2(Mat2x2 b){
        this.colX = new VecR2(b.colX);
        this.colY = new VecR2(b.colY);
    }
    // este contrato debe estar en las demas matrices
    // y no debe variar mas que en la dimencion de los objetos
    // retornados y recibidos.
    // suma
    public Mat2x2 suma (Mat2x2 b){
         Mat2x2 retval = new Mat2x2();
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
         return retval;
    }
    // resta
    public Mat2x2 resta (Mat2x2 b){
        Mat2x2 retval = new Mat2x2();
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
        return retval;
    }
    // multiplicacion escalar
    public  Mat2x2 mulEscalar(double alpha){
        Mat2x2 retval = new Mat2x2();
        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setY(this.colX.getY() * alpha);
        retval.colY.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        return  retval;
    }
    // multiplicacion vector columna
    public VecR2 mulVector(VecR2 v){
        VecR2 retval = new VecR2();
        retval.setX(v.dotProduct(this.getFilaX()));
        retval.setY(v.dotProduct(this.getFilaY()));
        return retval;
    }
    // multiplicacion por matriz
    public Mat2x2 mul (Mat2x2 b){
        Mat2x2 retval =  new Mat2x2();
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
        retval.setColX(new VecR2(this.getFilaX().dotProduct(b.colX),this.getFilaY().dotProduct(b.colX)));
        //this.getFilaX().dotProduct(b.colY))
        retval.setColY(new VecR2(this.getFilaX().dotProduct(b.colY),this.getFilaY().dotProduct(b.colY)));
        return retval;
    }


    public VecR2 getFilaX(){
        VecR2 retval = new VecR2(colX.getX(),colY.getX());
        return retval;
    }

    public void  setFilaX(VecR2 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
    }

    public VecR2 getFilaY(){
        VecR2 retval = new VecR2(colX.getY(),colY.getY());
        return retval;
    }

    public void  setFilaY(VecR2 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
    }
    public VecR2 getColX() {
        return colX;
    }

    public void setColX(VecR2 colX) {
        this.colX = colX;
    }

    public VecR2 getColY() {
        return colY;
    }

    public void setColY(VecR2 colY) {
        this.colY = colY;
    }
}
