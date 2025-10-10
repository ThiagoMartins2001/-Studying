public class funcoesParaString {
    public static void main(String[] args) {
         String original = "abcde FGHIJ ABC abc DEFG   "; 

        String s01 = original.toLowerCase(); //converte todas as letras em minusculas
        String s02 = original.toUpperCase(); //converte todas as letras em maiusculas
        String s03 = original.trim(); //remove os espaços nos cantos da String
        String s04 = original.substring(2); //selecionar de qual posição a string será exibida (exemplo: abcd -> cd se a posição for declarada a partir de 2)
        String s05 = original.substring(2, 9); //executa a mesma função do substring(inicio), porém também consegue cortar os caracteres que apareceram no final.
        String s06 =original.replace('a', 'x'); // server para trocar o caracter da string, no exemplo, substituimos todos os "a" minusculos por "x". (sempre que selecionado uma letra especifica, é trocada todas as letras da string marcada.)
        String s07 =original.replace("abc", "xy"); //também serve para fazer substituição de string
        int i = original.indexOf("bc"); // mostra a primeira ocorrência da string solicitada
        int j = original.lastIndexOf("bc"); // mostra a ultima ocorrência da string solicitada

         System.out.println(original);
         System.out.println(s01);
         System.out.println(s02);
         System.out.println(s03);
         System.out.println(s04);
         System.out.println(s05);
         System.out.println(s06);
         System.out.println(s07);
         System.out.println(i);
         System.out.println(j);
         System.out.println("=============================================================");

         String s = "patato apple lemon orange";
         String[] vect = s.split(" "); // função "split", é uma função que server para recortar a string.

         System.out.println(vect[0]);
         System.out.println(vect[1]);
         System.out.println(vect[2]);
         System.out.println(vect[3]);


         
    }
}
