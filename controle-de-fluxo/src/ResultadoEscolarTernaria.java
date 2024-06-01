public class ResultadoEscolarTernaria {
    public static void main(String[] args) {
	//Condição Ternária
    int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}