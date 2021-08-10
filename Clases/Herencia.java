import Subsistemas.*;

public class Herencia {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //Quién hereda de quién?
        //Padre, hijo 

        //Objeto padre:
        Contenedor cont = new Contenedor(300, "ml");

        System.out.println("Capacidad: " + cont.capacidad);
        // System.out.println("Capacidad: " + cont.unidades);

        Botella bote = new Botella (450, "L", "verde", false, "Bonafont" ); //

        System.out.println("Capacidad: " + bote.capacidad);
        // System.out.println("Capacidad: " + cont.unidades);

        cont.isFill();

        bote.isFill();
        bote.tomar();

    }
}
