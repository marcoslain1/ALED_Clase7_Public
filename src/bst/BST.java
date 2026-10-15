package bst;

public class BST {
	
	Nodo raiz;
	
	//guardar
	public void guardar(int valor) {
		if(raiz == null) {
			raiz = new Nodo(valor);
			return;
		}
		
		Nodo actual = raiz;
		
		while (actual != null) {
			if (valor == actual.valor) {
				return;
			} else if (valor < actual.valor) {
				// Se que está hacia la izquierda
				if (actual.izquierda == null) {
					actual.izquierda = new Nodo(valor);
					return;
				}
				actual = actual.izquierda;
			} else {
				// Se que está hacia la derecha
				if (actual.derecha == null) {
					actual.derecha = new Nodo(valor);
					return;
				}
				actual = actual.derecha;
			}
		}
	}
	
	//contains
	
	public boolean contains(int valor) {
		if(raiz == null) {
			return false;
		}
		
		Nodo actual = raiz;
		
		while (actual != null) {
			if (valor == actual.valor) {
				return true;
			} else if (valor < actual.valor) {
				// Si está, entonces estára hacia la izquierda
				if (actual.izquierda == null) {
					return false;
				}
				actual = actual.izquierda;
			} else {
				// Se que está hacia la derecha
				if (actual.derecha == null) {
					return false;
				}
				actual = actual.derecha;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		BST tree = new BST();
		tree.guardar(7);
		tree.guardar(4);
		tree.guardar(9);
		tree.guardar(1);
		tree.guardar(5);
		tree.guardar(8);
		tree.guardar(15);
		
		System.out.println(tree.contains(100));
		
	}
	
}
