package org.example;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Planeta {
    private double tamanho;
    private Color cor;
    private int posicao;
    private double x;
    private double y;

    public Planeta(int posicao, double tamanho, Color cor){
        this.posicao = posicao;
        this.tamanho = tamanho;
        this.cor = cor;
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
}