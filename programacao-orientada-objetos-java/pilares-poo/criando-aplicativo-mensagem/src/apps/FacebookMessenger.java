package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FACEBOOK");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FACEBOOK");
    }
}