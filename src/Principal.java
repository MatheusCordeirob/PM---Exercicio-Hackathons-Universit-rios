import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Universidade PUC = new Universidade("PUC Minas");

        Equipe equipe1 = new Equipe("Equipe 1");
        equipe1.adicionarMembro(new Estudante("Matheus", "202301", PUC));
        equipe1.adicionarMembro(new Estudante("Caio", "202302", PUC));
        equipe1.adicionarMembro(new Estudante("Pedro", "202303", PUC));
        equipe1.adicionarMembro(new Estudante("João", "202304", PUC));
        equipe1.adicionarMembro(new Estudante("Tadeu", "202305", PUC));

        Equipe equipe2 = new Equipe("Equipe 2");
        equipe2.adicionarMembro(new Estudante("Davi", "202306", PUC));
        equipe2.adicionarMembro(new Estudante("Danilo", "202307", PUC));
        equipe2.adicionarMembro(new Estudante("Heitor", "202308", PUC));
        equipe2.adicionarMembro(new Estudante("Mateus", "202309", PUC));
        equipe2.adicionarMembro(new Estudante("Candian", "202310", PUC));

        Profissional orientador1 = new Profissional("Profa. Michelle", "Orientadora", PUC);
        Profissional orientador2 = new Profissional("Prof. Sandro", "Orientador", PUC);

        Projeto projeto1 = new Projeto("Laboratório de Programação Modular", "Projeto sobre boas práticas em Java modular.", equipe1, orientador1);
        Projeto projeto2 = new Projeto("Algoritmo e Estrutura de Dados 1", "Projeto que visualiza pilhas, filas e listas ligadas.", equipe2, orientador2);

        Banca banca1 = new Banca();
        banca1.adicionarJurado(new Jurado("Profa. Michelle", "Docente", PUC, 8.0));
        banca1.adicionarJurado(new Jurado("Prof. Danilo", "Docente", PUC, 7.5));
        banca1.adicionarJurado(new Jurado("Prof. Laerte", "Docente", PUC, 9.0));
        banca1.adicionarJurado(new Jurado("Prof. Daniel", "Docente", PUC, 8.5));

        Banca banca2 = new Banca();
        banca2.adicionarJurado(new Jurado("Prof. Sandro", "Docente", PUC, 6.5));
        banca2.adicionarJurado(new Jurado("Profa. Lessandro", "Docente", PUC, 7.0));
        banca2.adicionarJurado(new Jurado("Prof. Bruno", "Docente", PUC, 7.5));
        banca2.adicionarJurado(new Jurado("Profa. Camila", "Docente", PUC, 6.0));

        Sala sala1 = new Sala("Lab A01");
        Sala sala2 = new Sala("Lab B02");

        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.now());

        apresentacao1.avaliar();
        apresentacao2.avaliar();

        List<Apresentacao> apresentacoes = Arrays.asList(apresentacao1, apresentacao2);

        System.out.println("\nRelatório das Apresentações:");
        apresentacoes.forEach(System.out::println);

        System.out.println("\nProjetos aprovados (nota ≥ 7):");
        apresentacoes.stream()
            .filter(a -> a.getNotaFinal() >= 7)
            .forEach(a -> System.out.println(a.toString()));
    }
}