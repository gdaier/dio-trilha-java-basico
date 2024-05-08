public class SmarTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void baixarVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void baixarCanal(){
        canal--;
    }
    public void definirCanal(int novoCanal){
        canal = novoCanal;

    }
}
