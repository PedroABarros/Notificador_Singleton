package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificadorTest {

    @Test
    public void deveEnviarNotificacaoParaUsuarioEspecifico() {
        Notificador notificador = Notificador.getInstance();
        String mensagem = "Bem-vindo!";
        String destinatario = "Pedro Barros";
        assertDoesNotThrow(() -> notificador.enviarNotificacao(mensagem, destinatario));
    }

    @Test
    public void deveNotificarTodosOsUsuarios() {
        Notificador notificador = Notificador.getInstance();
        String mensagem = "Aviso geral!";
        assertDoesNotThrow(() -> notificador.notificarTodos(mensagem));
    }
}