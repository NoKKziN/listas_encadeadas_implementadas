public class ListaDuplamenteEncadeada {

    private static class No {
        int valor;
        No ant, prox;
        No(int v) { valor = v; }
    }

    private No inicio, fim;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            novo.ant = fim;
            fim = novo;
        }
    }

    public void remover(int valor) {
        No atual = inicio;

        while (atual != null && atual.valor != valor)
            atual = atual.prox;

        if (atual == null) return; 

        if (atual.ant != null)
            atual.ant.prox = atual.prox;
        else
            inicio = atual.prox; 

        if (atual.prox != null)
            atual.prox.ant = atual.ant;
        else
            fim = atual.ant; 
    }

    public void exibirFrente() {
        No atual = inicio;
        System.out.print("Frente: ");
        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.prox;
        }
        System.out.println("null");
    }

    public void exibirTras() {
        No atual = fim;
        System.out.print("Trás: null <-> ");
        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.ant;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.exibirFrente(); 
        lista.exibirTras();
        lista.remover(20);
        lista.exibirFrente(); 
    }
}