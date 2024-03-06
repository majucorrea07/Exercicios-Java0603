package exercicios0603;
import java.util.Scanner;
public class ConverterReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis 
		double real,libra,conv;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		 System.out.println("Informe o valor do real: ");
		 real = ler.nextDouble();
		 
		 //Processamento
		 conv = real*6.28;
				 
		 //Saída
		 System.out.println("O valor da libra é: " + conv);
				 
	}

}
