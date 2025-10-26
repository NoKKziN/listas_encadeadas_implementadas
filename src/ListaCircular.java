public class ListaCircular {
    // Nó da lista
    private static class No {
        int valor;
        No prox;
        No(int v) { valor = v; }
    }

    private No inicio;

    // Insere no final
    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
            novo.prox = inicio; // aponta pra si mesmo
        } else {
            No atual = inicio;
            while (atual.prox != inicio) atual = atual.prox; // percorre até o último
            atual.prox = novo;
            novo.prox = inicio; // fecha o ciclo
        }
    }

    // Remove o primeiro nó com o valor informado
    public void remover(int valor) {
        if (inicio == null) return;

        No atual = inicio;
        No anterior = null;

        do {
            if (atual.valor == valor) {
                if (anterior != null) {
                    anterior.prox = atual.prox;
                    if (atual == inicio)
                        inicio = atual.prox; // caso remova o primeiro
                } else {
                    // Caso só exista 1 nó
                    if (inicio.prox == inicio) {
                        inicio = null;
                        return;
                    }
                    // Caso o primeiro seja o removido
                    No ultimo = inicio;
                    while (ultimo.prox != inicio) ultimo = ultimo.prox;
                    ultimo.prox = inicio.prox;
                    inicio = inicio.prox;
                }
                return;
            }
            anterior = atual;
            atual = atual.prox;
        } while (atual != inicio);
    }

    // Exibe todos os elementos da lista
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        No atual = inicio;
        System.out.print("Lista circular: ");
        do {
            System.out.print(atual.valor + " -> ");
            atual = atual.prox;
        } while (atual != inicio);
        System.out.println("(volta para o início)");
    }

    // Teste de exec
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.exibir(); // 10 -> 20 -> 30 -> (volta para o início)
        lista.remover(10);
        lista.exibir(); // 20 -> 30 -> (volta para o início)
    }
}
