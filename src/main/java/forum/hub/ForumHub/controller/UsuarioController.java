package forum.hub.ForumHub.controller;

import forum.hub.ForumHub.domain.usuario.DadosCadastroUsuario;
import forum.hub.ForumHub.domain.usuario.Usuario;
import forum.hub.ForumHub.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastrar")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity cadastrar(@Valid @RequestBody DadosCadastroUsuario dados){

        var senha = passwordEncoder.encode(dados.senha());
        var usuario = new Usuario(dados, senha);

        repository.save(usuario);
        return ResponseEntity.ok().build();
    }
}
