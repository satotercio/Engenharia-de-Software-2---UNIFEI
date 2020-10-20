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
public class Habilidade {

    HabExat hab1 = new HabExat();
    HabHum hab2 = new HabHum();
    HabProf hab3 = new HabProf();
    HabMonstro hab4 = new HabMonstro();

    public HabExat getHab1() {
        return hab1;
    }

    public void setHab1(HabExat hab1) {
        this.hab1 = hab1;
    }

    public HabHum getHab2() {
        return hab2;
    }

    public void setHab2(HabHum hab2) {
        this.hab2 = hab2;
    }

    public HabProf getHab3() {
        return hab3;
    }

    public void setHab3(HabProf hab3) {
        this.hab3 = hab3;
    }

    public HabMonstro getHab4() {
        return hab4;
    }

    public void setHab4(HabMonstro hab4) {
        this.hab4 = hab4;
    }

    public int habExat(int opcao) {
        switch (opcao) {
            case 1:
                return hab1.getDerivativeSword();
            case 2:
                return hab1.getThunderCpp();
            case 3:
                return hab1.getInvocarRobo();
            default:
                System.out.println("Erro");
                return 0;
        }
    }

    public int habHum(int opcao) {
        switch (opcao) {
            case 1:
                return hab2.getFilosofar();
            case 2:
                return hab2.getDrinkMaconha();
            case 3:
                return hab2.getGreveGeral();
            default:
                System.out.println("Erro");
                return 0;
        }

    }

    public int habProf(int opcao) {
        switch (opcao) {
            case 1:
                return hab3.getFazerPiada();
            case 2:
                return hab3.getAtirarApagador();
            case 3:
                return hab3.getEnsinarErrado();
            default:
                System.out.println("Erro");
                return 0;
        }
    }

    public int habMonstro(int opcao) {
        switch (opcao) {
            case 1:
                return hab4.getNotaBaixa();
            case 2:
                return hab4.getRedPen();
            case 3:
                return hab4.getSubBomb();
            case 4:
                return hab4.getCannonDP();
            default:
                System.out.println("Erro");
                return 0;
        }

    }
}
