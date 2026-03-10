package forum.hub.ForumHub.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhesTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Boolean status,
        String autor
) {

    public DadosDetalhesTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor());
    }
}
