import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal6 {
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

                case "0": {
                    System.exit(0);
                }
                default:{
                    System.out.println("Opção invalida!!");
                    break;
                }
            }
        }
    }
}
