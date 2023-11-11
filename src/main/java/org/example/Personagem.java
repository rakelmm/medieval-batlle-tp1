package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Personagem {
    private int pontosDeVida;
    private int pontosDeForca;
    private int pontosDeAtaque;
    private int pontosDeAgilidade;
    private String classe;

    public abstract int getFatorDeDano();
}
