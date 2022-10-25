package Operadores;

public class Concatenacao {
    public static void main(String[] args) {
        //Concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao=1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao=1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao =1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao="1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao="1"+(1+1+1);
        System.out.println(concatenacao);
    }  
}
