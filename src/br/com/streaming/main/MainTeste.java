package br.com.streaming.main;

import br.com.streaming.financeiro.CartaoDeCredito;
import br.com.streaming.financeiro.PagamentoBoleto;
import br.com.streaming.financeiro.PagamentoPix;
import br.com.streaming.financeiro.ProcessadorPagamento;
import br.com.streaming.financeiro.IPagamento;
import br.com.streaming.model.Usuario;

// TODO: Fazer imports das classes dos pacotes model e financeiro

public class MainTeste {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE STREAMING ===");
        // TODO: Testes da Aula 2 e 3

    Usuario u1 = new Usuario(null, null);
    u1.setNome("Joao Silva");
    u1.setEmail("joao@email.com");

    Usuario u2 = new Usuario(null, null);
    u2.setNome("rizzo viado");
    u2.setEmail("eurizzinhoviado@gmail.com");

    Usuario u3 = new Usuario(null, null);
    u3.setNome("Maria");
    u3.setEmail("maria@email.com");

    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u3);

    if (u1.equals(u2)) {
          System.out.println("Erro: Usuário já existe!");
    } else {
          System.out.println("Cadastro liberado!");
    }

    System.out.println(Usuario.NOME_PLATAFORMA);
    System.out.println("Total de contas: " + Usuario.contadorUsuarios);

    ProcessadorPagamento processador = new ProcessadorPagamento();

    IPagamento cartao = new CartaoDeCredito(null, 0);
    IPagamento pix = new PagamentoPix();
    IPagamento boleto = new PagamentoBoleto();

    processador.finalizarCompra(cartao, 150.50);
    processador.finalizarCompra(pix, 300.00);
    processador.finalizarCompra(boleto, 50.99);
    }

    


}
