import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informe uma palavra para criptografar:");

            String nome = scan.next().toLowerCase();
                if (nome.matches("[a-z]*")) {
                    System.out.printf("O password de %s é: \n%s", nome, Cript(nome));
                } else {
                    System.out.println("Informe apenas letras!");
                }
    }

    public static String Cript (String pass) {
        //criar o alfabeto
        char [] alfabeto = new char[26];
        for (int i = 0; i<26;i++){
            alfabeto[i] = (char) ('a' + i);
        }

        //convertendo a string para um array de caracteres
        char [] passWord = pass.toCharArray();


        List<Integer> retorno = new ArrayList<>();

        /*laco duplo que ira verficar cada letra da palavra informada em relacao ao alfabeto
        para comparar o indice da letra do alfabeto com a cada letra da String. E adicionar em um List
        * */
        for (int i = 0; i < passWord.length; i++){
            for (int j = 0; j < 26 ; j ++){
                if (alfabeto[j] == passWord[i]){
                    retorno.add(j+1);
                }
            }
        }

        //convertendo a List de numeros criptografados em uma String
        StringBuilder sb = new StringBuilder();
        for (Integer num : retorno)
            sb.append(num);

        return sb.toString();
    }

}


