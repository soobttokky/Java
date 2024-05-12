public class Calculadora {

	public static void main(String[] args) {
		int idade;
		msg();
		msg("William");
		idade = calc(2004, 2024);
		System.out.println("A sua idade é: " + idade);
	}

	public static void msg() {
		System.out.println("Bom dia!");
	}
	
	public static void msg(String nome) {
		System.out.println("Bom dia! " + nome);
	}
	
	public static int calc(int ano_nasc, int ano_atual) {
		int idade = ano_atual - ano_nasc;
		return idade;
	}
}