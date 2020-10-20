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
public class App {
    public static void main(String[] args) {
        Fase f1 = new Fase();
        f1.setNomeFase("IESTI");
        Boss b1 = new Boss();
        b1.setNomeInimigo("RobotUil-Van");
        b1.setHP4(400);
        b1.setMP4(300);
        b1.setAtaque4(30);
        b1.setDefesa4(70);
        b1.setMagia4(67);
        b1.setDefMagia4(80);
        b1.setGold(1000000);
        b1.setExp(5000);
        b1.setItem("Excalibur");
        Humanoide h = new Humanoide();
        h.setNome("João");
        Ataque at = new Ataque();
        at.setCharacter1(h);
        at.setMonster(b1);
        h.setMediador(at);
        b1.setMediador(at);
        h.ataque1(1);
        h.ataque1(2);
        
        Boss b2 = new Boss();
        b1.setNomeInimigo("Odilossauro");
        b1.setHP4(300);
        b1.setMP4(300);
        b1.setAtaque4(30);
        b1.setDefesa4(70);
        b1.setMagia4(67);
        b1.setDefMagia4(80);
        b1.setGold(500);
        b1.setExp(5000);
        b1.setItem("Livro Calculo 3");
        Exatoide e = new Exatoide();
        h.setNome("Mario");
        Ataque at2 = new Ataque();
        at2.setCharacter1(h);
        at2.setMonster(b1);
        e.setMediador(at);
        e.setMediador(at);
        e.ataque2(1);
        e.ataque2(2);
        
        Boss b3 = new Boss();
        b1.setNomeInimigo("DragonMax");
        b1.setHP4(450);
        b1.setMP4(300);
        b1.setAtaque4(30);
        b1.setDefesa4(70);
        b1.setMagia4(67);
        b1.setDefMagia4(80);
        b1.setGold(1000000);
        b1.setExp(5000);
        b1.setItem("SuperChip");
        Professor p = new Professor();
        h.setNome("Paulo");
        Ataque at3 = new Ataque();
        at3.setCharacter1(h);
        at3.setMonster(b1);
        p.setMediador(at);
        p.setMediador(at);
        p.ataque3(1);
        p.ataque3(2);
        
        
    }
}
