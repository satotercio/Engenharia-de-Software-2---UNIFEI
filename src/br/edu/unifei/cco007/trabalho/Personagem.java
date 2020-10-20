/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco007.trabalho;

/**
 *
 * @author Tercio
 */
public abstract class Personagem extends Batalha{
    private String nome;
    private int experiencia = 0;
    private int levelAtual = 0;
    private Comando comando;  

    public Comando getComando() {
        return comando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  int getExperiencia() {
        return experiencia;
    }

    public  void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevelAtual() {
        return levelAtual;
    }

    public void setLevelAtual(int levelAtual) {
        this.levelAtual = levelAtual;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
    
    
    
    public abstract int tecnica(int opcao);
}
