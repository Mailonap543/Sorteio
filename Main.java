package PACKAGE_NAME;

public class Main {
    public static void main(String[] args) {
        NomeSorteio nomeSorteio = new NomeSorteio();
        String nomeSorteado = nomeSorteio.sortearNome();
        System.out.println("Nome sorteado e: " + nomeSorteado);
    }
}