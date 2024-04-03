#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char nome[50];
    int id;
    char cargo[50];
    double salario;
    struct Departamento* departamento;
} Funcionario;

typedef struct Departamento {
    char nome[50];
    int id;
    char localizacao[50];
    Funcionario** funcionarios;
    int numFuncionarios;
} Departamento;

Funcionario* criarFuncionario(char nome[], int id, char cargo[], double salario, Departamento* departamento);
void atualizarInformacoesPessoais(Funcionario* funcionario, char nome[], char cargo[], double salario);
void transferirParaOutroDepartamento(Funcionario* funcionario, Departamento* novoDepartamento);
Departamento* obterDepartamentoAssociado(Funcionario* funcionario);

Departamento* criarDepartamento(char nome[], int id, char localizacao[]);
void adicionarFuncionario(Departamento* departamento, Funcionario* funcionario);
void removerFuncionario(Departamento* departamento, Funcionario* funcionario);
Funcionario** obterFuncionariosAssociados(Departamento* departamento);
