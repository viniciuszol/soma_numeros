import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) 
            soma += numero;
        return soma;
    }

    public int encontrarMaiorValor() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    
    public int encontrarMenorValor() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        }
        else {
            System.out.println("Sua lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();

        //adicionando numeros para a lista
        sn.adicionarNumero(5);
        sn.adicionarNumero(9);
        sn.adicionarNumero(12);
        sn.adicionarNumero(4);
        sn.adicionarNumero(15);


        //exibindo numeros adicionados
        System.out.println("Os números adicionados foram: " );
        sn.exibirNumeros();

        //encontrando o maior e o menor valor
        System.out.println("O maior valor dos números adicionados é: " + sn.encontrarMaiorValor());
        System.out.println("O menor valor dos números adicionados é: " + sn.encontrarMenorValor());

        //somando os numeros
       System.out.println("A soma dos números é: " + sn.calcularSoma()); 

    }
    
}
