package métodos.retorno;

public class Quadrilatero {
    public static double area (double lado) {

        return lado * lado;
    }

    public static double area (double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area (double baseMaior, double baseMenor, double altura) {

        return (baseMaior + baseMenor) * altura /2;
    }

    public static void xpto() {       // o return não é obrigatório quando o método é void, mas funciona.
        System.err.println("Antes");
        return;
    }

    public static double abc() {       // o valor do return deve ser compatível com o tipo de método. 
        return 1.6;
    }

}
