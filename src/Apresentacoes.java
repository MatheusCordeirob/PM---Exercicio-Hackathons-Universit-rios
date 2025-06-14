import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> listaApresentacoes;

    private Apresentacoes() {
        listaApresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstancia() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    public void adicionar(Apresentacao apresentacao) {
        listaApresentacoes.add(apresentacao);
    }

    public List<Apresentacao> getTodas() {
        return listaApresentacoes;
    }

    public List<Apresentacao> getAprovadas() {
        return listaApresentacoes.stream()
                .filter(a -> a.getNotaFinal() >= 7)
                .toList();
    }
}
