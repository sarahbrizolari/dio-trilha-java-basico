import java.util.Random;
public class CaseQuatroEntrandoContato {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas ++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSGUIMOS CONTATO COM " + candidato + " NA "  + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
