package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//9 - Faça um Programa que leia 20 números e armazene-os numa lista. Armazene
//os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as
//três listas.
public class Exercicio09 {
    public static void main(String[] args) {
        Random gerador = new Random();
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            numeros.add(gerador.nextInt());
        }
        System.out.println(numeros);
        List<Integer> par = new ArrayList<Integer>();
        List<Integer> impar = new ArrayList<Integer>();

        for (int i=0;i<numeros.size()-1;i++) {
            if ((numeros.get(i) % 2) == 0) {
                par.add(numeros.get(i));
            } else {
                impar.add(numeros.get(i));
            }
        }
        System.out.println("par " + par);
        System.out.println("impar "+ impar);
    }
}
