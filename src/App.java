import java.time.LocalDate;
import main.java.*;

public class App {
    public static void main(String[] args) throws Exception {
        Conteudo mentoria1 = new Mentoria("Mentoria 1", "Descrição da mentoria", LocalDate.now());
        Conteudo curso1 = new Curso("Curso 1", "Descrição do curso", 12);
        Conteudo curso2 = new Curso("Curso 2", "Descrição do curso", 12);
        Bootcamp bootcamp = new Bootcamp(LocalDate.now(), LocalDate.now().plusDays(30), "Bootcamp 1",
                "Descrição do bootcamp");
        bootcamp.adicionarConteudo(mentoria1);
        bootcamp.adicionarConteudo(curso1);
        Bootcamp bootcamp2 = new Bootcamp(LocalDate.now(), LocalDate.now().plusDays(30), "Bootcamp 2",
                "Descrição do bootcamp");

        bootcamp2.adicionarConteudo(mentoria1);
        bootcamp2.adicionarConteudo(curso2);
        Dev dev = new Dev("José");
        Dev dev2 = new Dev("José");

        dev.inscreverBootcamp(bootcamp);
        dev.inscreverBootcamp(bootcamp2);
        dev.imprimirConteudosInscritos();
        System.out.println(dev.calcularTotalXp());
        System.out.println(dev.calcularTotalXp());
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(bootcamp.getConteudos().size());
        bootcamp.ImprimiDevs();
    }
}
