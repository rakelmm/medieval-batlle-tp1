package org.example.utils;

import org.example.inimigos.Kobold;
import org.example.inimigos.MortoVivo;
import org.example.inimigos.Orc;
import org.example.Personagem;
import org.example.personagens.Barbaro;
import org.example.personagens.Guerreiro;
import org.example.personagens.Paladino;

import java.util.List;
import java.util.Random;

public class PersonagemUtil{
    public Personagem getHeroi(int escolhaHeroi) {
        try {
            List<Personagem> personagens = List.of(new Guerreiro(), new Barbaro(), new Paladino());
            return personagens.get(escolhaHeroi - 1);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Escolha inválida, Guerreiro por padrão");
            return new Guerreiro();
        }
    }

    public Personagem getMonstro() {
        List<Personagem> monstros = List.of(new Orc(), new Kobold(), new MortoVivo());
        Random random = new Random();
        int escolhaMonstro = random.nextInt(2);
        return  monstros.get(escolhaMonstro);
    }
}
