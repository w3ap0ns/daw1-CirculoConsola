import java.util.Scanner;

public class app {

    public static void main(String[] arg){

        /*En el ejercicio 4 (CirculoConsola) se solicita al usuario el radio (usa
        decimales).*/

        Scanner readln = new Scanner(System.in);

        // Declaración de variables
        double radio = 0;

        // Operacion - Solicitud del valor del Radio
        System.out.printf("Introduce el valor para el radio\n");
        radio = readln.nextDouble();
        System.out.printf("Calculando...\n");

        // Formulas: https://www.youtube.com/shorts/yE9mKPjC79Q
        double circunferencia = (double) 2 * Math.PI * radio;
        double areaCirculo = Math.PI * Math.pow(radio,2);
        double volumen = (double) 4/3 * Math.PI * Math.pow(radio,3);

        // Output
        System.out.printf("La circunferencia del círculo es: %.2f \n", circunferencia);
        System.out.printf("El área del círculo es: %.2f \n", areaCirculo);
        System.out.printf("El volumen de la esfera es: %.2f \n", volumen);

    } // public static void main(String[] arg)

} // public class app
