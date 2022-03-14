import java.util.Scanner;

public class Distribuidora {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome, tipo;
        double preco, valorTotalPerecivel=0, valorTotalNaoPerecivel=0;
        int diasParaVencer, quantidadeDeProdutos;

        Pereciveis pereciveis[] = new Pereciveis[5];
        naoPereciveis naoPereciveis[] = new naoPereciveis[5];

        for(int i=0;i<5;i++){
            System.out.println("nome perecivel");
            nome = scan.next();
            System.out.println("preco perecivel");
            preco = scan.nextDouble();
            System.out.println("dias para vencer perecivel");
            diasParaVencer = scan.nextInt();

            pereciveis[i] = new Pereciveis(nome, preco, diasParaVencer);
            System.out.println("produto perecivel criado");

            System.out.println("digite a quantidade do produto");
            quantidadeDeProdutos = scan.nextInt();

            valorTotalPerecivel += pereciveis[i].calcular(quantidadeDeProdutos);
            
            System.out.println("nome nao perecivel");
            nome = scan.next();
            System.out.println("preco nao percecivel");
            preco = scan.nextDouble();
            System.out.println("tipo nao perecivel");
            tipo = scan.next();

            naoPereciveis[i] = new naoPereciveis(nome, preco, tipo);
            System.out.println("produto nao perecivel criado");

            System.out.println("digite a quantidade do produto");
            quantidadeDeProdutos = scan.nextInt();

            valorTotalNaoPerecivel += pereciveis[i].calcular(quantidadeDeProdutos);
        }
    }
}
