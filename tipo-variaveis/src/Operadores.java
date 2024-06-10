public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        // NEGAÇÃO

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        //RELACIONAIS

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        // OU PODEMOS USAR O OPERADOT TERNARIO
        //String resultado = a == b ? "verdadeiro" : "falso";     

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //LÓGICOS

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
    
}
