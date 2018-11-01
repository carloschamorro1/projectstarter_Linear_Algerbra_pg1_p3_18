package hn.edu.ujcv.util;


import hn.edu.hn.edu.ujcv.lib.al.VecR2;

import java.util.Scanner;

public class LectorTeclado {
    private Scanner mSc;
    private double x;
    private double y;
    private double z;
    private double w;

    public LectorTeclado(){
        Scanner sc = new Scanner(System.in);
        init(sc);
    }


    private void init(Scanner sc){
         mSc = sc;
    }

    public int leerReal(String mensaje, String mensajeError){
        int retval = 0;
        System.out.println(mensaje);
        while(!mSc.hasNextDouble()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval = mSc.nextInt();
        return retval;
    }

    public int leerEntero(String mensaje, String mensajeError){
        int retval = 0;
        System.out.println(mensaje);
        while(!mSc.hasNextInt()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval = mSc.nextInt();
        return retval;
    }
    public VecR2 leerVecR2(double x, double y, String mensaje, String mensajeError){
        VecR2 retval = new VecR2();
        System.out.println(mensaje);
        while(!mSc.hasNextInt()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval.getX();
        while(!mSc.hasNextInt()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval.getY();
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
}
