/**
 * A classe Descanso verifica se o aluno está cansado ou descansado com base no número de horas de descanso e no número de semanas.
 * 
 * @authora Ana Kethylen Sousa Fernandes
 */
public class Descanso {
	
	/**
	* horasDescanso define as horas de descanso do aluno dentro do período semanal
	*/
	
	private int horasDescanso;
	
	/**
	* numeroSemana define quantidade de semanas sobre o descanso do aluno
	*/ 
	
	private int numeroSemana;
	
	/**
     * Define o número de horas de descanso
     *
     * @param valor um valor inteiro que representa o número de horas de descanso
     */
	
	public void defineHorasDescanso(int valor) {
		this.horasDescanso = valor;
	}
	
    /**
     * Define o número de semanas
     *
     * @param valor um valor inteiro que representa o número de semanas
     */
	     
	public void defineNumeroSemanas(int valor) {
		this.numeroSemana = valor;
	}
	
	/**
     * Obtém o status geral de descanso com base na verificação condicional feita pelo cálculo de divisão
     * do número de horas de descanso pelo número de semanas.
     * Se o aluno descansar menos que 26 horas em 1 semana, significa que este aluno está cansado, caso contrário descansado
     * 
     * @return uma string que representa o status geral de descanso. 
     * Pode ser "cansado" ou "descansado"
     */
	
	public String getStatusGeral() {
		
		if(numeroSemana == 0) {
			return ("cansado");
		}if((horasDescanso / numeroSemana) >= 26) {
			return ("descansado");
		}else {
			return ("cansado");			
		}
	}
}
