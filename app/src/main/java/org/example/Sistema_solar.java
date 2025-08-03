package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Sistema_solar {
    private double x;
    private double y;
    private int numero_planetas;
    private double raiox;
    private double raioy;
    private Sol meu_sol;
    private Planeta[] planetas;

    public Sistema_solar(int numero_planetas){
        //Cordenadas x e y do centro das elipses
        this.x = 800;
        this.y = 450;
        this.numero_planetas = numero_planetas;
        this.planetas = new Planeta[numero_planetas];
        this.raiox = 100;
        this.raioy = 50;
        this.meu_sol = new Sol(x, y);
    }

    public void desenha(Draw draw){
        this.meu_sol.desenha(draw);

        double a = this.raiox;
        double b = this.raioy;
        for(int i = 0; i < numero_planetas; i++){
            draw.setPenColor(Color.WHITE);
            draw.ellipse(this.x, this.y, a, b);
            //aumenta o raio das elipses, cada elipse é a rota de um planeta
            a += 75;
            b += 50;
        }
    }

    public void desenha_planeta(Draw draw, double angulo){
        for(Planeta planeta : planetas){
            if(planeta == null)
                continue;
            planeta.desenha(draw, x, y, raiox, raioy, angulo * planeta.getVelocidade());
        }
    }

    public void add_planeta(Planeta planeta){
        this.planetas[planeta.getPosicao() - 1] = planeta;
    }
}