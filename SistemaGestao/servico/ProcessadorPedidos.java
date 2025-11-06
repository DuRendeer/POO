package servico;

import modelo.Pedido;
import enums.StatusPedido;
import java.util.LinkedList;
import java.util.Queue;

public class ProcessadorPedidos implements Runnable {
    private Queue<Pedido> fila;
    private boolean ativo;

    public ProcessadorPedidos() {
        this.fila = new LinkedList<>();
        this.ativo = true;
    }

    public synchronized void adicionarNaFila(Pedido pedido) {
        pedido.setStatus(StatusPedido.FILA);
        fila.add(pedido);
        System.out.println("Pedido #" + pedido.getId() + " adicionado à fila de processamento");
    }

    @Override
    public void run() {
        while (ativo) {
            Pedido pedido = obterProximoPedido();

            if (pedido != null) {
                processar(pedido);
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private synchronized Pedido obterProximoPedido() {
        return fila.poll();
    }

    private void processar(Pedido pedido) {
        try {
            pedido.setStatus(StatusPedido.PROCESSANDO);
            System.out.println("Processando pedido #" + pedido.getId() + "...");

            Thread.sleep(3000);

            pedido.setStatus(StatusPedido.FINALIZADO);
            System.out.println("Pedido #" + pedido.getId() + " finalizado!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void parar() {
        this.ativo = false;
    }

    public synchronized int tamanhoFila() {
        return fila.size();
    }
}
