class CodeGen{


    int avaliaExpressao(ArvoreSintatica arv) {
        if (arv instanceof Num) {
            return ((Num) arv).num; // Se for um número, retorna o próprio valor
        }
        if (arv instanceof Soma) {
            return avaliaExpressao(((Soma) arv).arg1) + avaliaExpressao(((Soma) arv).arg2);
        }
        if (arv instanceof Mult) {
            return avaliaExpressao(((Mult) arv).arg1) * avaliaExpressao(((Mult) arv).arg2);
        }
        if (arv instanceof Subtracao) {
            return avaliaExpressao(((Subtracao) arv).arg1) - avaliaExpressao(((Subtracao) arv).arg2);
        }
        if (arv instanceof Divisao) {
            int divisor = avaliaExpressao(((Divisao) arv).arg2);
            if (divisor == 0) {
                throw new ArithmeticException("Erro: divisão por zero!");
            }
            return avaliaExpressao(((Divisao) arv).arg1) / divisor;
        }
        throw new RuntimeException("Erro: Expressão inválida!");
    }
	/*String geraCodigo (ArvoreSintatica arv)
	{
		return (geraCodigo2(arv) + "PRINT");
	}
	String geraCodigo2 (ArvoreSintatica arv)
	{

	if (arv instanceof Mult)
		return (geraCodigo2(((Mult) arv).arg1) + 
			geraCodigo2(((Mult) arv).arg2) +
			"MULT\n");

	if (arv instanceof Soma)
		return (geraCodigo2(((Soma) arv).arg1) + 
			geraCodigo2(((Soma) arv).arg2) +
			"SUM\n");
	
    if (arv instanceof Subtracao) 
        return (geraCodigo2(((Subtracao) arv).arg1) + 
			geraCodigo2(((Subtracao) arv).arg2) + 
			"SUB\n");
    
	
	if (arv instanceof Divisao) 
        return (geraCodigo2(((Divisao) arv).arg1) + 
			geraCodigo2(((Divisao) arv).arg2) +
			"DIV\n");
    
	if (arv instanceof Num)
		return ("PUSH "  + ((Num) arv).num + "\n");

	return "";
	}
*/
}
