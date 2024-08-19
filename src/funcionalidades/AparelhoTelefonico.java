package funcionalidades;

public interface AparelhoTelefonico {
    public default void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
    };
    public default void atender(){
        System.out.println("Atendendo");
    };
    public default void iniciarCorreioVoz(){
        System.out.println("Caixa postal");
    };
}
