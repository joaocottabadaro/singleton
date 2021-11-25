public class Presidente {


    private Presidente() {};

    private static Presidente presidente = new Presidente();

    public static Presidente getPresidente() {
        return presidente;
    }

    private String nome;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
