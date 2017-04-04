package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected Float valor;
    protected int quantidade;

    public PapelMoeda(float valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
