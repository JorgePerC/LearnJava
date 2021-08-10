public class Funciones2 {
    public static void main(String[] args) {
        //Función y(x) = 3x
        //y(5)

        System.out.println( multiplicarPor3(2) );

        System.out.println( multiplicarPor3(29.5) );

        // Los métodos tienen paréntesis y parámetros
        int res = multiplicarPor3(10);

        System.out.println(res);
    }

    //Iniciamos función
    /**          | regresa | nombre    | (argumentos/parámetros)*/
    public static int multiplicarPor3 (int multiplicador){
        int resultado = 3*multiplicador;
        //El void no regresa nada
        
        // Nos indica el valor a regresar
        // Mata a mi función
        return resultado;
        //Nada se ejecuta después
        //System.out.println("Hola");
    }

    public static double multiplicarPor3 (double multiplicador){
        double resultado = 3*multiplicador;
        //El void no regresa nada
        
        // Nos indica el valor a regresar
        // Mata a mi función
        return resultado;
        //Nada se ejecuta después
        //System.out.println("Hola");
    }
}
