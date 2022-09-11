package br.com.gabrielly;

import java.util.Scanner;

public class controleRemoto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        aparelhos aparelho;
        aparelhos tv = new televisao();
        aparelhos decoder = new decodificador();
        boolean repetir = true;
        boolean repetir2 = true;
        int t = digiteValores("Para TV digite 1, para Decoder digite 2, para Desligar digite 3: ");
        while (repetir) {
            switch (t) {
                case 1:
                    aparelho = tv;
                    aparelho.ligaDesliga(true);
                    aparelho.setCanal(digiteValores("Digite o canal desejado"));
                    aparelho.setVolume(digiteValores("Digite o volume desejado"));

                    System.out.printf("\nCanal: " + aparelho.getCanal());
                    System.out.printf("\nVolume: " + aparelho.getVolume());
                    System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    repetir = false;
                    break;
                case 2:
                    aparelho = decoder;
                    aparelho.ligaDesliga(true);
                    aparelho.setCanal(digiteValores("Digite o canal desejado"));
                    aparelho.setVolume(digiteValores("Digite o volume desejado"));

                    System.out.printf("\nCanal: " + aparelho.getCanal());
                    System.out.printf("\nVolume: " + aparelho.getVolume());
                    System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    repetir = false;
                    break;
                case 3:
                    aparelho = new aparelhos();
                    aparelho.ligaDesliga(false);
                    System.out.printf("\nAparalhos estao desligados \n");
                    repetir = false;
                    break;
                default:
                    t = digiteValores("Valor invalido: \n Para TV digite 1, para Ligar Decoder digite 2, para Desligar digite 3: ");
                    break;
            }
        }
        while (repetir2) {
            int a = digiteValores("\n Para trocar de canal difite 1:\n Para trocar de volume digite 2:\n Para desligar digite 3: \n Para trocar de aparelho digiete 99");
            switch (a) {
                case 1:
                    if (t == 1) {
                        aparelho = tv;
                        aparelho.setCanal(digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    } else {
                        aparelho = decoder;
                        aparelho.setCanal(digiteValores("Digite o canal desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    }
                    break;
                case 2:
                    if (t == 1) {
                        aparelho = tv;
                        aparelho.setVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    } else {
                        aparelho = decoder;
                        aparelho.setVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    }
                    break;
                case 99:
                    if (t == 1) {
                        aparelho = decoder;
                        aparelho.setCanal(digiteValores("Digite o canal desejado"));
                        aparelho.setVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    } else {
                        aparelho = tv;
                        aparelho.setCanal(digiteValores("Digite o canal desejado"));
                        aparelho.setVolume(digiteValores("Digite o volume desejado"));
                        System.out.printf("\nCanal: " + aparelho.getCanal());
                        System.out.printf("\nVolume: " + aparelho.getVolume());
                        System.out.printf("\nAparalho: " + aparelho.getNome() + " esta ligado \n");
                    }
                    break;
                case 3:
                    aparelho = new aparelhos();
                    aparelho.ligaDesliga(false);
                    System.out.printf("\nAparalhos estao desligados \n");
                    repetir2 = false;
                    break;
                default:
                    a = digiteValores("Valor invalido");
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
