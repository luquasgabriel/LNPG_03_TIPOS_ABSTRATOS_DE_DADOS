#include <stdbool.h>

typedef struct {
    char titulo[100];
    char autor[100];
    int anoPublicacao;
    int copiasDisponiveis;
} Biblioteca;

Biblioteca* criarBiblioteca(char titulo[], char autor[], int anoPublicacao, int copiasDisponiveis);
char* obterTitulo(Biblioteca* livro);
char* obterAutor(Biblioteca* livro);
int obterAnoPublicacao(Biblioteca* livro);
int obterCopiasDisponiveis(Biblioteca* livro);
bool verificarDisponibilidadeCopia(Biblioteca* livro);
void obterInformacoes(Biblioteca* livro);
void emprestarCopia(Biblioteca* livro);
void devolverCopia(Biblioteca* livro);
