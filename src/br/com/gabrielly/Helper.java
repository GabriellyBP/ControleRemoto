package br.com.gabrielly;

// classe helper /Utils para metodos static usados na TV e Decoder.
public class Helper {

    private static final int C_MAX_TV = 37;
    private static final int C_MAX_DECODER = 148;
    private static final int V_MAX = 100;

    public static void trocarCanal(Televisao tv, int canal) {
        if (canal <= C_MAX_TV) {
            Televisao televisao = tv;
            televisao.setCanal(canal);
        } else {
            System.out.println("Canal escolhido nao existe");
        }
    }

    public static void trocarCanal(Decodificador decoder, int canal) {
        if (canal <= C_MAX_DECODER) {
            Decodificador decodificador = decoder;
            decodificador.setCanal(canal);
        } else {
            System.out.println("Canal escolhido nao existe");
        }
    }

    public static void trocarVolume(Televisao tv, int volume) {
        Televisao televisao = tv;
        if (volume <= V_MAX) {
            televisao.setVolume(volume);
        } else {
            televisao.setVolume(volume);
            System.out.println("Volume maior que o máximo permitido, setado o valor máximo");
        }
    }

    public static void trocarVolume(Decodificador decoder, int volume) {
        Decodificador decodificador = decoder;
        if (volume <= V_MAX) {
            decodificador.setVolume(volume);
        } else {
            decodificador.setVolume(volume);
            System.out.println("Volume maior que o máximo permitido, setado o valor máximo");
        }
    }
}
