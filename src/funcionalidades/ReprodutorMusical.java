package funcionalidades;

public interface ReprodutorMusical {
    public default void selecionarMusica(String musica){
        System.out.println("Escolhendo a música" + musica);
    };
    public default void tocar(){
        System.out.println("Tocando...");
    };
    public default void pausar(){
        System.out.println("Pausando");
    };
}
