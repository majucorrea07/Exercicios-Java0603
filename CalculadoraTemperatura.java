package exercicios0603;
import java.util.Scanner;
public class CalculadoraTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis
		double celsius,fahrenheit;
		//instanciar classe scanner 
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe a temperatura em fahrenheit");
		fahrenheit = ler.nextDouble();
		
		//Processamento
		celsius = ((fahrenheit - 32)* 5) / 9;
		
		//Saída
		System.out.println("O resultado em graus celsius é: " + ((fahrenheit - 32)* 5) / 9 );
		
		
		
		
		
	}

}
