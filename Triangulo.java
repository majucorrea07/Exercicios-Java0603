package exercicios0603;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis
		double base,altura,área;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
						
	    //Entrada de dados
		System.out.println("Informe o valor  da base: ");
		 base = ler.nextDouble();
				
		 System.out.println("Informe o valor da altura: ");
		 altura = ler.nextDouble();
		 
		 //Processamento
		 área = (base* altura)/ 2;
		 
		 //Saída
		 System.out.println("O resultado da área é: " + área);
	}

}
