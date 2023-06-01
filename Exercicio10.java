package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//10 - Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma,
//a multiplicação e os números.
public class Exercicio10 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int soma=0;
        int multiplicacao=1;
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numeros.add(gerador.nextInt(10));
        }
        System.out.println(numeros);

        for(int i=0;i<numeros.size();i++){
            soma = soma + numeros.get(i);
            multiplicacao=multiplicacao*numeros.get(i);
        }
        System.out.println("multiplicacao: " + multiplicacao +
                "\n soma "+ soma +
                "\nnumeros" + numeros);

    }
}
