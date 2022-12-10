package application;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial (y/n)? ");
		char response = sc.next().charAt(0);
		System.out.println(response);
		if (response == 'y') {
			System.out.print("Digite o valor de deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite um valor de deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Digite um valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		sc.close();
	}
}