public class ex02 {
    public static void main(String[] args) {
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 15;
		salario = 29560.9;
		nome = "Cleslley de Moura";
		sexo = 'M';
		
		System.out.println("A funcionaria " + nome +
				", sexo " + sexo + ", ganha " +
				String.format("%.2f", salario) + " e tem " +
				idade + " anos");

	}
}
