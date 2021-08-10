//Nos indica la carpeta
package Subsistemas;
// import Contenedor;

// La clase Botella hereda del padre contenedor
public class Botella extends Contenedor {
    //Atributos:
    public String color;
    public boolean isClosed;
    public String marca;

    public Botella (int capacidad, String unidades, String color,
                    boolean isClosed, String marca) {
        super();
        this.color = color;
        this.isClosed = isClosed;
        this.marca = marca;
        this.capacidad = capacidad;
        this.unidades = unidades;
        
    }
    public Botella(){

    }

    //Métodos:
    public void tomar(){
        System.out.println("Trunk trunk");
    }

    private void cerrar(){
        System.out.println("Está cerrado!");
    }

    @Override
    public void isFill (){
        System.out.println("La botella está llena");
    }

}
