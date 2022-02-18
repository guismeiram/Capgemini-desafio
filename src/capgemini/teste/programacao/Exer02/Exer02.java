package capgemini.teste.programacao.Exer02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Exer02 {
    public static boolean validaSenha(String password)
    {
    		String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";

    		Pattern p = Pattern.compile(regex);

    		if (password == null) {
    			return false;
    		}

    		Matcher m = p.matcher(password);
     
    		return m.matches();
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog("nome");
        String senha = JOptionPane.showInputDialog("senha");
        int i = 0;

        JOptionPane.showMessageDialog(null, validaSenha(senha));
    }
}
