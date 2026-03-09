package forum.hub.ForumHub.domain.topico;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(
        @Id Long id,
        @NotBlank String titulo,
        @NotBlank String mensagem
) {
}
