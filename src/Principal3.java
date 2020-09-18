import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Principal2 principal = new Principal2();

        System.out.println("Bem vindo ao sistema de TodoList");

        principal.imprimeMenu();

/*criamos esse bolean para podermos fazer com que o codigo flua com mais facilidade assim com o while podendo criar quantas categorias quizermos
* */
        boolean continua = true;
        while (continua) {
            String valorDecisao = principal.decisaoUsuario();

            if (valorDecisao.equals("1")) {

                System.out.println("Digite o nome da categoria sem espaços ");
                Scanner scanNomeCategoria = new Scanner(System.in);
                String nomeCategoria = scanNomeCategoria.next();

                List<String> categoria = new ArrayList<String>();
                categoria.add(nomeCategoria);

                for (String nome : categoria) {
                    System.out.println(nome);
                }

                principal.imprimeMenu();

                valorDecisao = principal.decisaoUsuario();
            }
        }


    }

    /*    metodos */
    public void imprimeMenu() {

        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Adicionar categoria ");
        System.out.println("2) Listar todas as categorias");
    }

    public String decisaoUsuario() {
        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();
        return valorDecisao;
    }
}
