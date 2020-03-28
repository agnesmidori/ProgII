public class SequentialList {

	private Object list[];
	private int last = -1;

	public SequentialList(int size) {
		list = new Object[size];
	}

	/* Retorna o elemento na posição especificada. */
	public Object get(int index) {
		if (index < 0 || index > last)
			return null;
		else
			return list[index];
	}

	/*
	 * Retorna true se o elemento foi inserido no final da lista, false caso
	 * contrário.
	 */
	public boolean add(Object o) {
		if (isFull())
			return false;
		last++;
		list[last] = o;
		return true;
	}

	/*
	 * Retorna true se o elemento foi inserido na lista, false caso contrário.
	 * Insere o elemento na posição especificada
	 */
	public boolean add(Object o, int pos) {
		if (isFull())
			return false;
		for (int i = last + 1; i > pos; i--) {
			list[i] = list[i - 1];
		}
		last++;
		list[pos] = o;
		return true;
	}

	/* Remove o elemento na posição especificada */
	public Object remove(int index) {
		if (isEmpty())
			return null;
		else if (index < 0 || index > last) {
			System.out.println("Indice nao existente!");
			return null;
		}
		Object o = list[index];
		int numberofElements = last - index;
		if (numberofElements > 0) {
			System.arraycopy(list, index + 1, list, index, numberofElements);
		}
		list[last] = null; /* to let gc do its work */
		last--;
		return o;
	}

	/* Verifica se a lista está vazia: não tem elementos */
	public boolean isEmpty() {
		if (last == -1)
			return true;
		else
			return false;
	}

	/*
	 * Verifica se a lista está cheia: todas as posições da array interna ocupadas
	 */
	public boolean isFull() {
		if (last == list.length - 1)
			return true;
		else
			return false;
	}

	public int getSize() {
		return last + 1;
	}
	
	/*-----------------------------------------------------------------*/
	
	
	// Questao 1
	public SequentialList merge(SequentialList l) {
		
		SequentialList fusaoListas = new SequentialList((this.getSize()) + (l.getSize()));
		for (int i=0; i<this.getSize(); i++) {
			fusaoListas.add(this.get(i));
		}
		for (int i=0; i<l.getSize(); i++) {
			fusaoListas.add(l.get(i));
		}		
		return fusaoListas;
	}

	// Questao 2
	public void inserePares(int elementos []) {
		for (int i=0; i<elementos.length; i++) {
    		 if (elementos[i] % 2 == 0) {
    			 this.add(elementos[i]);
    		}
    	 }
    }
	
	// Questao 3
	public void insereIneditos(Object elementoInedito) {
		boolean temNaLista = false;
		for (int i=0; i<this.getSize(); i++) {
			if (this.get(i)==(elementoInedito)){
				temNaLista = true;
			}
		}
		if (temNaLista == false ) {
			this.add(elementoInedito);
		}
		else {
			System.out.println ("Elemento ja existe na lista!");
		}	
	}
	
	// Questao 4
	public int retornaPosicao(Integer numero) {
		int posicao= -1;
		for (int i=0; i<this.getSize(); i++) {
			if (this.get(i)==numero) {
				posicao = i;
				break;
			}
		}
		if (posicao == -1){
			System.out.println ("Numero nao encontrado na lista!");
		}	
		return posicao;
	}
	
	// Metodo criado apenas para visualizar os resultados
	public void imprime(SequentialList lista) {
		System.out.print("[");
		for (int i=0; i<lista.getSize(); i++) {
			System.out.print(" " + lista.get(i) + " ");
		}
		System.out.print("]");
	}
	
	/*-----------------------------------------------------------------*/
  
	public static void main(String args[]) {
		SequentialList l = new SequentialList(20);
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");

		SequentialList list1 = new SequentialList(3);
		list1.add("5");
		list1.add("10");
		list1.add("1");
		
		// Metodo Merge Ok!
		System.out.println("\n_____Teste metodo merge______");
		SequentialList listaTeste = new SequentialList(20);
		listaTeste = l.merge(list1);
		list1.imprime(listaTeste);
		System.out.println("\n______________________________");
		
		// Metodo inserePares Ok!
		System.out.println("\n_____Teste metodo inserePares______");
		int [] list2 = {8, 10, 3, 12};
		l.inserePares(list2);
		l.imprime(l);
		System.out.println("\n____________________________________");
		
		// Metodo insereIneditos Ok!
		SequentialList list3 = new SequentialList(10);
		list3.add(1);
		list3.add(2);
		list3.add(3);
		System.out.println("\n_____Teste metodo insereIneditos_____");
		Integer teste1 = 3;
		list3.insereIneditos(teste1);
		list3.imprime(list3);
		System.out.println("\n_____________________________________");
		
		// Metodo retornaPosicao Ok!
		SequentialList list4 = new SequentialList(3);
		list4.add(4);
		list4.add(5);
		list4.add(6);
		Integer teste2 = 6;
		System.out.println("\n_____Teste metodo retornaPosicao______");
		System.out.println(list4.retornaPosicao(teste2));
		System.out.println("________________________________________");
		
		// Metodo Merge Ok!
		System.out.println("\n_____2º Teste metodo merge______");
		SequentialList listaTeste2 = new SequentialList(20);
		listaTeste2 = list3.merge(list4);
		list3.imprime(listaTeste2);
		System.out.println("\n________________________________");
		
	}
}
