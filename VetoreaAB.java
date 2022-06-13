package jojopose;
import java.util.Scanner;

public class VetoreaAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in); // Nosso Scanner que fara a leitura do codigo
		int a[]= {4,6,7,1,0}; // Essa e a declaracao do vetor A
		int b[]= {7,1,3,1,2}; // Essa e a declaracao do vetor B
	
		int x; // Nossa variavel
		int c=0; // Nossa variavel

		for ( x=0 ;x<5; x++){ // Nosso sistema de repeticao
		if(a[x]>4) // Estrutura de decisao para separar numeros maiores que 4 no vetor A
		System.out.printf("Os numeros do vetor a maiores que 4 sao: %d\n", a[x]);} // Interface que aparecera para o usuario 
		for ( x=0 ;x<5; x++) { // Nosso sistema de repeticao
		if ( b[x]>4) // Estrutura de decisao que ira separar os numeros maiores que 4 no vetor B
		System.out.printf("Os numeros do vetor b maiores que 4 sao: %d\n\n", b[x]);} // Interface que aparecera para o usuario 
		for (x=0;x<5;x++) { // Nossa estrutura de repeticao
		if (a[x]<=5) // Nossa estrura de decisao
		System.out.printf("Os numeros do vetor a menores ou iguais a 5 sao: %d\n", a[x]); // Interface que ira aparecer para o usuario 
		if (b[x]<=5)// Estrura de decisao
		System.out.printf("Os numeros do vetor b menores ou iguais a 5 sao: %d\n", b[x]); // Interface que ira aparecer para o usuario 
		c=a[x]*b[x];} // Dara o valor de C, usando os vetores A e B
		System.out.printf("O valor de c e: %d", c);// Interface que ira aparecer para o usuario 
		
		
		
		
		
		
			}


	}


