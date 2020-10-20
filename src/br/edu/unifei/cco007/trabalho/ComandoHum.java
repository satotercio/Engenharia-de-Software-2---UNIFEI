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
public class ComandoHum implements Comando{
    private Habilidade habilidade = new Habilidade();
    public int executar(int opcao){
        return habilidade.habHum(opcao);
    }
}
