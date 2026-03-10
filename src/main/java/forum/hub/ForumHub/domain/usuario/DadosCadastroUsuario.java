package forum.hub.ForumHub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(
        @NotBlank String nome,
        @Email String email,
        @NotBlank
        @Pattern(regexp = "\\d{6}")
        String senha
) {
}
