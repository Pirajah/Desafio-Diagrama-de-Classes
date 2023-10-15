package src.Equipamento.Musica;

public class Ipod implements ReproduzirMusica {
    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void next() {
        System.out.println("Selecionar musica");
    }
}
