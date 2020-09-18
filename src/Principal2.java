import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Principal2 principal = new Principal2();

        System.out.println("Bem vindo ao sistema de TodoList");

        /* com esse chamado de metodo o codigo fica muito mais limpo do que antes fazendo assimn com que se torne mais facil de se programar*/
        principal.imprimeMenu();

        /*como a linha de codigo é a mesma so utilizar o metodo criando*/
//        System.out.println("Digite o numero do que deseja fazer");
//
//        System.out.println("1) Adicionar categoria ");
//        System.out.println("2) Listar todas as categorias");


        /*como criamos um metodo com o nome de decisaoUsuario só iremos fazer a chamada dele pra entrar no sistema*/

//        Scanner decisaoUsuario = new Scanner(System.in);
//
//        String valorDecisao = decisaoUsuario.next();

//      System.out.println("Decisão do usuario " + valorDecisao);   pra conferir qual opção o usuario escolheu

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
           //  valorDecisao = decisaoUsuario.next();                       //so reutilizamos a variavel usada anteiormente
        /*como criamos um metodo para simprificarmos o codigo precisamos chamar ele agora*/

            valorDecisao = principal.decisaoUsuario();
        }
    }

    /*    metodos */
    public void imprimeMenu() {

        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Adicionar categoria ");
        System.out.println("2) Listar todas as categorias");
    }

    // sistema que usa VOID é porque nao precisa retornar nada
// Sistema String ele da um retorno
    public String decisaoUsuario() {
        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();
        return valorDecisao;
    }
}
