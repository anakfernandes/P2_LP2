/**
 * Esta classe faz o gerenciamento dos resumos, de forma que ela salva uma quantidade 
 * limitada de resumos (definida pela classe principal) e seus respectivos temas,
 * o que significa que para cada resumo existe um tema associado a ele, quando o Array
 * de resumos atinge o seu limite, o Array recomeça e os resumos serão substituidos pelos novos
 * 
 * @authora Ana Kethylen Sousa Fernandes
 */

public class RegistroResumos{
	
	/**
	* O Array resumos serve para salvar o conteúdo do resumo que será adicionado
	*/
	
	private String[] resumos;
	
	/**
	* O array temas salva o tema do resumo que será adicionado
	*/
	
	private String[] temas;
	
	/**
	* O limiteResumos funciona para fazer o controle do limite de resumos e de
	* quantos já foram alocados no Array
	*/
		
	private int limiteResumos;
	
	/**
	* O index será usado para saber qual o indíce do array em que estarão os resumos
	*/
	
	private int index;
	
	/**
	* Este contrutor faz o registro do resumo utilizando o tema e o conteúdo do resumo,
	* e inicializa as variáveis de limite que recebe o número de resumos máximo e indíce
	* que começa em zero
	* 
	* @param numeroDeResumos Número máximo de resumos que podem ser armazenados no Array
	*/
    
	public RegistroResumos(int numeroDeResumos) {
		this.resumos = new String[numeroDeResumos];
		this.temas = new String[numeroDeResumos];
		this.limiteResumos = numeroDeResumos;
		this.index = 0;
	}
	
	/**
	 * Adiciona um novo resumo passando o tema e o resumo (conteúdo do resumo) que será
	 * alocado em um dos indices do Array, que inicia no indice 0 e vai até o limite máximo
	 * definido pela classe principal, quando o limite é atingido o indice volta a ser 0.
	 * 
	 * @param tema o tema do resumo
	 * @param resumo o conteúdo do resumo
	 */
	
	public void adiciona(String tema, String resumo) {
		this.temas[index] = tema;
		this.resumos[index] = resumo;
		index++;
		if (index == limiteResumos) {
			index = 0;
		}	
	}
	
	/**
	* pegaResumos irá retornar todos os resumos que foram cadastrados, utilizando
	* a criação de um novo array que retorna a quantidade exata de resumos
	* cadastrados fazendo uso do método de contagem dos resumos
	* 
	* @return retorna o tema e o resumo da seguinte forma: "Tema: Resumo"
	*/
	
	public String[] pegaResumos() {
		String[] saida = new String[conta()]; 
		for(int i = 0; i < conta(); i++) {
			saida[i] = temas[i] + ": " + resumos[i];
		}
		return saida;	
	}
	
	/**
     * imprimeResumos identifica e separa os resumos cadastrados até o momento, utilizando
     * o indice a qual o resumo está alocado, juntamente com o seu tema e o conteúdo
     * e retorna duas strings formatadas, em que a primeira contém a quantidade de resumos cadastrados
     * e a segunda a lista dos temas dos resumos separadas pela seguinte barra "|"
     * 
     * @return String contendo a quantidade de resumos e a lista de temas.
     */
	
	
	public String imprimeResumos() {
		String linha1 = "- " + conta() + " resumo(s) cadastrado(s)\n";
		String linha2 = "- ";
		for(int i = 0; i < conta(); i++) {
			linha2 += temas[i];
			if(i != conta()-1) {
				linha2 += " | ";
			}
		}
		 return linha1 + linha2;
	}
	
	/**
	* O conta utiliza a variável contador,e um laço para que quando o indice
	* seja menor que o limite dos resumos, o indice é incrementado, e se
	* o indice do resumo for nulo, ou seja se o array do resumo estiver vazio o que vem antes
	* dele está preenchido, e será a quantidade de resumos cadastrados
	*  
	* @return retorna o tamanho do array de resumos
	*/

	public int conta() {
		int contador = 0;
		for(int i = 0; i < limiteResumos; i++) {
			if (resumos[i] == null) {
				contador = i;
				break;			
			}
		}
		return contador;	
	}
	
	/**
	* temResumo faz a verificação comparando o tema que o usuario fornece com os temas 
	* que estão cadastrados no array de resumos
	* 
	* @param tema Tema que será verificado
	* @return retorna o valor true caso o tema fornecido esteja no array e
	* false caso contrário.
	*/
	
	public boolean temResumo(String tema) {
		for(int i = 0; i < conta(); i++) {
			if(temas[i].equals(tema)) {
				return true;
			}
		}
		return false;
	}
}