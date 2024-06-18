import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
         NAO SE SABE QUAL APP
         MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MSG
         */
        String appEscolhido = "msn"; //aqui muda pra msg, facebook ou telegram

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        if (smi != null) {
            smi.enviarMensagem();
            smi.receberMensagem();
        } else {
            System.out.println("Nenhum aplicativo de mensagem foi selecionado.");
        }
    }
}