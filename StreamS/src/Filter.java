import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a = new Aluno("Marhlon", 8);
        Aluno b = new Aluno("Marthin", 8.5);
        Aluno c = new Aluno("Judas", 7.8);
        Aluno d = new Aluno("Luquinhas", 10);
        Aluno e = new Aluno("Adilson", 6.5);
        Aluno f = new Aluno("Juan", 3.2);

        List<Aluno> alunos = Arrays.asList(a, b, c, d, e, f);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                aluno -> "Parabéns " + aluno.nome + ", você está aprovado(a).";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

    }
    }
