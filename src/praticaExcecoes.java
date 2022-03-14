public class praticaExcecoes {
    private int a = 0;
    private int b = 300;

    try {
        if(a == 0){
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        }
        System.out.println(b/a);
    } catch (IllegalArgumentException e) {
        System.out.println("Não pode ser dividido por zero.");
    } finally {
        System.out.println("Programa finalizado");
    }
}
