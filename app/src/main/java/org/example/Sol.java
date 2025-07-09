package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Sol {
    private double tamanho;
    private Color cor;
    private double x;
    private double y;

    public Sol(){
        //Cordenadas x e y do centro do sol, no centro do sistema solar
        this.x = 800;
        this.y = 450;
        this.tamanho = 30;
        this.cor = Color.ORANGE;
    }

    public void desenha(Draw draw){
        draw.setPenColor(cor);
        draw.filledCircle(this.x, this.y, this.tamanho);
        draw.setPenColor(Color.RED);
        draw.circle(this.x, this.y, this.tamanho);
    }
}