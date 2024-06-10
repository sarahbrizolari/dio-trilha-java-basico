public class Usuario {
    public static void main(String[] args) throws Exception {
        
        //o SmartTv é tipo uma variavel, mas é nossa classe e cria uma nova (new) SmartTv
        SmartTv smartTv = new SmartTv(); 

        //Apertando várias vezes em diminuir e aumentar volume da TV

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);
        

        //previa do estado da Tv
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desigar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

    }
}
