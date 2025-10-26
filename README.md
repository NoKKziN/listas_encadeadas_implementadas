# 🧩 Estruturas de Dados em Java

## 📖 Descrição Geral
Este projeto apresenta três implementações de **estruturas de dados dinâmicas** desenvolvidas em **Java**, representando os principais tipos de **listas encadeadas**: simples, duplamente encadeada e circular.  
O objetivo é demonstrar o funcionamento interno dessas estruturas, a forma como armazenam dados e como manipulam nós (elementos interligados por referências).

---

## 📂 Conteúdo do Projeto

### 1. Lista Encadeada Simples (`ListaEncadeada.java`)
Esta implementação representa a **forma mais básica de lista**, onde cada nó armazena um valor e uma referência para o próximo elemento.

**Características principais:**
- Armazena dados de forma sequencial.
- Permite inserção e remoção em diferentes posições.
- Utiliza um nó inicial (`inicio`) e percorre a lista até o final.
- Ideal para compreender o conceito fundamental de encadeamento de nós.

**Arquivo:**  
`ListaEncadeada.java` – Contém a definição da estrutura da lista e da classe interna `No`.

---

### 2. Lista Duplamente Encadeada (`ListaDuplamenteEncadeada.java`)
A lista duplamente encadeada expande o conceito da simples, permitindo **navegação nos dois sentidos**: para frente e para trás.

**Características principais:**
- Cada nó contém referências para o **próximo** e o **anterior**.
- Facilita remoções e inserções no meio da lista.
- Estrutura mais flexível para percorrer e modificar dados.
- Mantém referências para o primeiro (`inicio`) e último (`fim`) elementos.

**Arquivo:**  
`ListaDuplamenteEncadeada.java` – Implementa a lógica da lista e da classe `No` com ponteiros duplos.

---

### 3. Lista Encadeada Circular (`ListaCircular.java`)
A lista circular conecta o último elemento de volta ao primeiro, formando um **ciclo contínuo**.  
É utilizada em aplicações que exigem percorrimento infinito ou repetitivo de elementos.

**Características principais:**
- O último nó aponta para o primeiro.
- Evita a presença de nós nulos ao percorrer a estrutura.
- Permite operações de inserção, busca e remoção dentro de um ciclo fechado.
- Mantém controle de um ponteiro inicial (`inicio`) que serve como referência de rotação.

**Arquivo:**  
`ListaCircular.java` – Define a estrutura circular e os métodos de manipulação dos nós.

---

## 🧱 Estrutura Interna dos Nós
Cada lista utiliza uma classe interna chamada `No`, responsável por armazenar:
- O valor do elemento (geralmente um inteiro ou objeto genérico);
- As referências de ligação:
  - `proximo` (para o próximo nó);
  - `anterior` (na lista duplamente encadeada);
  - ligação circular (na lista circular).

Essas referências permitem a manipulação dinâmica dos dados, simulando o comportamento de ponteiros como em linguagens de baixo nível.

---

## 💻 Funcionamento Geral
Os três tipos de lista compartilham operações comuns:
- **Inserção** – adiciona novos elementos no início, meio ou fim;
- **Remoção** – exclui um nó específico da lista;
- **Busca** – localiza um elemento pelo valor armazenado;
- **Listagem** – percorre e exibe todos os elementos.

Cada implementação adapta essas operações conforme sua estrutura (simples, dupla ou circular).

---


## 📚 Resumo
| Estrutura | Característica Principal | Arquivo Fonte |
|------------|--------------------------|----------------|
| Lista Simples | Encadeamento unidirecional | `ListaEncadeada.java` |
| Lista Dupla | Encadeamento bidirecional | `ListaDuplamenteEncadeada.java` |
| Lista Circular | Encadeamento contínuo (cíclico) | `ListaCircular.java` |

---
