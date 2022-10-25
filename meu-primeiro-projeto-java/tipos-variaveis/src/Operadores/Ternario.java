package Operadores;

public class Ternario {
    public static void main(String[] args) {
        //Operador ternário
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado2);
    }
}
