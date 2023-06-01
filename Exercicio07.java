package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//7 - Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
public class Exercicio07 {
    public static void main(String[] args) {
        Random gerador = new Random();
        List<Integer> numeros = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            numeros.add(gerador.nextInt());
        }
        System.out.println(numeros);
    }

}
