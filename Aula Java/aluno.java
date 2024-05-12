public class aluno {
	public static void main(String[] args) {
		
		// variáveis
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		// valores atribupidos a variáveis
		idade = 20;
		salario = 1300.5;
		altura = 1.83;
		genero = 'M';
		nome = "Clesley de Moura";
		
		//saída das variáveis
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
	}
}