// 1 - Pacote
package intro;

// 2 - Referência as Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main (String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPÇÕES: ");
        System.out.println("C - Calcular área modo curto");
        System.out.println("E - Calcular área modo extendo");
        System.out.println("I - If Simples");
        System.out.println("D - Contar até Dez");
        System.out.println("R - Contagem Regressiva");
        System.out.println("Digite a opção desejada ");
        String opcao = scanner.next();

        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao){
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
                System.out.println("Você escolheu executar o método curto");
                calcularAreaModoCurto();
                break;
            case "d":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "r":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemRegressiva();
                break;
            case "e":
                System.out.println("Você escolheu executar o método extenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu executar o método default");
                break;
        }


    }


    public static void ifSimples(){

        //Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        //if = se
        //else = sendo

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }



    public static void calcularAreaModoExtenso(){
        System.out.println("Mostra o calculo extenso");
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // Largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + resultado + "m2");

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Mostra o calculo curto");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m2");

    }

    public static void contarAteDez(){

        //Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Crescente");

        for(int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }

    }

    public static void contagemRegressiva(){

        //Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem Regressiva");

        for(int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }

    }

}
