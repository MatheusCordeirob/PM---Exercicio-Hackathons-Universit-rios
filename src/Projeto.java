public class Projeto {
    private String titulo;
    private String descricao;
    private Equipe equipe;
    private Profissional orientador;
    private Banca banca;
    private double notaFinal;

    public Projeto(String titulo, String descricao, Equipe equipe, Profissional orientador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.equipe = equipe;
        this.orientador = orientador;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public void calcularNotaFinal() {
        if (banca != null) {
            this.notaFinal = banca.calcularNotaFinal();
        }
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    @Override
    public String toString() {
        return "Projeto: " + titulo + " | Equipe: " + equipe.getNomeEquipe();
    }
}