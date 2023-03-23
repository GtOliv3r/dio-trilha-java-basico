import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o numero da conta (4 digitos) ");
		System.out.println();
		int numeroConta = scanner.nextInt();
		
		System.out.println("Insira o numero da agencia ");
		System.out.println();
		String agencia = scanner.next();
		
		System.out.println("Digite seu nome completo ");
		System.out.println();
		String nome = scanner.next();
		
		System.out.println("Digite o valor em R$ (reais) que gostaria de sacar");
		System.out.println();
		double saldo = scanner.nextDouble();
		
		
		System.out.printf("Olá " + nome + "! Obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta +  " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
