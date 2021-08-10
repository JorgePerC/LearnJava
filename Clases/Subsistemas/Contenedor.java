package Subsistemas;

//La clase padre es Contenedor
public class Contenedor {
    
    public int capacidad;
    protected String unidades;

    public Contenedor (int capacidad, String unidades){
        this.capacidad = capacidad;
        this.unidades = unidades;
    }

    public Contenedor (){
        this.capacidad = 0;
        this.unidades = "u";
    }

    public void isFill(){
        System.out.println("Está lleno");
    }
}
