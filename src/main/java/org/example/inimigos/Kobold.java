package org.example.inimigos;

import org.example.Personagem;
import org.example.utils.DadoUtil;

public class Kobold extends Personagem {
    public Kobold() {
        super(20, 4, 2, 4, "Kobold");
    }

    @Override
    public int getFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD2() + dadoUtil.rollD2() + dadoUtil.rollD2();
    }
}
