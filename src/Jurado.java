public class Jurado extends Profissional {
    private double nota;

    public Jurado(String nome, String cargo, Instituicao instituicao, double nota) {
        super(nome, cargo, instituicao);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return getNome() + " - Nota: " + nota;
    }
}