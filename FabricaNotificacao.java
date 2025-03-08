public class FabricaNotificacao {
    public static Notificacao criarNotificacao(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacaoEmail();
            case "sms":
                return new NotificacaoSMS();
            case "push":
                return new NotificacaoPush();
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido.");
        }
    }
}