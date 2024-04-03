#include <stdio.h>
#include <stdlib.h>

typedef struct {
    char tipo[20];
    char cor[10];
    int posicao[2];
} Xadrez;

typedef struct {
    Xadrez **tabuleiro;
} TabuleiroXadrez;

Xadrez* criar_Xadrez(char tipo[], char cor[], int posicao[]);

void mover(Xadrez* peca, int novaPosicao[]);

void capturar(Xadrez* peca, Xadrez* pecaOponente);

int ehMovimentoValido(Xadrez* peca, int novaPosicao[]);

char** obterInformacoesPeca(Xadrez* peca);

TabuleiroXadrez* criar_TabuleiroXadrez();

int moverPeca(TabuleiroXadrez* tabuleiro, int posicaoAtual[], int novaPosicao[]);

int capturarPeca(TabuleiroXadrez* tabuleiro, int posicaoAtual[], int posicaoOponente[]);

int ehMovimentoValido(TabuleiroXadrez* tabuleiro, int posicaoAtual[], int novaPosicao[]);
