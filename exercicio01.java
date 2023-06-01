package EstruturaDeRepetiçãoComCondiçõesEListas;

//1 - Faça um programa que pergunte o preço de três produtos e informe qual
//produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[3];

        for (int i=0;i<=array.length-1;i++){
            System.out.println("digite o " + (i+1)+" preço");
            array[i]=sc.nextDouble();
        }

        if(array[0]<array[1]){
            if(array[0]<array[2]){
                System.out.println("o preço mais barato é "+ array[0]);
            }else{
                System.out.println("o preço mais barato é "+ array[2]);
            }
        }else{
            if (array[1]<array[2]){
                System.out.println("o preço mais barato é "+ array[1]);
            }else{
                System.out.println("o preço mais barato é "+ array[2]);
            }
        }

    }
}
