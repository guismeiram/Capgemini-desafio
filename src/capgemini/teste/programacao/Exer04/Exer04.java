package capgemini.teste.programacao.Exer04;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr [] = new double []{9, 2, 1, 4, 6};
		double soma = 0, media = 0;
		
		for(int i = 0; i <arr.length; i++) {
			soma = soma +  arr[i]; 
			media = soma / i;
		}
		
		System.out.println("media" + " = " + media);
	}

}
