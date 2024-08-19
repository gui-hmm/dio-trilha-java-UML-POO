package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Caixa postal");
    };

    public void exibirPagina(String url){
        System.out.println("exibindo página: " + url);
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    };

    public void selecionarMusica(String musica){
        System.out.println("Escolhendo a música: " + musica);
    };
    public void tocar(){
        System.out.println("Tocando");
    };
    public void pausar(){
        System.out.println("Pausando");
    };
}