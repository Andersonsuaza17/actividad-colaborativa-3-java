
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EscuelaConduccion {

    static class Aspirante {
        String nombre;
        String categoria;
        double nota;

        Aspirante(String nombre, String categoria, double nota) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.nota = nota;
        }
    }

    public static void main(String[] args) {

        List<Aspirante> aspirantes = Arrays.asList(
            new Aspirante("Carlos", "A2", 4.5),
            new Aspirante("Laura", "B1", 3.8),
            new Aspirante("Andres", "C1", 2.5),
            new Aspirante("Daniela", "B1", 4.0),
            new Aspirante("Miguel", "A2", 2.8)
        );

        Supplier<String> mensaje = () ->
            "ESCUELA DE CONDUCCION - RESULTADOS DE ASPIRANTES";

        System.out.println(mensaje.get());
        System.out.println("----------------------------------------");

        Predicate<Aspirante> aprobo =
            aspirante -> aspirante.nota >= 3.0;

        Function<Aspirante, Double> convertirNota =
            aspirante -> aspirante.nota * 20;

        Consumer<Aspirante> mostrarResultado = aspirante -> {

            System.out.println("Nombre: " + aspirante.nombre);
            System.out.println("Categoria: " + aspirante.categoria);
            System.out.println("Nota: " + aspirante.nota);

            if (aprobo.test(aspirante)) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: NO APROBADO");
            }

            System.out.println("Nota sobre 100: "
                + convertirNota.apply(aspirante));

            System.out.println("----------------------------------------");
        };

        for (Aspirante aspirante : aspirantes) {
            mostrarResultado.accept(aspirante);
        }
    }
}
