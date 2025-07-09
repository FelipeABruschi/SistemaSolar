package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;

public class Sistema_solar {
    private double x;
    private double y;
    private int numero_planetas;
    private double raiox;
    private double raioy;
    private Sol meu_sol;
    private ArrayList<Planeta> meus_planetas = new ArrayList<>();

    public Sistema_solar(){
        //Cordenadas x e y do centro das elipses
        this.x = 800;
        this.y = 450;
        this.numero_planetas = 8;
        this.raiox = 100;
        this.raioy = 50;
        this.meu_sol = new Sol();
    }

    public void desenha(Draw draw){
        int aux = meus_planetas.getFirst().getPosicao() - 1;
        for(int i = 0; i < numero_planetas; i++){
            draw.setPenColor(Color.WHITE);
            draw.ellipse(this.x, this.y, this.raiox, this.raioy);
            //aumenta o raio das elipses, cada elipse é a rota de um planeta
            this.raiox += 75;
            this.raioy += 50;
            if(i == aux){
                draw.setPenColor(meus_planetas.getFirst().getCor());
                draw.filledCircle(this.x, this.y + this.raioy - 50, meus_planetas.getFirst().getTamanho());
            }
        }
        this.meu_sol.desenha(draw);
    }

    public void add_planeta(Planeta planeta){
        meus_planetas.add(planeta);
    }
}