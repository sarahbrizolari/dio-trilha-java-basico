public class CaseTresImprimirListaCandidatos {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
}

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de n° " + (indice+1) + " e " + candidatos[indice]);
        }
    }
}
    