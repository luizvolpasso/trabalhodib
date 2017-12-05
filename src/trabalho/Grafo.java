/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author luizv
 */
public class Grafo {
    public static HashMap<String,Integer> grafo = new HashMap();
    public static int distancias[][] = new int[22][22];
    public static char nos[] = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U'};
    
    Grafo(){
        for (int i = 0; i < nos.length; i++){
            grafo.put(Character.toString(nos[i]), i);
        }
        
        Random rand = new Random();
        int distancia;
        for (int i = 0; i < 22; i++){
            for (int j = 0; j < 22; j++){
                if (i == j) distancias[i][j] = 0;
                else{
                    distancia = rand.nextInt(9) + 10;
                    distancias[i][j] = distancia;
                }
            }
        }
        distancias[0][1] = 5;
        distancias[0][3] = 2;
        distancias[0][8] = 3;
        distancias[1][2] = 4;
        distancias[1][4] = 7;
        distancias[2][7] = 3;
        distancias[3][8] = 5;
        distancias[4][3] = 1;
        distancias[4][5] = 6;
        distancias[5][6] = 4;
        distancias[5][9] = 9;
        distancias[5][10] = 1;
        distancias[6][11] = 6;
        distancias[6][12] = 5;
        distancias[6][15] = 5;
        distancias[7][11] = 7;
        distancias[8][9] = 7;
        distancias[8][13] = 9;
        distancias[9][10] = 8;
        distancias[9][13] = 3;
        distancias[10][14] = 9;
        distancias[11][16] = 9;
        distancias[11][19] = 4;
        distancias[12][11] = 7;
        distancias[12][17] = 1;
        distancias[13][14] = 1;
        distancias[13][17] = 4;
        distancias[14][15] = 2;
        distancias[14][17] = 8;
        distancias[14][18] = 7;
        distancias[14][20] = 6;
        distancias[15][18] = 6;
        distancias[16][20] = 2;
        distancias[17][18] = 8;
        distancias[18][19] = 3;
        distancias[18][20] = 2;
        distancias[19][20] = 8;
        distancias[20][21] = 1;
    }
}
