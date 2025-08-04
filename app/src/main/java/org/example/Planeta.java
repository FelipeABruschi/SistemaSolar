package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.Timer;

public class Planeta {
    private double tamanho;
    private Color cor;
    private int posicao;
    private boolean anel;
    private double velocidade;
    private double lastX = -1;
    private double lastY = -1;

    public Planeta(int posicao, double tamanho, double speed, boolean ring, Color cor){
        this.posicao = posicao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.velocidade = speed;
        this.anel = ring;
    }

    public int getPosicao(){
        return this.posicao;
    }

    public double getTamanho(){
        return this.tamanho;
    }

    public Color getCor(){
        return this.cor;
    }

    public double getVelocidade(){
        return this.velocidade;
    }

    public void desenha(Draw draw, double centroX, double centroY, double raioX, double raioY, double angulo) {
        if (lastX >= 0 && lastY >= 0) {
            draw.setPenColor(new Color(0, 0, 20)); // mesma cor do fundo
            draw.filledCircle(lastX, lastY, tamanho + 1); // tamanho um pouco maior para cobrir bem
            if (this.anel) {
                draw.setPenColor(new Color(0, 0, 20));
                draw.filledEllipse(lastX, lastY, this.getTamanho() + 64, this.getTamanho());
            }
        }
        draw.setPenColor(this.cor);
        double x = centroX + (raioX + (75 * (posicao - 1))) * Math.cos(angulo);
        double y = centroY + (raioY + (50 * (posicao - 1))) * Math.sin(angulo);
        draw.filledCircle(x, y, tamanho);
        if(this.anel){
            draw.setPenColor(Color.WHITE);
            draw.ellipse(x, y, this.getTamanho() + 32, this.getTamanho() / 2);
        }
        lastX = x;
        lastY = y;
    }
}