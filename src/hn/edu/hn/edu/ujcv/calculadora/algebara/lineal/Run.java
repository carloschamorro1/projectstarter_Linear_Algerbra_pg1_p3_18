package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

public class  Run {
    public void run() {
        MenuPrincipal menu = new MenuPrincipal();
        do {
            menu.presentarOpciones();
            menu.procesarOpcion(menu.leerOpciones());
        }while (menu.opcion != 3);
    }
}
