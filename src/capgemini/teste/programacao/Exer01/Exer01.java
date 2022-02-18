package capgemini.teste.programacao.Exer01;


public class Exer01 {

	public static void main(String[] args) {
		
	    int i, j, n = 6;

		 for(i = 1; i <= n; i++){
		        for(j = n - i; j >= 1; j--) // imprime os espaços
		        		System.out.print(" ");
		        for(j = 1; j <= i; j++) // imprime os *
		        	System.out.print("*");
		        System.out.println("\n");
		    }
			//System.out.print("||");

		
		
	}

}
