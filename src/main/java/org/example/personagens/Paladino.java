package org.example.personagens;

import org.example.utils.DadoUtil;
import org.example.Personagem;

public class Paladino extends Personagem {
    public Paladino() {
        super(15, 2, 5, 1, "Paladino");
    }

    @Override
    public int getFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4();
    }
}
