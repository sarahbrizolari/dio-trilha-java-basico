public class SmartTv{
    //Três características a níveis da classe
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criando os metodos que manipulam os estados

    //Mudando o Canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    //Aumentar e Diminuir o volume da TV

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
        
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }


    //Ligando e desligando a TV
    public void ligar(){
        ligada = true;
    }

    public void desigar(){
        ligada = false;
    }

}