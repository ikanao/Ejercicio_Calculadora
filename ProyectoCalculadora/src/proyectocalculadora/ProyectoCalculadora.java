
package proyectocalculadora;

import java.util.Scanner;

/**
 *
 * @author ikanao
 */
public class ProyectoCalculadora {

    
    public static void main(String[] args) {
        
        // Creando el objeto scanner
        Scanner scanner = new Scanner(System.in);
        
        //Saludo
        System.out.println("--------------------");
        System.out.println("PROYECTO CALCULADORA");
        System.out.println("--------------------");
       
        // Definiendo variables
        Double numero1, numero2;
        char caracter;
        
        // Solicitando al usuario ingresar un valor
        System.out.print("Ingrese el #1: ");
        numero1 = scanner.nextDouble();
        System.out.print("Ingrese el #2: ");
        numero2 = scanner.nextDouble();
        System.out.println("¿Desea calcular la división inversa?(s -> Si)");
        caracter = scanner.next().charAt(0);
        
        // Creando el objeto calculador
        CalculadoraBase calculadoraBase = new CalculadoraBase(numero1, numero2);
        
        calculadoraBase.Sumar();
        calculadoraBase.Restar();
        calculadoraBase.Multiplicar();
        calculadoraBase.Dividir();
        calculadoraBase.Dividir(caracter);
       
    }
    
}
