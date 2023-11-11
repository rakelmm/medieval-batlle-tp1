package org.example.inimigos;

import org.example.Personagem;

public class Orc extends Personagem {
    public Orc() {
        super(20,6, 2, 2, "Orc");
    }

    @Override
    public int getFatorDeDano() {
        return 0;
    }
}
