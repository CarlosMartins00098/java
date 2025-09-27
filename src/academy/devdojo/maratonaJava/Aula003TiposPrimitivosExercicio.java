package academy.devdojo.maratonaJava;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima seguinte mensagem:

Eu <name>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula003TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Carlos";
        String endereco = "Rua 123456";
        int data = 27092025;
        double sal = 2000.00;

        System.out.println("Eu "+name+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+sal+", na data "+data);

    }
}
