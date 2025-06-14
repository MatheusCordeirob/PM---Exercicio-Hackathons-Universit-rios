import java.util.ArrayList;
import java.util.List;

public class Banca implements Avaliavel {
    private List<Jurado> jurados;

    public Banca() {
        jurados = new ArrayList<>();
    }

    public void adicionarJurado(Jurado jurado) {
        if (jurados.size() < 4) {
            jurados.add(jurado);
        }
    }

    public List<Jurado> getJurados() {
        return jurados;
    }

    @Override
    public double calcularNotaFinal() {
        return jurados.stream()
                .mapToDouble(Jurado::getNota)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Banca: " + jurados;
    }
}