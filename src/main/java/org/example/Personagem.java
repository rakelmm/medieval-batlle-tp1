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


//    public Personagem(int pontosDeVida, int pontosDeForca, int pontosDeAtaque, int pontosDeAgilidade, String classe) {
//        this.pontosDeVida = pontosDeVida;
//        this.pontosDeForca = pontosDeForca;
//        this.pontosDeAtaque = pontosDeAtaque;
//        this.pontosDeAgilidade = pontosDeAgilidade;
//        this.classe = classe;
//
//    }

//    public int getPontosDeVida() {
//        return pontosDeVida;
//    }
//
//    public void setPontosDeVida(int pontosDeVida) {
//        this.pontosDeVida = pontosDeVida;
//    }
//
//    public int getPontosDeForca() {
//        return pontosDeForca;
//    }
//
//    public void setPontosDeForca(int pontosDeForca) {
//        this.pontosDeForca = pontosDeForca;
//    }
//
//    public int getPontosDeAtaque() {
//        return pontosDeAtaque;
//    }
//
//    public void setPontosDeAtaque(int pontosDeAtaque) {
//        this.pontosDeAtaque = pontosDeAtaque;
//    }
//
//    public int getPontosDeAgilidade() {
//        return pontosDeAgilidade;
//    }
//
//    public void setPontosDeAgilidade(int pontosDeAgilidade) {
//        this.pontosDeAgilidade = pontosDeAgilidade;
//    }

    public abstract int getFatorDeDano();

//    @Override
//    public String toString() {
//        return "Personagem{" +
//                "pontosDeVida=" + pontosDeVida +
//                ", classe='" + classe + '\'' +
//                '}';
//    }
}
