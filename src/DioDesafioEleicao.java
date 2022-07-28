import java.util.Scanner;
public class DioDesafioEleicao {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            Integer  habitantes, brancos, nulos , validos;

            habitantes = teclado.nextInt();
            brancos =   teclado.nextInt();
            nulos = teclado.nextInt();
            validos = teclado.nextInt();

            int vBrancos = (brancos * 100)/habitantes;
            int vNulos = (nulos * 100)/habitantes;
            int vValidos = (validos * 100)/habitantes ;

            System.out.println("Brancos: " + vBrancos + "%");
            System.out.println("Nulos: " + vNulos + "%");
            System.out.println("Validos: " + vValidos + "%");
        }
}
