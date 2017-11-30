/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingjeu;

/**
 *
 * @author p1623082
 */
public class Jeu {

    private int score;
    private int PointParLancer;
    private int lancer1;
    private int lancer2;
    

    public Jeu(int score, int lancer1,int lancer2, int PointParLancer) {
        this.score = score;
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
        this.PointParLancer = PointParLancer;
    }
    //on calcul le nbre de coup dans une manche qui est soit egale à 1 ou a 2
    //si on fait un streak il est egal à 1 sinon cest 2 coups
    public int CalculnbreDeLancer(int PointParLancer)
    {
        int nbreDeLancer=1;
       while (nbreDeLancer<=10)
        {
        if (PointParLancer==10)
        {
            nbreDeLancer=nbreDeLancer;;
        }
        else if (PointParLancer<10)
        {
            nbreDeLancer+=1;
        }
        
        }
        return nbreDeLancer;
    }

    public int calculScore(int nblancer) {
        int scorefinal = 0;
        int nbreDeLancer;
        int PointParLancer;
        for (nbreDeLancer = 0; nbreDeLancer <= 2; nbreDeLancer++) {
            score +=1;
        }
        return scorefinal;
    }

}
