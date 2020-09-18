import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
       Principal1 principal = new Principal1();

        System.out.println("Bem vindo ao sistema de TodoList");

/* com esse chamado de metodo o codigo fica muito mais limpo do que antes fazendo assimn com que se torne mais facil de se programar*/
        principal.imprimeMenu();

/*como a linha de codigo é a mesma so utilizar o metodo criando*/
//        System.out.println("Digite o numero do que deseja fazer");
//
//        System.out.println("1) Adicionar categoria ");
//        System.out.println("2) Listar todas as categorias");

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
              //  imprimeMenu();  //como e um metodo statico ele nao reconhe a função de chamar metodo

            principal.imprimeMenu();

//            System.out.println("Categoria digitada "+

            /*como o trecho do codigo é o mesmo se cria um metodo para deixar o codigo mais organizado e limpo*/
//
//            System.out.println("Digite o numero do que deseja fazer");
//
//            System.out.println("1) Adicionar categoria ");
//            System.out.println("2) Listar todas as categorias");




            // String valorDecisao = decisaoUsuario.next();                 ou criamos uma nova com novo nome
            valorDecisao = decisaoUsuario.next();                       //so reutilizamos a variavel usada anteiormente

        }
    }
/*    metodos */
    public void imprimeMenu() {

        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Adicionar categoria ");
        System.out.println("2) Listar todas as categorias");
    }
}
