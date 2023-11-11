package org.example.personagens;

import org.example.Personagem;
import org.example.utils.DadoUtil;


public class Guerreiro extends Personagem {
    public Guerreiro(){
        super(12, 4, 3, 3, "Guerreiro");
    }
    @Override
    public int getFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4();
    }
}
