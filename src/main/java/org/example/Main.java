package org.example;

import org.example.utils.PersonagemUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getBoasVindas();

        Scanner scanner = new Scanner(System.in);
        String nickname = scanner.next();

        getMenu();

        System.out.print("Escolha o seu herói: ");
        int escolhaHeroi = scanner.nextInt();

        PersonagemUtil personagemUtil = new PersonagemUtil();

        Personagem heroi = personagemUtil.getHeroi(escolhaHeroi);
        System.out.printf("%nHéroi:%n" +
                        "- Classe: %s%n" +
                        "- Pontos de vida: %d%n" +
                        "- Força: %d%n" +
                        "- Ataque: %d%n" +
                        "- Agilidade: %d%n%n",
                heroi.getClasse(),
                heroi.getPontosDeVida(),
                heroi.getPontosDeForca(),
                heroi.getPontosDeAtaque(),
                heroi.getPontosDeAgilidade());
        int fatorDeDano = heroi.getFatorDeDano();
        System.out.println(fatorDeDano);

        Personagem monstro = personagemUtil.getMonstro();
        System.out.printf("Monstro:%n" +
                        "- Classe: %s%n" +
                        "- Pontos de vida: %d%n" +
                        "- Força: %d%n" +
                        "- Ataque: %d%n" +
                        "- Agilidade: %d%n%n",
                monstro.getClasse(),
                monstro.getPontosDeVida(),
                monstro.getPontosDeForca(),
                monstro.getPontosDeAtaque(),
                monstro.getPontosDeAgilidade());

    }

    public static void getMenu() {
        System.out.println("================================");
        System.out.println("Digite a classe do seu herói: ");
        System.out.println("1 - Guerreiro ");
        System.out.println("2 - Bárbaro");
        System.out.println("3 - Paladino");
        System.out.println("================================");
    }

    public static void getBoasVindas() {
        System.out.println("Bem vindo ao Medieval Battle!");
        System.out.println("================================");
        System.out.println("Digite seu nickname:");
    }

}