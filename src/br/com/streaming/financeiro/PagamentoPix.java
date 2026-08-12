package br.com.streaming.financeiro;

public class PagamentoPix implements IPagamento {
    public void efetuarPagamento(double valor) {
        System.out.println("Gerando chave PIX Copia e Cola...");
        System.out.println("Aguardando transferência de R$ " + valor + ".");
}
}
