package teste.maratonajava.exercicios.dominio;

public class Universidade {

    private String nome;
    private String local;
    private Departamento departamentos[];

    public Universidade(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public Universidade(String nome, String local, Departamento[] departamentos) {
        this.nome = nome;
        this.local = local;
        this.departamentos = departamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

}
