package src.EquipamentoIphone;

import src.Equipamento.Musica.ReproduzirMusica;
import src.Equipamento.Navegador.NavegadorInternet;
import src.Equipamento.Telefone.AparelhoTelefonico;


public class EquipamentoIphone implements ReproduzirMusica, NavegadorInternet, AparelhoTelefonico {
    
    public void play() {
        System.out.println("Reproduzindo musica via equipamento Iphone");
    }

    
    public void pause() {
        System.out.println("Parado na musica via equipamento Iphone");
    }

    
    public void next() {
        System.out.println("Escolhendo musica via equipamento Iphone");
    }


    public void pagina() {
        System.out.println("Abrindo a pagina via equipamento Iphone");
    }

    
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina via equipamento Iphone");
    }

    
    public void atualizaPagina() {
        System.out.println("Atualizando a pagina via equipamento Iphone");
    }

    
    public void ligar() {
        System.out.println("Ligar via equipamento Iphone");
    }

    
    public void atender() {
        System.out.println("Atender via equipamento Iphone");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz via equipamento Iphone");
    }
}
