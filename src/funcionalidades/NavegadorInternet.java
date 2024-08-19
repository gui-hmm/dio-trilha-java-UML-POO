package funcionalidades;

public interface NavegadorInternet {
    public default void exibirPagina(String url){
        System.out.println("exibindo página" + url);
    };
    public default void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };
    public default void atualizarPagina(){
        System.out.println("Atualizando página");
    };
}
