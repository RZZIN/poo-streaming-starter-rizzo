package br.com.meusistema.main;

// Importando a classe Carro do pacote model
import br.com.meusistema.model.Carro;

public class Sistema {

    public static void main(String[] args) {

        System.out.println("Iniciando o sistema...");

        // Criando o objeto Carro 1
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Golf";
        meuCarro.cor = "Preto";

        // Chamando o método buzinar()
        meuCarro.buzinar();

        // Desafio: Criar um Carro 2, de outro modelo e cor,
        // e fazer ele buzinar também
        Carro carro2 = new Carro();

        carro2.modelo = "Civic";
        carro2.cor = "Vermelho";

        carro2.buzinar();
    }
}