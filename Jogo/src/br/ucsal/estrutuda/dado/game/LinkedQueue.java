package br.ucsal.estrutuda.dado.game;

/**
 * Implementa��o da fila utilizando lista ligada como estrutura para
 * armazenamento dos dados da fila.
 * 
 *
 */
public class LinkedQueue<T> implements Queue<T> {

	private No first;
	private No last;
	private Integer size = 0;
	private Integer[] limit = new Integer[20];

	@Override
	public Boolean add(T element) {
		if (isFull()) {
			throw new RuntimeException("Queue full.");
		}
		No novo = new No();
		novo.setInf(element);
		if (isEmpty()) {
			first = novo;
		} else {
			last.setNext(novo);
		}
		last = novo;
		size++;
		return true;
	}

	@Override
	public T remove() {
		if (!isEmpty()) {
			T aux = first.getInf();
			first = first.getNext();
			size--;
			return aux;
		} else {
			throw new RuntimeException("Queue empty.");
		}

	}

	@Override
	public T element() {
		if (!isEmpty()) {
			return (T) first.getInf();
		} else {
			throw new RuntimeException("Queue empty.");
		}

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	private boolean isFull() {
		return size == limit.length;
	}

	@Override
	public int size() {
		return this.size;
	}

	public class No {
		private T inf;
		private No next;

		public No() {
		}

		public No(T inf, No next) {
			this.inf = inf;
			this.next = next;
		}

		public T getInf() {
			return inf;
		}

		public void setInf(T inf) {
			this.inf = inf;
		}

		public No getNext() {
			return next;
		}

		public void setNext(No next) {
			this.next = next;
		}

	}
}
