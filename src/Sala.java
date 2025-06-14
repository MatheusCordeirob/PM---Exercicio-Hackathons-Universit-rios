public class Sala {
    private String identificacao;

    public Sala(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    @Override
    public String toString() {
        return "Sala " + identificacao;
    }
}