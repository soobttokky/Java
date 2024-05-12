public class CadAluno {
	
	public int cod;
	public String nome;
	public int RGM;
	public String curso;
	// as variáveis estão alocadas aqui para simular a chamada de uma variável em um banco de dados,
	// mas poderia estar em 'Aluno'.

	public CadAluno (String curso, String nome) {// chama as variáveis de string  / PRIVATE --> torna não possível que variáveis dentro dela de serem chamadas.
		System.out.println("Aluno " + nome + ""  + " Cadastrado(a) realizado com sucesso no curso de " + curso + " "); 
		// Toda vez que um novo aluno for criado essa mensagem será impressa.

	}
	public void excluir () {
		
	}
	public void alterar () {
		
	}
	public void pesquisar () {
	
	}

}