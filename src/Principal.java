import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de TodoList");

        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Adicionar categoria ");
        System.out.println("2) Listar todas as categorias");

        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();

//      System.out.println("Decisão do usuario " + valorDecisao);   pra conferir qual opção o usuario escolheu

        if (valorDecisao.equals("1")) {

            System.out.println("Digite o nome da categoria sem espaços ");
            Scanner scanNomeCategoria = new Scanner(System.in);
            String nomeCategoria = scanNomeCategoria.next();

            List<String> categoria = new ArrayList<String>();
            categoria.add(nomeCategoria);

            for(String nome : categoria) {
                System.out.println(nome);
            }

//            System.out.println("Categoria digitada "+
            System.out.println("Digite o numero do que deseja fazer");

            System.out.println("1) Adicionar categoria ");
            System.out.println("2) Listar todas as categorias");

            // String valorDecisao = decisaoUsuario.next();                 ou criamos uma nova com novo nome
            valorDecisao = decisaoUsuario.next();                       //so reutilizamos a variavel usada anteiormente

        }
    }
}
