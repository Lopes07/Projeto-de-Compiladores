import java.io.*;

enum TokenType { NUM, SOMA, MULT, SUBTRACAO, DIVISAO, APar, FPar, EOF }

class Token {
    String lexema;
    TokenType token;

    Token(String l, TokenType t) {
        lexema = l;
        token = t;
    }
}

class AnaliseLexica {
    private PushbackReader arquivo;

    AnaliseLexica(String nomeArquivo) throws Exception {
        this.arquivo = new PushbackReader(new FileReader(nomeArquivo));
    }

    Token getNextToken() throws Exception {
        int eof = -1;
        char currchar;
        int currchar1;

        // Ignora espaços, tabulações e quebras de linha
        do {
            currchar1 = arquivo.read();
            currchar = (char) currchar1;
        } while (currchar == '\n' || currchar == ' ' || currchar == '\t' || currchar == '\r');

        if (currchar1 != eof && currchar1 != 10) {
            // Verifica se o caractere é um dígito
            if (currchar >= '0' && currchar <= '9') {
                StringBuilder sb = new StringBuilder();
                // Acumula todos os dígitos consecutivos
                while (currchar >= '0' && currchar <= '9') {
                    sb.append(currchar);
                    currchar1 = arquivo.read();
                    currchar = (char) currchar1;
                }
                // "Devolve" o último caractere lido (não é um dígito)
                if (currchar1 != eof) {
                    arquivo.unread(currchar1); // Devolve o caractere ao fluxo
                }
                // Retorna o token NUM com o número completo
                return new Token(sb.toString(), TokenType.NUM); // Agora passando String corretamente
            } else {
                // Outros tokens (parênteses, operadores, etc.)
                switch (currchar) {
                    case '(':
                        return new Token(String.valueOf(currchar), TokenType.APar);
                    case ')':
                        return new Token(String.valueOf(currchar), TokenType.FPar);
                    case '+':
                        return new Token(String.valueOf(currchar), TokenType.SOMA);
                    case '*':
                        return new Token(String.valueOf(currchar), TokenType.MULT);
                    case '-':
                        return new Token(String.valueOf(currchar), TokenType.SUBTRACAO);
                    case '/':
                        return new Token(String.valueOf(currchar), TokenType.DIVISAO);
                    default:
                        throw new Exception("Caractere inválido: " + ((int) currchar));
                }
            }
        }

        arquivo.close();
        return new Token("EOF", TokenType.EOF);
    }
}
