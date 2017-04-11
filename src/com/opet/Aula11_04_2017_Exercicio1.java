package com.opet;

import java.util.Random;
public class Aula11_04_2017_Exercicio1
{

    public static void main(String[] args)
    {
        int [][]matX = new int[2][3];
        /* declara um gerador, para gerar números aleatórios */
        Random gerador = new Random();
        //matX[0][0] = 50;
        /* Popula o valor da matriz com número aleatório */
        for(int i=0;i<matX.length;i++) {
            for(int j=0; j<matX[i].length;j++) {

                matX[i][j] = gerador.nextInt();
                System.out.println('Elemento '+i+' '+j+' '+matX[i][j]);
            }
        }

    }

}
