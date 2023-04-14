package controller;
import model.Pilha;

public class FatController {
	
	public void fat(int valor) {
		
		Pilha a = new Pilha();
		int fat = 1;
		
		while(valor>0) {
			a.push(valor);
			valor-=1;
		}
		
		while(!a.isEmpty()) {
			try {
				fat *= a.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(fat);
	}
}
