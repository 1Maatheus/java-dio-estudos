public class operadores {
    public static void main(String[] args) throws Exception {
       
        //Operadores aritméticos: São os operadores matemáticos que já conhecemos e usamos no dia a dia.

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 90;
        int multplicacao = 20 * 7;
        int divisao = 14 / 2;
        int modulo = 20 % 2;
        double resultado = (10 * 9) + (20 / 4);

        //O operador de soma pode gerar problemas caso uma operação de soma com strings aconteça, pois ele não irá realizar a soma e sim, uma concatenação dos valores atribuídos.

        // ----------------------------------------------------------------------------

        //Operadores unários: são operadores que são aplicados com outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numériocs e booleanos.

        int numero = 5;
        numero++;
        numero += 10;

        //--------------------------------------------------------------------------------

        //Operador ternário: O operador ternário é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma confição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha. 
        //Exemplo: <expressão condicional> ? <caso condição seja true> : <caso condição seja false>.
        
        int a, b;
        a = 5;
        b = 6;
        String result = "";
        result = a != b ? "Verdadeiro" : "Falso";

        //O resultado esperado é sempre um valor booleano, ou retornará false ou true.

        //-----------------------------------------------------------------------------

        //Operadores relacionais: Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
        
        /* 
         == : verifica se o valor é igual ao outro.
         != : verifica se o valor é diferente do outro.
         > : verifica se o valor é maior que o outro.
         < : verifica se o valor é menor que o outro.
         >= : verifica se o valor é maior ou igual ao outro.
         <= : verifica se o valor é menor ou igual ao outro.
         */

         int num1 = 9;
         int num2 = 10;

         boolean yes = num1 == num2;
         yes = num1 != num2;
         yes = num1 > num2;
         yes = num1 < num2;
         yes = num1 >= num2;
         yes = num1 <= num2;
         
         // Para compararmos uma string ou objetos e afins, usamos um método específico para fazer essa verificação, é o método equals.

         String name1 = "Matheus";
         String name2 = "Matheus";

         //System.out.println(name1.equals(name2));

         //-------------------------------------------------------------------------------

         //Operadores lógicos: Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
         /*
            &&: Operador lógico "E", retorna true se todas as expressões forem true.
            ||: Operador lógco "OU", retorna true, se pelo menos uma expressão for true.
         */

         boolean condition1 = true;
         boolean condition2 = true;

         if(condition1 && condition2) {
            System.out.println("As duas condições são verdadeiras");
         }else {
            System.out.println("As condições não são verdadeiras");
         }

         if(condition1 || condition2) {
            System.out.println("Uma das condições é verdadeira");
         }else {
            System.out.println("As condições não são verdadeiras");
         }

    }
}
