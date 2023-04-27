/**
 * Esta classe serve para verificarmos se a meta de tempo online esperada para a
 * disciplina
 * foi atingida.
 * 
 * @authora Ana Kethylen Sousa Fernandes
 */

public class RegistroTempoOnline {

	/**
	 * tempoOnlineEsperado é a carga horária usada para a disciplina
	 */

	private int tempoOnline;

	/**
	 * tempoOnlineEsperado define a quantidade de horas esperada para a realização
	 * da disciplina, que é o dobro da carga horária que a disciplina possui,
	 * se a disciplina for de 60 horas, o tempo online esperado é de 120 horas
	 */

	private int tempoOnlineEsperado;

	/**
	 * nomeDaDisciplina define qual é o nome da disciplina
	 */

	private String nomeDisciplina;

	/**
	 * Construtor para criar o registro de tempo online com o nome da disciplina
	 * A meta de tempo online é inicializada com o valor padrão de 120 minutos
	 *
	 * @param nomeDisciplina é o nome da disciplina a ser registrada
	 */

	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}

	/**
	 * Construtor que recebe o nome da disciplina e o tempo online esperado.
	 *
	 * @param nomeDisciplina      o nome da disciplina a ser registrada
	 * @param tempoOnlineEsperado o tempo online esperado para a disciplina
	 */

	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}

	/**
	 * Adiciona o tempo online em minutos ao tempo online atual da disciplina.
	 *
	 * @param tempo O tempo online em minutos a ser adicionado.
	 */

	public void adicionaTempoOnline(int tempo) {
		this.tempoOnline += tempo;
	}

	/**
	 * Verifique através de teste lógico se a meta de tempo online esperada
	 * para a disciplina foi atingida
	 * 
	 * @return true se a meta foi atingida e false caso contrário
	 */

	public boolean atingiuMetaTempoOnline() {
		if (tempoOnline >= tempoOnlineEsperado) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Retorna uma representação de uma string com o nome da disciplina, o tempo
	 * online atual e o tempo online esperado
	 * 
	 * @return uma string com as informações da disciplina
	 */

	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
	}
}
