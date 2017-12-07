    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;

/**
 *
 * @author luizv
 */
public class Gene {
    private char[] gene;
    private float fit;
    
    Gene(){}
    
    Gene(char[] gene){
        this.gene = gene;
        this.fit = calculateFit();
    }
    
    public char[] getGene(){
        return this.gene;
    }

    public float getFit() {
        return this.fit;
    }
    
    private float calculateFit(){
        int fit = 0;
        for (int i = 0; i < (gene.length - 1); i++){
            char noInicial = gene[i];
            char noFinal = gene[i+1];
            int posInicial = Grafo.grafo.get(noInicial);
            int posFinal = Grafo.grafo.get(noFinal);
            fit += Grafo.distancias[posInicial][posFinal];
        }
        return fit;
    }
}
