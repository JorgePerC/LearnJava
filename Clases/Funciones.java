/**
 * ClaseFunc
 */
import java.util.Scanner;

public class Funciones {
    //Variable global
    //Intenten no ocuparlas

    static int radio;
    public static void main(String[] args) {
        boolean b = true;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame el valor del radio: ");
        radio = teclado.nextInt();

        double res = calcularAreaCirculo(radio, 3.14);
        System.out.println(res + 10 *20);
        System.out.println(calcularAreaCirculo(radio));
        //Da error!
        //double res2 = calcularAreaCirculo();
        
        saludar("Sofi");
        saludar("Mau");
        teclado.close();
    }
    
    //Calcular el área de un círculo 
    /**siempre va | regresa| nombre |        argumentos */
    public static double calcularAreaCirculo (double radio, double pi){
        double area = Math.pow(radio, 2)*pi;
        //Regresa el valor calculado
        //Mata a la función
        return area;
    }
    //Requisito para la sobrecarga, es que los parámetros/argumentos
    public static double calcularAreaCirculo (double radio){
        //Valor de pi
        return Math.PI*Math.pow(radio, 2);
    }
  
    public static void calcularAreaCirculo (){
        //Valor de pi
        System.out.println(Math.PI*Math.pow(radio, 2));
    }
    //Calcular el área de un cuadrilátero 

    //Scope
    public static void saludar(String persona){
        System.out.println("Hola " + persona);
        //No lleva return 
    }
}