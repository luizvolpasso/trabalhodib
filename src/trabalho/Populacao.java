/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author luizv
 */
public class Populacao {
    private ArrayList<Gene> populacao;
    private float fit;

    Populacao(){
        this.populacao = new ArrayList<Gene>();
        this.fit = 0;
    }
    
    public void addGene(Gene gene){
        populacao.add(gene);
    }
    
    public float calculateFit(){
        Iterator it = populacao.iterator();
        while (it.hasNext()){
            Gene gene = (Gene)it.next();
            this.fit += gene.getFit();
        }
        return this.fit;
    }
    
    public ArrayList<Gene> getBests(){
        ArrayList<Gene> bests = new ArrayList<Gene>();
        Iterator it = populacao.iterator();
        Gene first, second;
        float firstFit, secondFit;
        first = null;
        second = null;
        firstFit = 100000;
        secondFit = 100000;
        while (it.hasNext()){
            Gene gene = (Gene)it.next();
            if ((gene.getFit() <= secondFit) && !(gene.getFit() <= firstFit)) second = gene;
            if (gene.getFit() <= firstFit){
                second = first;
                first = gene;
            }
        }
        bests.add(first);
        bests.add(second);
        return bests;
    }
}
