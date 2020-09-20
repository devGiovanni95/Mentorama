import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        //    Principal4 principal = new Principal4();   -------faremos o cancelamento dessa chamadan pois movemos os metodos para outro arquivo java
        /*   chamando a outra classe para esta   */
        Menu menu = new Menu();

        System.out.println("Bem vindo ao sistema de TodoList");

        List<String> categoria = new ArrayList<String>();

        /*criamos esse bolean para podermos fazer com que o codigo flua com mais facilidade assim com o while podendo criar quantas categorias quizermos
         * */
        boolean continua = true;
        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();/*foi retirada de cima de categoria.add pois ela esta morrendo apos ser utilizada*/

            if (valorDecisao.equals("1")) {

                System.out.println("Digite o nome da categoria sem espaços ");
                Scanner scanNomeCategoria = new Scanner(System.in);
                String nomeCategoria = scanNomeCategoria.next();

                categoria.add(nomeCategoria);

                for (String nome: categoria) {
                    System.out.println(nome);
                }

              /*  menu.imprimeMenu();

                valorDecisao = menu.decisaoUsuario();*/
            }
        }


    }

}
