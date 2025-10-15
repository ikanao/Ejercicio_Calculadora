
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
        
        // Definiendo variables
        Double numero1, numero2;
        
        // Solicitando al usuario ingresar un valor
        numero1 = scanner.nextDouble();
        numero2 = scanner.nextDouble();
        
        // Creando el objeto calculador
        CalculadoraBase calculadoraBase = new CalculadoraBase(numero1, numero2);
        
        calculadoraBase.Sumar();
        calculadoraBase.Restar();
        calculadoraBase.Multiplicar();
        calculadoraBase.Dividir();
       
    }
    
}
