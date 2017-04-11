package com.opet;

public class Aula11_04_2017_Exercicio1
{

    public static void main(String[] args)
    {
        int [][]matX = new int[2][3];
        matX[0][0] = 12;
        matX[0][1] = 13;
        matX[0][2] = 17;

        matX[1][0] = 9;
        matX[1][1] = 0;
        matX[1][2] = 15;

        /* varre o array e transpor */
        int [][] novaMatriz = transporMatriz(matX);

        /* Imprime a nova matriz para testar se está OK */
        for(int i=0;i<novaMatriz.length;i++) {
            for(int j=0; j<novaMatriz[i].length;j++) {
                System.out.println("Elemento "+i+","+j+":"+novaMatriz[i][j]);
            }
        }

    }

    public static int [][] transporMatriz(int [][] matriz)
    {
        int [][]resultado = new int[3][2];
        for(int i=0;i<matriz.length;i++) {
            for(int j=0; j<matriz[i].length;j++) {
                resultado[j][i] =matriz[i][j];
            }
        }
        return resultado;
    }

}
