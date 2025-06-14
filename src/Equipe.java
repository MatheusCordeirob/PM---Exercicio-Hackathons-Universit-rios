import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomeEquipe;
    private List<Estudante> membros;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante estudante) {
        if (membros.size() < 5) {
            membros.add(estudante);
        }
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    @Override
    public String toString() {
        return "Equipe: " + nomeEquipe + " - Alunos: " + membros;
    }
}