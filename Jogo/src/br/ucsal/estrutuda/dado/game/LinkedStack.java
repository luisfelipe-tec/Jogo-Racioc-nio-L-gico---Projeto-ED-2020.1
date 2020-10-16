package br.ucsal.estrutuda.dado.game;

public class LinkedStack<T> implements Stack<T> {

	private No top;
	private int size = 0;

	@Override
	public void push(T element) {
		No novo = new No(element);
		if(isEmpty()) {
			top = novo;
		}else {
			No aux = top;
			top = novo;
			top.prox = aux;
		}
		size++;

	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty."); 
		}
		T element = top.element;
		top = top.prox;
		size--;
		return element;
	}

	@Override
	public T top() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty."); 
		}
		return top.element;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		top = null;
		size = 0;
	}

	private class No {

		private T element;
		private No prox;

		
		private No(T element) {
			this.element = element;
		}

	}

}
