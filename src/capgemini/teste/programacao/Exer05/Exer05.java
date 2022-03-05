package capgemini.teste.programacao.Exer05;

public class Exer05 {
	public static void main(String args[]) {
		double arr [] = new double []{1, 5, 3, 4, 2};
		double soma = 0, media = 0;
		int cont = 0;
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]%2 == 0) {
				cont++;
				soma = soma +  arr[i]; 
				media = soma / i;
			}
			
		}
		
		System.out.println("media" + " = " + media);
		System.out.print("numeros pares" + " = " + cont);
	}
}
