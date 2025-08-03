package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.Timer;

public class Planeta {
    private double tamanho;
    private Color cor;
    private int posicao;
    private double velocidade;
    private double lastX = -1;
    private double lastY = -1;

    public Planeta(int posicao, double tamanho, double speed, Color cor){
        this.posicao = posicao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.velocidade = speed;
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
        }
        draw.setPenColor(this.cor);
        double x = centroX + (raioX + (75 * (posicao - 1))) * Math.cos(angulo);
        double y = centroY + (raioY + (50 * (posicao - 1))) * Math.sin(angulo);
        draw.filledCircle(x, y, tamanho);
        lastX = x;
        lastY = y;
    }
}