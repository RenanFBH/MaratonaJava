package teste.maratonajava.exercicios.dominio;

public class Pessoa {

    private String nome;
    private String dataDeNascimento;
    private Universidade universidade;
    private Departamento departamento;

    public Pessoa(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Pessoa(String nome, String dataDeNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.universidade = universidade;
    }

    public Pessoa(String nome, String dataDeNascimento, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    public void informacoes() {
        System.out.println("------ Pessoa ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        if (universidade != null) {
            System.out.println("Universidade: " + universidade.getNome());
        }
        if (departamento != null) {
            System.out.println("Departamento: " + departamento.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
