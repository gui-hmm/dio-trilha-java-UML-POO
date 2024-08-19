package testando;

import iphone.IPhone;

public class test {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.selecionarMusica("a carta");
        iphone.tocar();
        iphone.pausar();
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.iphone.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
