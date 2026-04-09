package projetos.aula06;
public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
       this.volume = 50;
       this.ligado = false;
       this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("-----  MENU -----  ");
        System.out.printf("Está ligado? %b\n", this.getLigado());
        System.out.printf("Está tocando? %b\n", this.getTocando());
        System.out.printf("Volume: %d", this.getVolume());
        for (int barraVertical = 0; barraVertical <= this.getVolume(); barraVertical+=10 ) { //cada risquinho | representa 10 unidades de volume  
            System.out.print("|");                                                          //barra vertical (barra de volume visual no console)
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {  // só aumenta o volume se a tv estiver ligada
            this.setVolume(this.getVolume()+5); //aumentar o volume de 5 em 5
        } else {
            System.out.println("\nImpossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) { // só diminui o volume se a tv estiver ligada
            this.setVolume(this.getVolume()-5); // diminuir o volume de 5 em 5
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) { //ele só vai botar no mudo se a tv estiver ligada e se nao estiver mudo
            this.setVolume(0); // se eu botar no modo mudo ele vai para 0
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) { // ele só vai tirar do mudo se a tv estiver ligada e se estiver no mudo (0)
            this.setVolume(50); // se eu tirar do mudo e volta a 50
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) { //se estiver ligada e nao tocando (aperte o play)
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) { // se estiver ligada e tocando (aperte o pause)
            this.setTocando(false);
        }
    }
    
}
