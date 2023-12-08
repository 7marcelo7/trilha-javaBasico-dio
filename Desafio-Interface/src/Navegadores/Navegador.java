package Navegadores;

public class Navegador implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void historicoNavegacao() {
        System.out.println("Aqui esta seu historico de navegação");
    }
    
}
