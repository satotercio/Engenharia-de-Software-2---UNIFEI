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
public class Batalha {
    
    MediadorBatalha mediador;

    public MediadorBatalha getMediador() {
        return mediador;
    }

    public void setMediador(MediadorBatalha mediador) {
        this.mediador = mediador;
    }
    
    
    
    protected void chamarAtaque(int opcao){
        getMediador().ataque(opcao);
    }
}
