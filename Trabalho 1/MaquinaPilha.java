import java.io.*;
import java.util.*;

class MaquinaPilha {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java MaquinaPilha <arquivoDeEntrada>");
            return;
        }

        Stack<Integer> pilha = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" ");

                switch (partes[0]) {
                    case "PUSH":
                        int valor = Integer.parseInt(partes[1]);
                        pilha.push(valor);
                        break;
                    case "SUM":
                        if (pilha.size() < 2) throw new RuntimeException("Erro: pilha com menos de 2 elementos para soma.");
                        pilha.push(pilha.pop() + pilha.pop());
                        break;
                    case "MULT":
                        if (pilha.size() < 2) throw new RuntimeException("Erro: pilha com menos de 2 elementos para multiplicação.");
                        pilha.push(pilha.pop() * pilha.pop());
                        break;
                    case "SUB":
                        if (pilha.size() < 2) throw new RuntimeException("Erro: pilha com menos de 2 elementos para subtração.");
                        int subtraiB = pilha.pop();
                        int subtraiA = pilha.pop();
                        pilha.push(subtraiA - subtraiB);
                        break;
                    case "DIV":
                        if (pilha.size() < 2) throw new RuntimeException("Erro: pilha com menos de 2 elementos para divisão.");
                        int divisor = pilha.pop();
                        int dividendo = pilha.pop();
                        if (divisor == 0) throw new ArithmeticException("Erro: divisão por zero.");
                        pilha.push(dividendo / divisor);
                        break;
                    case "PRINT":
                        if (pilha.isEmpty()) throw new RuntimeException("Erro: pilha vazia, nada para imprimir.");
                        System.out.println("Resultado: " + pilha.pop());
                        break;
                    default:
                        throw new RuntimeException("Erro: instrução desconhecida - " + linha);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar a máquina de pilha: " + e.getMessage());
        }
    }
}
