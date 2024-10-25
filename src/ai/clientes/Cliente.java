package ai.clientes;

/**
 *
 * @author Bruno
 */
public class Cliente {

    protected double limite;
    protected double saldoDevedor;
    protected double pagamentoEfetuado;
    
    public boolean verificarLimite(double pagamentoEfetuado) {
        return pagamentoEfetuado <= saldoDevedor;
    }
    
    public void mostrarLimite() {
        System.out.println("Seu limite é " + this.limite);
    }
    
    public void mostrarSaldoDevedor() {
        System.out.println("Seu saldo devedor é " + this.saldoDevedor);
    }
    
    public void efetuarPagamento(double valorPagamento) {
        this.saldoDevedor += valorPagamento; 
        this.limite += valorPagamento;
        System.out.println("Pagamento efetuado " + valorPagamento + " Novo saldo " + this.saldoDevedor);
    }
    
    public void efetuarCompra(double valorCompra) {
        saldoDevedor += valorCompra; 
        limite -= valorCompra;
        System.out.println("Pagamento efetuado! Novo saldo " + this.saldoDevedor);
    }
    
    public double calcularDesconto(double valor) {
        System.out.println("Desconto aplicado");
        return 0;
    }
    
    public void aumentarLimite(double valor) {
        System.out.println("Limite aumentado");
    }
    
}
