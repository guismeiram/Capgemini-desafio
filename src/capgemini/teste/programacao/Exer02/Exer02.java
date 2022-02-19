package capgemini.teste.programacao.Exer02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Exer02 {
	public static void main(String []args){
        
        final int MAX=6;
                     
    
        final int MIN_Uppercase=1;
        final int MIN_Lowercase=1;
        final int NUM_Digits=1;
        final int Special=1;
        int uppercaseCounter=0;
        int lowercaseCounter=0;
        int digitCounter=0;
        int specialCounter=0;
        
       
JOptionPane.showMessageDialog(null, "ENtre com a senha");       
String password = JOptionPane.showInputDialog("Insira sua senha");

       
        
        for (int i=0; i < password.length(); i++ ) {
               char c = password.charAt(i);
               if(Character.isUpperCase(c)) 
                     uppercaseCounter++;
               else if(Character.isLowerCase(c)) 
                     lowercaseCounter++;
               else if(Character.isDigit(c)) 
                     digitCounter++;     
                if(c>=33&&c<=46||c==64){
                 specialCounter++;
             }
               
        }
        
        if (password.length() >= MAX && uppercaseCounter >= MIN_Uppercase 
&& lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) { 
        	JOptionPane.showMessageDialog(null, "Senha validada!");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Sua senha não contém o seguinte:");
               if(password.length() < MAX)
            	   JOptionPane.showMessageDialog(null, "pelo menos 8 caracteres ");
               if (lowercaseCounter < MIN_Lowercase) 
            	   JOptionPane.showMessageDialog(null, "Mínimo de letras minúsculas");
               if (uppercaseCounter < MIN_Uppercase) 
            	   JOptionPane.showMessageDialog(null, "Mínimo de letras maiúsculas");
               if(digitCounter < NUM_Digits) 
            	   JOptionPane.showMessageDialog(null, "Número mínimo de dígitos numéricos");
               if(specialCounter < Special)
            	   JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos 3 caracteres especiais");
               
        }
        
   
}
}
