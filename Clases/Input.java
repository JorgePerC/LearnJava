import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Crear un teclado
        
        int a = pedirInt("Dame un numero");
        int b = pedirInt("Dame otro numero");
        System.out.println(a+b);

    }

    //Creamos una función
    public static int pedirInt(String mensaje){
        Scanner teclado = new Scanner (System.in);
        System.out.println(mensaje);
        int a = teclado.nextInt();
        return a;
    }
}
