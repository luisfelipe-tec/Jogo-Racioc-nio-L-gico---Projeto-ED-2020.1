package br.ucsal.estrutuda.dado.game;

public interface Stack<T> {

	/**
	 * Incluir um elemento na pilha (sempre no topo).
	 * 
	 * @param element elemento a ser inserido.
	 */
	void push(T element);

	/**
	 * Retirar o elemento do topo da pilha.
	 * 
	 * @return o elemento do topo da pilha.
	 */
	T pop();

	/**
	 * Observar o elemento do topo da pilha, sem remover.
	 * 
	 * @return o elemento do topo da pilha.
	 */
	T top();

	/**
	 * Retornar se a pilha está vazia.
	 * 
	 * @return true se a pilha estiver vazia e false se pilha tiver algum elemento.
	 */
	boolean isEmpty();

	/**
	 * Retornar a quantidade de elementos na pilha.
	 * 
	 * @return quantidade de elementos presentes na pilha.
	 */
	int size();

	void clear();
}
