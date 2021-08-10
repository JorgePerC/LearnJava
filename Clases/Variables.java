public class Variables {
    public static void main(String[] args) {
        int entero = 10;
        float numeroDecimal = 10.5f;
        double numeroDecimalPreciso = 10.02222;

        System.out.println("El nombre de tu variable es: " + entero);

        boolean variableBoleana = false; /* true*/
        
        if (numeroDecimal > 10){
            //código bonito
            System.out.println("Hola");
        }else if ((variableBoleana == false) 
        && !(entero < 10) /**Condición  */){
            System.out.println("Gutten Tag");
        }else{
            System.out.println("Adiós");
        }
        while(true){
            System.out.println("INFINITO");
        }
    }
}
