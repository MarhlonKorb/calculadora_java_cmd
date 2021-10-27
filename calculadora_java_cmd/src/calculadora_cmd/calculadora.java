package calculadora_cmd;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		b = scan.nextInt();
		
		int soma = soma (a , b);
		int subtracao = subtracao( a , b);
		int multiplicacao = multiplicacao (a , b);
		int divisao = divisao( a , b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		}	

		public static int soma (int a, int b) {
			return a + b;
		}
		
		public static int subtracao (int a, int b) {
			return a - b;
		}
		
		public static int multiplicacao (int a, int b) {
			return a * b;
		}
		
		public static int divisao (int a, int b) {
			return a / b;
		}
}
