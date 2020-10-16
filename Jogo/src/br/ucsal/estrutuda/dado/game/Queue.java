package br.ucsal.estrutuda.dado.game;

/**
 * 
 * Especifica um fila, com o seguinte comportamento:
 * 
 * 1. Insere no final e remove do começo;
 * 
 * 2. O primeiro a ser colocado na fila será o primeiro a sair da mesma. FIFO
 * (First In First Out).
 * 
 *
 * @param <T> tipo de dado que pode ser manipulado pela fila.
 */
public interface Queue<T> {

	/**
	 * Adiciona um elemento no final da fila.
	 * 
	 * @param element o elemento a ser adicionado.
	 * @return true se foi possível adicionar o elemento. Se a fila estiver cheia,
	 *         lança exceção.
	 */
	Boolean add(T element);

	/**
	 * Remove o elemento do começo da fila.
	 * 
	 * @return o elemento do começo da fila. Se a fila estiver vazia, lança exceção.
	 */
	T remove();

	/**
	 * Retorna o elemento do começo da fila, sem remover o mesmo.
	 * 
	 * @return o elemento do começo da fila. Se a fila estiver vazia, lança exceção.
	 */
	T element();
	
	/**
	 * Retornar se a fila está vazia.
	 * 
	 * @return true se a fila estiver vazia e false se fila tiver algum elemento.
	 */
	boolean isEmpty();

	/**
	 * Retornar a quantidade de elementos na fila.
	 * 
	 * @return quantidade de elementos presentes na fila.
	 */
	int size();

}
