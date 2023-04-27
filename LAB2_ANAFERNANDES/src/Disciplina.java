import java.util.Arrays;

/**
 * Esta classe serve para verificarmos se o aluno foi aprovado ou não, a partir
 * das notas do mesmo, se sua média for maior ou igual a 7.0, ele está aprovado,
 * caso contrário, reprovado.
 * 
 * @authora Ana Kethylen Sousa Fernandes
 */

public class Disciplina {

	/**
	 * Recebe uma disciplina com o nome especifíco.
	 * 
	 * @param nomeDisciplina uma string que representa o nome da disciplina.
	 */

	private String nomeDisciplina;

	/**
	 * horasEstudo diz a quantidade de tempo referente aos estudos
	 * do aluno na disciplina em questão
	 */

	private int horasEstudo;

	/**
	 * notas é um array que é utilizado para guardar as quatro notas do aluno, por
	 * isso o
	 * array é de 4 posições
	 * Após guardar as notas pode-se realizar o calculo da média
	 */

	private double[] notas = new double[4];

	/**
	 * media guarda o valor da média feito pela soma das notas e dividindo-as
	 * pela quantidade das mesmas
	 */

	private double media;

	/**
	 * Constrói a Disciplina deixando salvo o nome que virá da classe principal
	 */

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	/**
	 * Registra e acumula o número de horas de estudo cadastradas
	 *
	 * @param horas um valor inteiro que representa o número de horas de estudo da
	 *              disciplina.
	 */

	public void cadastraHoras(int horas) {
		this.horasEstudo += horas;
	}

	/**
	 * Registra uma nota na disciplina.
	 *
	 * @param nota      um valor inteiro que representa a posição da nota a ser
	 *                  registrada
	 *                  (1 a 4).
	 * @param valorNota um valor double que representa a nota a ser registrada.
	 */

	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}

	/**
	 * Calcula a média das notas registradas na disciplina.
	 *
	 * @param notas um array de valores double que representa as notas a serem
	 *              calculadas.
	 * @return a média das notas.
	 */

	public double calculaMedia(double notas[]) {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		media = soma / notas.length;
		return media;
	}

	/**
	 * Verifica se o aluno foi aprovado na disciplina através de um teste lógico
	 * usando condição.
	 *
	 * @return true se a média das notas for maior ou igual a 7.0, caso contrário,
	 *         retorna false.
	 */

	public boolean aprovado() {
		media = calculaMedia(notas);
		if (media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Retorna uma representação em string da disciplina, contendo o nome da
	 * disciplina,
	 * o número de horas de estudo, a média das notas e as notas registradas.
	 *
	 * @return uma string que representa a disciplina.
	 */

	public String toString() {
		return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(this.notas);
	}
}
