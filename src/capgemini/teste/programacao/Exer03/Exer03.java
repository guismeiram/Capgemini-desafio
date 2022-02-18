package capgemini.teste.programacao.Exer03;

public class Exer03 {
	nt I,J,K=0;
    char NOME1[100],NOME2[100];
    printf("Digite a primeira palavra a ser comparada: ");
    gets(NOME1);  
    printf("Digite a segunda palavra a ser comparada: ");
    gets(NOME2);  
    for(I=0;I<strlen(NOME1);I++) /* Aqui compara as letras da primeira palara com as da segunda. */
        {  
        for(J=0;J<strlen(NOME2);J++)
            {
            if(NOME1[I]==NOME2[J])
            K++;
            }
        }
    if(K<strlen(NOME1)) /* Aqui, caso as letras da primeira palavra, sejam as mesmas da segunda, mesmo com ordem trocada, será anagrama, ou não. */
        printf("\nAs palavras %s e %s não são anagramas.",NOME1,NOME2);  
            else
                printf("\nAs palavras %s e %s são anagramas.",NOME1,NOME2); 
    getch();
}
