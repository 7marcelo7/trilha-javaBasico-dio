package Ligacoes;

public class Telefone implements AparelhoTelefonico {

    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Ligando Iphone");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Desligando Iphone");
    }

    @Override
    public void iniciarChamada() {
        System.out.println("Chamada realizada");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida");
    }
    
}
