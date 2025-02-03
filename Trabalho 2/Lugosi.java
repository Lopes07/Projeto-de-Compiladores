/* Generated By:JavaCC: Do not edit this line. Lugosi.java */
import java.io.*;
public class Lugosi implements LugosiConstants {

  public static void main(String args[]) throws ParseException,IOException {

 Lugosi analisador = new Lugosi(new FileInputStream(args[0]));
 analisador.Lugosi();
  }

  static final public void Lugosi() throws ParseException {
 Token t;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIN:
      case LET:
      case FLOAT:
      case BOOL:
      case TRUE:
      case FALSE:
      case ACHAVES:
      case FCHAVES:
      case VOID:
      case PV:
      case ATRIB:
      case V:
      case SOMA:
      case SUB:
      case MULT:
      case DIV:
      case AND:
      case OR:
      case LESSER:
      case GREATER:
      case EQUAL:
      case IF:
      case WHILE:
      case RETURN:
      case PRINT:
      case TOKEN_id:
      case TOKEN_numliteral:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIN:
        jj_consume_token(MAIN);
           System.out.println("Palavra reservada: main");
        break;
      case LET:
        jj_consume_token(LET);
          System.out.println("Palavra reservada: let");
        break;
      case FLOAT:
        jj_consume_token(FLOAT);
            System.out.println("Palavra reservada: float");
        break;
      case BOOL:
        jj_consume_token(BOOL);
           System.out.println("Palavra reservada: bool");
        break;
      case TRUE:
        jj_consume_token(TRUE);
           System.out.println("Palavra reservada: true");
        break;
      case FALSE:
        jj_consume_token(FALSE);
            System.out.println("Palavra reservada: false");
        break;
      case ACHAVES:
        jj_consume_token(ACHAVES);
              System.out.println("Abre chaves: {");
        break;
      case FCHAVES:
        jj_consume_token(FCHAVES);
              System.out.println("Fecha chaves: }");
        break;
      case VOID:
        jj_consume_token(VOID);
           System.out.println("Palavra reservada: void");
        break;
      case TOKEN_numliteral:
        t = jj_consume_token(TOKEN_numliteral);
                         System.out.println("N\u00c3\u00bamero: "+ t.image);
        break;
      case TOKEN_id:
        t = jj_consume_token(TOKEN_id);
                 System.out.println("Identificador: "+ t.image);
        break;
      case PV:
        jj_consume_token(PV);
        System.out.println("Ponto e v\u00c3\u00adrgula: ;");
        break;
      case ATRIB:
        jj_consume_token(ATRIB);
           System.out.println("Atribui\u00c3\u00a7\u00c3\u00a3o: :=");
        break;
      case V:
        jj_consume_token(V);
       System.out.println("V\u00c3\u00adrgula: ,");
        break;
      case SOMA:
        jj_consume_token(SOMA);
          System.out.println("Operador soma: +");
        break;
      case SUB:
        jj_consume_token(SUB);
         System.out.println("Operador subtra\u00c3\u00a7\u00c3\u00a3o: -");
        break;
      case MULT:
        jj_consume_token(MULT);
          System.out.println("Operador multiplica\u00c3\u00a7\u00c3\u00a3o: *");
        break;
      case DIV:
        jj_consume_token(DIV);
         System.out.println("Operador divis\u00c3\u00a3o: /");
        break;
      case AND:
        jj_consume_token(AND);
         System.out.println("Operador E l\u00c3\u00b3gico: &&");
        break;
      case OR:
        jj_consume_token(OR);
        System.out.println("Operador OU l\u00c3\u00b3gico: ||");
        break;
      case LESSER:
        jj_consume_token(LESSER);
            System.out.println("Operador menor: <");
        break;
      case GREATER:
        jj_consume_token(GREATER);
             System.out.println("Operador maior: >");
        break;
      case EQUAL:
        jj_consume_token(EQUAL);
           System.out.println("Operador igual: ==");
        break;
      case IF:
        jj_consume_token(IF);
         System.out.println("Palavra reservada: if");
        break;
      case WHILE:
        jj_consume_token(WHILE);
            System.out.println("Palavra reservada: while");
        break;
      case RETURN:
        jj_consume_token(RETURN);
             System.out.println("Palavra reservada: return");
        break;
      case PRINT:
        jj_consume_token(PRINT);
            System.out.println("Palavra reservada: printIO");
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public LugosiTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xffffffe0,0xffffffe0,};
   }

  /** Constructor with InputStream. */
  public Lugosi(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Lugosi(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LugosiTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Lugosi(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LugosiTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Lugosi(LugosiTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LugosiTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[32];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 32; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
