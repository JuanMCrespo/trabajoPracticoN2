package prueba ;
 
import java.util.Scanner;
 
public class Prueba2 {
 
    public static void main(String[] args) {
 
        byte opcion = 0;
          
        // Declaramos el objeto Scanner
        Scanner lectura= new Scanner (System.in);
          
        do { // Hacer como mínimo una vez.
          
            System.out.println("1. Mostrar 100 números con un bucle for");
            System.out.println("2. Mostrar 100 números con un bucle while");
            System.out.println("3. ¿Cuál es el número?");
            System.out.println("4. Introduce un número. ¿Es mayor que cero?");
            System.out.println("5. Salir"); 
              
            // Mostramos un mensaje por pantalla
            System.out.println("Introduce un número: "); 
              
            // Lo leemos y lo guardamos en la variable.
            opcion = lectura.nextByte(); 
              
            // y mientras el número sea menor que 1 o mayor que 5
              
        } while (opcion<1 || opcion> 5);
          
        // Dependiendo de lo que el usuario introduzca
        //ejecutamos una opcion u otra
          
        switch(opcion) {
        case 1:
        	for (int i = 0;
        		i <= 100;
        		i++)
 			System.out.println(" El número es el " + i);	
            System.out.println("Opcion 1 ejecutada");
            break;
              
        case 2:
        	int num = 0;
            while (num <= 100) {
                
                System.out.println(" El número es el " + num);
                num++;
            }
            System.out.println("Opcion 2 ejecutada");
            break;
          
        case 3:
            System.out.println("Opcion 3 ejecutada");
            break;
          
        case 4:
            System.out.println("Opcion 4 ejecutada");
            break;
          
        case 5:
            System.out.println("Opcion 5 ejecutada");
            break;
          
        }
         
    }
}