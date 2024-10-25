package ai.clientes;

/**
 *
 * @author Bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("----------Cliente A----------");
        Cliente clienteA = new Cliente();
        clienteA.mostrarLimite();
        realizarCompra(clienteA, 5000, "CLIENTE A");
        aumentarLimite(clienteA, 5000);
        realizarPagamento(clienteA, 3000);
        clienteA.mostrarLimite();
        System.out.println("-----------------------------\n");

        System.out.println("----------Cliente A - segunda compra\ncompra com desconto");
        realizarCompra(clienteA, 1000, "CLIENTE A");
        clienteA.mostrarLimite();
        clienteA.mostrarSaldoDevedor();
        System.out.println("-----------------------------\n");

        System.out.println("----------Cliente B----------");
        Cliente clienteB = new Cliente();
        clienteB.mostrarLimite();
        realizarCompra(clienteB, 5000, "CLIENTE B");
        realizarPagamento(clienteB, 3000);
        clienteB.mostrarLimite();
        System.out.println("-----------------------------\n");

        System.out.println("----------Cliente B - limite insuficiente");
        clienteB.mostrarLimite();
        clienteB.calcularDesconto(8000);
        realizarCompra(clienteB, 8000, "CLIENTE B");
        System.out.println("-----------------------------\n");

        System.out.println("----------Cliente C----------");
        Cliente clienteC = new Cliente();
        clienteC.mostrarLimite();
        realizarCompra(clienteC, 800, "CLIENTE C");
        realizarPagamento(clienteC, 500);
        clienteC.mostrarLimite();
        System.out.println("-----------------------------\n");

    }

    private static void realizarCompra(Cliente cliente, double valorCompra, String desc) {
        if (cliente.verificarLimite(valorCompra)) {
            double desconto = cliente.calcularDesconto(valorCompra);
            System.out.println(desc + "- compra efetuada com sucesso");
        } else {
            System.out.println(desc + " - saldo insuficiente");
        }
    }

    private static void realizarPagamento(Cliente cliente, double valorCompra) {
        cliente.efetuarCompra(valorCompra);
    }

    private static void aumentarLimite(Cliente cliente, double valorCompra) {
        if (valorCompra >= 5000) {
            cliente.aumentarLimite(valorCompra);
        }
    }
}
