package br.com.metodosjava.intellij.dio;

/**
 * Classe principal dos exercícios Aula 1 - Métodos Java.
 */
public class Execucao {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercícios Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercícios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        // Empréstimo
        System.out.println("Exercícios Empréstimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000, 5);


    }
}
