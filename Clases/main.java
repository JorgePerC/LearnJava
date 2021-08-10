import Subsistemas.Botella;

public class main {
    public static void main(String[] args) {
        System.out.println("Hola");

        //Para crear un objeto, hay que construirlo
        Botella bote = new Botella();

        Botella botellita = new Botella();
        //Llamamos al método de la botella
        bote.tomar();

        bote.color = "azul";
        bote.capacidad = 503;
        bote.isClosed = true;

        botellita.color = "rojo";
        botellita.capacidad = 200;

        System.out.println(bote.color);
        System.out.println(botellita.color);

        //bote.cerrar();
    } 
}
