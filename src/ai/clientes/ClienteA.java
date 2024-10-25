/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.clientes;

/**
 *
 * @author Bruno
 */
public class ClienteA extends Cliente {

    private double desconto;
    private double qtdDesconto;

    public ClienteA() {
        this.desconto = 0.1;
        this.qtdDesconto = 0;
        limite = 10000;
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        if (this.qtdDesconto > 0) {
            descontoAplicado = valorCompra * this.desconto;
            System.out.println("Cliente A Desconto aplicado " + descontoAplicado);
        }
        return descontoAplicado;
    }

    @Override
    public void aumentarLimite(double valor) {
        limite += 500;
        System.out.println("Cliente A novo limite " + limite);
    }

    @Override
    public void efetuarPagamento(double valorPagamento) {
        saldoDevedor -= valorPagamento;
        limite += valorPagamento;
        System.out.println("Cliente A - Pagamento efetuado " + valorPagamento + " Novo saldo " + saldoDevedor);
    }
    
    @Override
    public void efetuarCompra(double valorCompra) {
        saldoDevedor += valorCompra;
        limite -= valorCompra;
        System.out.println("Cliente A -Compra efetuada! Novo saldo " + saldoDevedor);
    }

}
