public class Profissional extends Pessoa {
    private String cargo;

    public Profissional(String nome, String cargo, Instituicao instituicao) {
        super(nome, instituicao);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}