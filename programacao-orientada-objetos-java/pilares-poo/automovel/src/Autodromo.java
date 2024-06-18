public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("899897");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("58894");
        z400.ligar();
    }
}
