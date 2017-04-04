package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected float precoDoBilhete;
    protected float saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException("Não encontrou valor correto de papel moeda");
        }
        this.saldo += quantia;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getTroco() {
        return (saldo - precoDoBilhete);
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo <precoDoBilhete) {
            throw new SaldoInsuficienteException("Não possui saldo suficiente");
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
