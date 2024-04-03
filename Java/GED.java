public class GED {
    public static void main(String[] args) {
    }
}

class Funcionario {
    private String nome;
    private int id;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, int id, String cargo, double salario, Departamento departamento) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void atualizarInformacoesPessoais(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void transferirParaOutroDepartamento(Departamento novoDepartamento) {
        this.departamento.removerFuncionario(this);
        novoDepartamento.adicionarFuncionario(this);
        this.departamento = novoDepartamento;
    }

    public Departamento obterDepartamentoAssociado() {
        return this.departamento;
    }
}

class Departamento {
    private String nome;
    private int id;
    private String localizacao;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome, int id, String localizacao) {
        this.nome = nome;
        this.id = id;
        this.localizacao = localizacao;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public ArrayList<Funcionario> obterFuncionariosAssociados() {
        return this.funcionarios;
    }
}
