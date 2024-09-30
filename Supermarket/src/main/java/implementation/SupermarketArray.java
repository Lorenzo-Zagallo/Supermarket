package implementation;

public class SupermarketArray implements Supermarket{

    private final String [] itens;

    private int ultimoIndice;

    public SupermarketArray(final int tamanho) {
        itens = new String[tamanho];
        ultimoIndice = -1;
    }


    @Override
    public void adicionar(final String item) {
        if (ultimoIndice == itens.length-1) {
            System.err.println("Lista de supermercado cheia");
        } else {
            ultimoIndice++;
            itens[ultimoIndice] = item;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("###########################################");
        if (ultimoIndice < 0) {
            System.out.println("Lista de supermercado vazia");
        }
        for(int i = 0; i <= ultimoIndice; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("###########################################");
    }

    @Override
    public void deletar(final int indice) {
        if (indice >= 0 && indice <= ultimoIndice) {
            shift(indice);
            ultimoIndice--;
        } else {
            System.err.println("Índice inválido: " + indice);
        }
    }

    private void shift(final int index) {
        for(int i = index; i < ultimoIndice; i++) {
            itens[i] = itens[i + 1];
        }
    }
}
