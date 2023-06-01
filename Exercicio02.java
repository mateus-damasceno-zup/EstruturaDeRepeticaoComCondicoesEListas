package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.Scanner;

//2 - Faça um Programa que leia um número e exiba o dia correspondente da
//semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
//inválido.
public class Exercicio02 {
    public static void main(String[] args) {
        String[] semana = new String[7];

        semana[0]="Domingo";
        semana[1]="Segunda";
        semana[2]="Terça";
        semana[3]="Quarta";
        semana[4]="Quinta";
        semana[5]="Sexta";
        semana[6]="Sabado";

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        int diaSemana = sc.nextByte();

        if(diaSemana<0 || diaSemana>7){
            System.out.println("valor invalido");
        }else{
            System.out.println(semana[diaSemana-1]);
        }
    }
}
