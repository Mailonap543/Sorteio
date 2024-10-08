package PACKAGE_NAME;

import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class NomeSorteio {
    private List<String> nomes;


    public NomeSorteio() {
        this.nomes = Arrays.asList("Ingrid", "Bruno", "Jhon", "Marco", "Sami", "Gabriel", "Mailon");
    }


    public String sortearNome() {
        Random random = new Random();
        int index = random.nextInt(nomes.size());
        return nomes.get(index);
    }
}