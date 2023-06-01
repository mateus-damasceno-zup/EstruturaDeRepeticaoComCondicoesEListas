package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero da tabuada que voce quer");
        int numero = sc.nextInt();
        int[] mult =new int[10];

//        for (int i=1;i<=10;i++){
//            mult = numero *i;
//            System.out.println(numero + " X "+ i+" = "+mult);
//        }

            int[] fatorFixo = new int[10];

            int j=0;
            for (int i = 0;i<10;i++){
                j=j+1;
                fatorFixo[i]=j;
            }
            for (int i=0;i<10;i++){
                mult[i]=fatorFixo[i]*numero;
                System.out.println(numero + " X "+ fatorFixo[i]+" = "+mult[i]);
            }

        }
}

