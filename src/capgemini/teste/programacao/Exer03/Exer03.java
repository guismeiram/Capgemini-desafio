package capgemini.teste.programacao.Exer03;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer03 {
	public static void main(String args[]) {
		Scanner ent = new Scanner(System.in);
        String s, r;
        int i, j;
        System.out.println("Digite a palavra/frase:");
		 s = ent.nextLine();
		    r = ent.nextLine();
		    char[] a = s.toCharArray();
		    char[] b = r.toCharArray();
		    Arrays.sort(a);
		    Arrays.sort(b);
		    if (Arrays.equals(a, b)) {
		        System.out.println("Anagrama");
		    } else {
		        System.out.println("Não é anagrama");
		    }
	    
	    
	}
}
