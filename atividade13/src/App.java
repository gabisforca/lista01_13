 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Passo1:Mostrar variavel
    double altura;
    double pesoidealhomem;
    double pesoidealmulher;
    
    // Passo2:Entrada de dados
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua altura :");
    altura = teclado.nextDouble();

    pesoidealhomem = (72.7 * altura) - 58;
    System.out.println("Seu peso ideal para homem é :" + pesoidealhomem);
    pesoidealmulher = (62.1 * altura) - 44.7;
    System.out.println("Seu peso ideal para mulher é :" + pesoidealmulher);
      
    }
  
}