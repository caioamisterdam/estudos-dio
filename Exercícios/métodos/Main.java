package métodos;

public class Main {
    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisão(5, 2.5);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Emprestímo
        System.out.println("Exercício Emprestímo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); // o parametro tbm pode ser o valor 2
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas()); // o parametro tbm pode ser o valor 3
        Emprestimo.calcular(1000, 5);
    }
}
