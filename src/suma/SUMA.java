
package suma;
import java.util.Scanner;
public class SUMA {

    
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese el primer numero :");
            int num1 = scanner.nextInt();
            
            // Verificar si num1 es positivo
            while (num1 <= 0) {
                System.out.println("El numero ingresado no es positivo. Ingrese nuevamente:");
                num1 = scanner.nextInt();
            }
            
            System.out.println("Ingrese el segundo numero positivo:");
            int num2 = scanner.nextInt();
            
            // Verificar si num2 es positivo
            while (num2 <= 0) {
                System.out.println("El numero ingresado no es positivo. Ingrese nuevamente:");
                num2 = scanner.nextInt();
            }
            
            int suma = num1 + num2;
            System.out.println("La suma de los dos numeros es: "
                    + suma);
            
            System.out.println("Desea realizar otra operacion (Ingrese 2 para si, otro numero para salir)");
            opcion = scanner.nextInt();
        } while (opcion == 2);
        
        System.out.println("Gracias por usar el programa. Hasta luego");
        scanner.close();
    }
}