package forum.hub.ForumHub.domain.topico;

import java.time.LocalDate;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDate dataCriacao
) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
    }
}
