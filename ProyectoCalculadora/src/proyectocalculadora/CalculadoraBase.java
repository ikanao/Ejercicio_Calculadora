package proyectocalculadora;

/**
 *
 * @author alanayca
 */
public class CalculadoraBase {
    
    // Definiendo Atributos
    private Double numero1;
    private Double numero2;
    
    // Constructor vacío
    public CalculadoraBase(){}
    
    // Constructor con argumentos
    public CalculadoraBase(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Getters y Setters
    public Double getNumero1 (){
        return numero1;
    }
    
    public void setNumero1 (Double numero1){
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
    
    // Métodos calculadora
    public void Sumar(){
        Double resultado = this.getNumero1() + this.getNumero2();
        System.out.println("La suma es: " + resultado);
    }
    
    public void Restar(){
        Double resultado = this.getNumero1() - this.getNumero2();
        System.out.println("La resta es: " + resultado);
    }
    
    public void Multiplicar(){
        Double resultado = this.getNumero1() * this.getNumero2();
        System.out.println("La multiplicación es: " + resultado);
    }
    
    public void Dividir(){
        if(this.getNumero2() == 0){
            System.out.println("Error: El numerador no puede ser 0");
        }else{
            Double resultado = this.getNumero1() / this.getNumero2();
            System.out.println("La resta es: " + resultado);
        }
    }
    
    // División inversa -> Polimorfismo
    public void Dividir(char caracter){
        if (caracter == 's') {
            Double resultado = this.getNumero2() / this.getNumero1();
            System.out.println("La división inversa es: " + resultado);
        }else{
            System.out.println("No se ha ejecutado la división inversa.");
        }
    }
    
    
}
