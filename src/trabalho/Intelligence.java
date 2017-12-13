/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author luizv
 */
public class Intelligence {
    private float mutationTax;
    private Random random;

    Intelligence(float mutationTax){
        this.mutationTax = mutationTax;
        this.random = new Random();
    }
    
    private ArrayList<Gene> select(Populacao originalPop){
        ArrayList<Gene> bests = originalPop.getBests();
        ArrayList<Gene> worsts = originalPop.getWorsts();
        ArrayList<Gene> selected = new ArrayList<Gene>();
        Gene min = new Gene();
        Gene max = new Gene();
        
        int index = random.nextInt(bests.size());
        min = bests.get(index);
        index = random.nextInt(worsts.size());
        max = worsts.get(index);
        
        if (max.getGene().length < min.getGene().length){
            Gene aux = new Gene();
            aux = max;
            max = min;
            min = aux;
        }
        
        selected.add(min);
        selected.add(max);
        
        return selected;
    }
    
    private Populacao crossOver(ArrayList<Gene> genes){
        Populacao newPop = new Populacao();
        Gene gene, newGene;
        char[] newNode;
        int cutPoint1, cutPoint2;
        Iterator iterator = genes.iterator();
        
        while (iterator.hasNext()){
        	char[] parte1, parte2;
            gene = (Gene)iterator.next();
            parte1 = gene.getGene();
            cutPoint1 = random.nextInt(node1.length);
            gene = (Gene)iterator.next();
            parte2 = gene.getGene();
            cutPoint2 = random.nextInt(node2.length - cutPoint1) + cutPoint1;
            
            for(int i=0 ; i<cutPoint1; i++){
            	newNode[i] = parte1[i];
            }
            for(int j=cutpoint2 ; cutpoint2 <parte2.lenght; j++){
            	newNode[j] = parte1[j];
            }
            
            newGene = new Gene(node1);
            newPop.addGene(newGene)
        }        
        
        return newPop;
    }
}
