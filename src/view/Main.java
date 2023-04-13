package view;
import java.util.Scanner;
import controller.FatController;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FatController f = new FatController();
		int valor = 0;
		System.out.println("Escolha um valor entre 0 a 10");
		do {
			valor = input.nextInt();
			if(!(valor>=0 && valor<=10)) {
				System.out.println("Insira um valor dentro do intervalo!");
			}
		}while(!(valor>=0 && valor<=10));
		f.fat(valor);
		input.close();
	}
}
