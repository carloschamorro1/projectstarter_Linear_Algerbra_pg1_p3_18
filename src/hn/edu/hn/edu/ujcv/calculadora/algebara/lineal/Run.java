package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.ujcv.util.LectorTeclado;

public class Run {

    public void run(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.presentarOpciones();
        menu.procesarOpcion(menu.leerOpciones());
    }

}
