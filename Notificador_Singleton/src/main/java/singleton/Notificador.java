package singleton;

public class Notificador {

    private static Notificador instance = new Notificador();

    private Notificador() {}

    public static Notificador getInstance() {
        return instance;
    }

    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Notificação enviada para " + destinatario + ": " + mensagem);
    }

    public void notificarTodos(String mensagem) {
        System.out.println("Notificando todos os usuários: " + mensagem);
    }
}