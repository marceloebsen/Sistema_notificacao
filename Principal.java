import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        int escolha = scanner.nextInt();
        String tipoNotificacao = "";

        switch (escolha) {
            case 1:
                tipoNotificacao = "email";
                break;
            case 2:
                tipoNotificacao = "sms";
                break;
            case 3:
                tipoNotificacao = "push";
                break;
            default:
                System.out.println("Opção inválida. Tente de novo!");
                scanner.close();
                return;
        }

        System.out.print("Digite a mensagem a ser enviada: ");
        scanner.nextLine();
        String mensagem = scanner.nextLine();

        Notificacao notificacao = FabricaNotificacao.criarNotificacao(tipoNotificacao);
        notificacao.enviar(mensagem);

        scanner.close();
    }
}