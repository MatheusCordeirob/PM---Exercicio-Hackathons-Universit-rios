import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel avaliador;
    private Sala sala;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel avaliador, Sala sala, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.avaliador = avaliador;
        this.sala = sala;
        this.dataHora = dataHora;
    }

    public void avaliar() {
        double nota = avaliador.calcularNotaFinal();
        projeto.setBanca((Banca) avaliador);
        projeto.calcularNotaFinal();
    }

    public double getNotaFinal() {
        return projeto.getNotaFinal();
    }

    @Override
    public String toString() {
        return "Apresentação do projeto: " + projeto.getTitulo() + "\n" +
               "Equipe: " + projeto.getEquipe().getNomeEquipe() + "\n" +
               "Sala: " + sala + "\n" +
               "Data/Hora: " + dataHora + "\n" +
               "Nota final: " + projeto.getNotaFinal();
    }
}