package exercicios0603;
import java.util.Scanner;
public class LitrosCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Variáveis 
		double consmedio,distotal,litros,custotal,combus;
		//instanciar classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe o valor do combustível");
	    combus = ler.nextDouble();
	
	    System.out.println("Informe o valor da distancia total");
        distotal = ler.nextDouble();

        System.out.println("Informe o valor do consumo médio");
        consmedio = ler.nextDouble();
        
        //Processamento 
        litros = distotal/consmedio;
        custotal = litros*combus;

        //Saída 
        System.out.println("A quantidade de litros gasto é: " + litros);
        System.out.println("O resultado do custo total é: " + custotal);
       
	
	
	
	}   

}
