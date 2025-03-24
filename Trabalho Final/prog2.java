// Código gerado pelo compilador Lugosi
public class prog2 {
  public static void main(String[] args) {
    double p = 0.0;
    double q = 0.0;
    double resultado = 0.0;
    boolean ehMenor = false;
    p = 20.0;
    q = 4.0;
    resultado = divide(p, q);
    System.out.println(resultado);
    resultado = soma(p, q);
    System.out.println(resultado);
    ehMenor = menor(p, q);
    if (ehMenor) {
      System.out.println(p);
    }
    p = 1.0;
    while ((p < 4.0)) {
      System.out.println((p * 3.0));
      p = (p + 1.0);
    }
  }
  public static double divide(boolean float, boolean float) {
    double resultado = 0.0;
    resultado = (x / y);
    return resultado;
  }
  public static double soma(boolean float, boolean float) {
    double resultado = 0.0;
    resultado = (x + y);
    return resultado;
  }
  public static boolean menor(boolean float, boolean float) {
    return (x < y);
  }
}
