package br.com.gabrielly;

import java.util.Scanner;

public class ControleRemoto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aparelhos aparelho;
        Aparelhos tv = new Televisao();
        Aparelhos decoder = new Decodificador();
        boolean repetir = true;
        boolean repetir2 = true;
        int t = digiteValores("Para TV digite 1, para Decoder digite 2, para Desligar digite 3: ");
        while (repetir) {
            switch (t) {
                case 1:
                    aparelho = tv;
                    aparelho.isLigado();
                    aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                    aparelho.setarVolume(digiteValores("Digite o volume desejado"));

                    System.out.printf("\nCanal: " + aparelho.getCanal());
                    System.out.printf("\nVolume: " + aparelho.getVolume());
                    System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligado \n");
                    repetir = false;
                    break;
                case 2:
                    aparelho = decoder;
                    aparelho.isLigado();
                    aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                    aparelho.setarVolume(digiteValores("Digite o volume desejado"));

                    System.out.printf("\nCanal: " + aparelho.getCanal());
                    System.out.printf("\nVolume: " + aparelho.getVolume());
                    System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligado \n");
                    repetir = false;
                    break;
                case 3:
                    aparelho = new Aparelhos();
                    aparelho.isLigado();
                    System.out.printf("\nAparelhos estão desligados \n");
                    repetir = false;
                    repetir2 = false;
                    break;
                default:
                    t = digiteValores("Valor inválido: \n Para TV digite 1, para Ligar Decoder digite 2, para Desligar digite 3: ");
                    break;
            }
        }
        while (repetir2) {
            int a = digiteValores("\n Para trocar de canal digite 1:\n Para trocar de volume digite 2:\n Para desligar digite 3: \n Para trocar de aparelho digite 99");
            switch (a) {
                case 1:
                    if (t == 1) {
                        aparelho = tv;
                        aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    } else {
                        aparelho = decoder;
                        aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    }
                    break;
                case 2:
                    if (t == 1) {
                        aparelho = tv;
                        aparelho.setarVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    } else {
                        aparelho = decoder;
                        aparelho.setarVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    }
                    break;
                case 99:
                    if (t == 1) {
                        t = 2;
                        aparelho = decoder;
                        aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                        aparelho.setarVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    } else {
                        t = 1;
                        aparelho = tv;
                        aparelho.setarCanal(digiteValores("Digite o canal desejado"));
                        aparelho.setarVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " está ligada \n");
                    }
                    break;
                case 3:
                    aparelho = new Aparelhos();
                    aparelho.isLigado();
                    System.out.printf("\nAparalhos estão desligados \n");
                    repetir2 = false;
                    break;
                default:
                    a = digiteValores("Valor inválido");
                    break;
            }
        }

    }

    private static int digiteValores(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();

    }

}
