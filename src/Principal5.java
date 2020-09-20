
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Principal5 {
    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("Bem vindo ao sistema de TodoList");

        List<String> categoria = new ArrayList<String>();

       boolean continua = true;
        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();/*foi retirada de cima de categoria.add pois ela esta morrendo apos ser utilizada*/

            switch (valorDecisao) {
                case "1" : {
                    System.out.println("Digite o nome da categoria sem espaços ");
                    Scanner scanNomeCategoria = new Scanner(System.in);
                    String nomeCategoria = scanNomeCategoria.next();

                    categoria.add(nomeCategoria);
                    break;
                }

                case "2" : {
                            for (String nome: categoria) {
                                    System.out.println("Nome da categoria: " + nome);
                      }
                }
            }

            /* como agora colocamos nossa estrutura no switch nao temos mais o porque de colocar ou usar eeste if*/
//            if (valorDecisao.equals("1")) {

             /* iremos adicionar todo esse campo no case swich para que o codigo possa ser muito mais bem aproveitado*/

//                System.out.println("Digite o nome da categoria sem espaços ");
//                Scanner scanNomeCategoria = new Scanner(System.in);
//                String nomeCategoria = scanNomeCategoria.next();
//
//                categoria.add(nomeCategoria);

 //               for (String nome: categoria) {
 //                   System.out.println(nome);
  //              }
  //          }
        }
    }
}
