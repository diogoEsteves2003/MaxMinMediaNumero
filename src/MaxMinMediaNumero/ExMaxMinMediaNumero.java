package MaxMinMediaNumero;

import java.util.Random;

public class ExMaxMinMediaNumero {
    public static void main(String[] args) {

        int[] colecao = new int[20];
        Random rnd = new Random();

        int max = 0;
        int min = 999999999;
        long soma = 0;
        double media;

        for(int i = 0; i < colecao.length; i++){
            colecao[i] = rnd.nextInt(1000);
        }

        for(int i = 0; i < colecao.length; i++){
            System.out.println(colecao[i]);
            if(colecao[i]<min) min = colecao[i];
            if(colecao[i]>max) max = colecao[i];
            soma += colecao[i];
        }

        media = soma / colecao.length;

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Media: " + media);
    }
}
