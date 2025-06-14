public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, String matricula, Instituicao instituicao) {
        super(nome, instituicao);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return getNome() + " (" + matricula + ")";
    }
}