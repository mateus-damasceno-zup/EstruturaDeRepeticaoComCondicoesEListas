package EstruturaDeRepetiçãoComCondiçõesEListas;
//8 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem
//inversa.

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio08 {

        public static void main(String[] args) {
            Random gerador = new Random();
            List<Integer> numeros = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                numeros.add(gerador.nextInt());
            }
            System.out.println(numeros);

            List<Integer> numerosInvertidos = new ArrayList<Integer>();
            for (int i = numeros.size()-1; i>=0; i--) {
                numerosInvertidos.add(numeros.get(i));
            }
            System.out.println(numerosInvertidos);
        }

}

