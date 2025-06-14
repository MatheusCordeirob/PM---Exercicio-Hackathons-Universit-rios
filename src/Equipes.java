import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instancia; 
    private List<Equipe> listaEquipes;

    private Equipes() {
        listaEquipes = new ArrayList<>();
    }

    public static Equipes getInstancia() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public void adicionarEquipe(Equipe equipe) {
        listaEquipes.add(equipe);
    }

    public List<Equipe> getTodas() {
        return listaEquipes;
    }

    public Equipe buscarPorNome(String nome) {
        return listaEquipes.stream()
            .filter(e -> e.getNomeEquipe().equalsIgnoreCase(nome))
            .findFirst()
            .orElse(null);
    }
}
