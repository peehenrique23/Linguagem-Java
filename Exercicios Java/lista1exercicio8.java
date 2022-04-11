import java.util.Calendar;
import java.util.Scanner;

public class lista1exercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        Calendar c = Calendar.getInstance();
        int anoatual = c.get(Calendar.YEAR);
        int anodenascimento;
        int idade;

        System.out.println("Digite o ano de nascimento: ");
        anodenascimento = input.nextInt();

        idade = (anoatual - anodenascimento);

        System.out.printf("Vc tem: \"%d\"  ", idade);

        if(idade >= 18)
            System.out.println("Você pode votar");
        else
            System.out.println("Você não pode votar");
    }
}
