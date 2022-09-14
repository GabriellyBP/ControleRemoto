package br.com.gabrielly;

import java.util.Scanner;

public class ControleRemoto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Televisao tv = new Televisao();
        Decodificador decoder = new Decodificador();
        boolean repetir = true;
        boolean repetir2 = true;
        int t = digiteValores("Para TV digite 1, para Decoder digite 2, para Desligar digite 3: ");
        while (repetir) {
            switch (t) {
                case 1: 
                    tv.isLigado();
                    Helper.trocarCanal(tv, digiteValores("Digite o canal desejado")); 
                    Helper.trocarVolume(tv, digiteValores("Digite o volume desejado"));
                    System.out.printf("\nCanal: " + tv.getCanal());
                    System.out.printf("\nVolume: " + tv.getVolume());
                    System.out.printf("\nAparalho: " + tv.getNome() + " está ligado \n");
                    repetir = false;
                    break;
                case 2:
                    decoder.isLigado();
                    Helper.trocarCanal(decoder, digiteValores("Digite o canal desejado")); 
                    Helper.trocarVolume(decoder, digiteValores("Digite o volume desejado"));
                    System.out.printf("\nCanal: " + decoder.getCanal());
                    System.out.printf("\nVolume: " + decoder.getVolume());
                    System.out.printf("\nAparalho: " + decoder.getNome() + " está ligado \n");
                    repetir = false;
                    break;
                case 3:
                    decoder.isLigado();
                    tv.isLigado();
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
                        Helper.trocarCanal(tv, digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + tv.getCanal());
                        System.out.printf("\nVolume: " + tv.getVolume());
                        System.out.printf("\nAparalho: " + tv.getNome() + " está ligada \n");
                    } else {
                        Helper.trocarCanal(decoder, digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + decoder.getCanal());
                        System.out.printf("\nVolume: " + decoder.getVolume());
                        System.out.printf("\nAparalho: " + decoder.getNome() + " está ligada \n");
                    }
                    break;
                case 2:
                    if (t == 1) {
                        Helper.trocarVolume(tv, digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + tv.getCanal());
                        System.out.printf("\nVolume: " + tv.getVolume());
                        System.out.printf("\nAparalho: " + tv.getNome() + " está ligada \n");
                    } else {
                        Helper.trocarVolume(decoder, digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + decoder.getCanal());
                        System.out.printf("\nVolume: " + decoder.getVolume());
                        System.out.printf("\nAparalho: " + decoder.getNome() + " está ligada \n");
                    }
                    break;
                case 99:
                    if (t == 1) {
                        t = 2;
                        Helper.trocarCanal(decoder, digiteValores("Digite o canal desejado"));
                        Helper.trocarVolume(decoder, digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + decoder.getCanal());
                        System.out.printf("\nVolume: " + decoder.getVolume());
                        System.out.printf("\nAparalho: " + decoder.getNome() + " está ligada \n");
                    } else {
                        t = 1;
                        Helper.trocarCanal(tv, digiteValores("Digite o canal desejado"));
                        Helper.trocarVolume(tv, digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + tv.getCanal());
                        System.out.printf("\nVolume: " + tv.getVolume());
                        System.out.printf("\nAparalho: " + tv.getNome() + " está ligada \n");
                    }
                    break;
                case 3:
                    decoder.isLigado();
                    tv.isLigado();
                    System.out.printf("\nAparalhos estão desligados \n");
                    repetir2 = false;
                    break;
                default:
                    System.out.printf("\"Valor inválido");
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
