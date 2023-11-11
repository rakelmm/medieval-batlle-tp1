package org.example.personagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.utils.DadoUtil;
import org.example.Personagem;

public class Barbaro extends Personagem {
    public Barbaro() {
        super(13, 6, 1, 3, "Barbaro");
    }

    @Override
    public int getFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD6() + dadoUtil.rollD6();
    }
}
