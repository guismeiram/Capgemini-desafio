package capgemini.teste.programacao.Exer02;

public class Exer02 {
	int algarismos = 0;
	String senha[] = new  STring [algarismos];
	
	public boolean validQuantNumAlgarismos() {
		while(true) {
		  for(int i =0; i < senha.length; i++) {
			if(senha[algarismos] <= 6) {
				return true;
			}else {
				return false;
			}
		  }
		}
	}
	
	
	public boolean validCadAlgarismoNumero() {
		while(true) {
			for(int i =0; i < senha.length; i++) {
				if(senha[i] <= 0 && senha[i] >= 9) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}
	
	public boolean validCadAlgarismoStrings() {
		while(true) {
			for(int i =0; i < senha.length; i++) {
				if(senha[i].equals("a") && senha[i].equals("b")) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}
}
