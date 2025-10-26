public class ListaEncadeada {
    private static class No {
        int valor;
        No prox;
        No(int v) { valor = v; }
    }

    private No inicio;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.prox != null) atual = atual.prox;
            atual.prox = novo;
        }
    }

    public void remover(int valor) {
        if (inicio == null) return;
        if (inicio.valor == valor) {
            inicio = inicio.prox;
            return;
        }
        No atual = inicio;
        while (atual.prox != null && atual.prox.valor != valor) atual = atual.prox;
        if (atual.prox != null) atual.prox = atual.prox.prox;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.prox;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.exibir(); 
        lista.remover(20);
        lista.exibir(); 
    }
}
