public class ExemploForEach {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //o dois pontos diz que a acada iteração de aluno, o aluno do indice atual vai att automaticamente a variavél
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
