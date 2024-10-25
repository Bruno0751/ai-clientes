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
public class ClienteB extends Cliente {
    
    private double desconto;
    private int qtdDesconto;

    public ClienteB() {
        this.desconto = 0.05;
        limite = 5000;
    }
    
    
    @Override
    public double calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        if (this.qtdDesconto > 0) {
            descontoAplicado = valorCompra * this.desconto;
            System.out.println("Cliente B desconto Aplicado " + descontoAplicado);
        }
        return descontoAplicado;
    }
    
    @Override
    public void efetuarPagamento(double valorCompra) {
        saldoDevedor -= valorPagamento; 
        limite += valorPagamento;
        System.out.println("Cliente B - Pagamento efetuado " + valorPagamento + " Novo saldo devedor " + saldoDevedor);
        if (valorCompra >= 2000) {
            System.out.println("Cliente B - quantidade de descontos aplicados " + this.qtdDesconto);
        }
    }
}
