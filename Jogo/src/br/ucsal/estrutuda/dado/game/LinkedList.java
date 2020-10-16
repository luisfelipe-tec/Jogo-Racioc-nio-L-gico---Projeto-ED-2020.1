package br.ucsal.estrutuda.dado.game;

public class LinkedList<T> implements List<T> {

	private No inicio;

	public LinkedList() {
		this.inicio = null;
	}

	@Override
	public boolean isEmpty() {
		return (this.inicio == null);
	}

	@Override
	public void add(T element) {
		No novo = new No(element);
		if (inicio == null) {
			inicio = novo;
		} else {
			No aux = inicio;
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = novo;
		}
	}

	@Override
	public void display() {
		No aux;
		aux = inicio;
		while (aux != null) {
			System.out.println(aux.getElement());
			aux = aux.getNext();

		}

	}

	@Override
	public String toString() {
		No aux;
		aux = inicio;
		String lista = "";
		int i = 1;
		while (aux != null) {
			lista = lista.substring(0, lista.length()) + i + "- " + aux.getElement() + "\n";
			aux = aux.getNext();
			i++;
		}
		return lista;
	}

	@Override
	public void clear() {
		this.inicio = null;
		
	}

	public class No {
		private T element;
		private No next;

		public No() {
		}

		public No(T element) {
			this.element = element;
		}

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public No getNext() {
			return next;
		}

		public void setInicio(No next) {
			this.next = next;
		}

	}

}