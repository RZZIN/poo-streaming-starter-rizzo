package br.com.streaming.financeiro;

public class CartaoDeCredito implements IPagamento {
    private String numero;
    private double limite;

    public CartaoDeCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;

    }
    // TODO: Gerar Getters, Setters e toString()
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Conectando com a adquirente...");
        System.out.println("Aprovando transação de R$ " + valor + " no Cartão de Crédito.");
    }

    public String getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }   
    
    }







