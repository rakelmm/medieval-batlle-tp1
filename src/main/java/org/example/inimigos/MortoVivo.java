package org.example.inimigos;

import org.example.Personagem;
import org.example.utils.DadoUtil;

public class MortoVivo extends Personagem {
    public MortoVivo() {
        super(25, 4, 0, 1, "Morto Vivo");
    }

    @Override
    public int getFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD8();
    }
}
