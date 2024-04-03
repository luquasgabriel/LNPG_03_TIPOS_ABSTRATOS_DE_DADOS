public class Xadrez {
    private String tipo;
    private String cor;
    private int[] posicao;

    public Xadrez(String tipo, String cor, int[] posicao) {
        this.tipo = tipo;
        this.cor = cor;
        this.posicao = posicao;
    }

    public void mover(int[] novaPosicao) {

    }

    public void capturar(Xadrez pecaOponente) {

    }

    public boolean ehMovimentoValido(int[] novaPosicao) {
        return false;
    }

    public String[] obterInformacoesPeca() {
        return new String[]{tipo, cor, posicao[0] + "," + posicao[1]};
    }
}

public class Rei extends Xadrez {
    public Rei(String cor, int[] posicao) {
        super("Rei", cor, posicao);
    }
}

public class Rainha extends Xadrez {
    public Rainha(String cor, int[] posicao) {
        super("Rainha", cor, posicao);
    }
}

public class TabuleiroXadrez {
    private Xadrez[][] tabuleiro;

    public TabuleiroXadrez() {
        this.tabuleiro = new Xadrez[8][8];
    }

    public boolean moverPeca(int[] posicaoAtual, int[] novaPosicao) {
        return false;
    }

    public boolean capturarPeca(int[] posicaoAtual, int[] posicaoOponente) {
        return false;
    }

    public boolean ehMovimentoValido(int[] posicaoAtual, int[] novaPosicao) {
        return false;
    }
}
