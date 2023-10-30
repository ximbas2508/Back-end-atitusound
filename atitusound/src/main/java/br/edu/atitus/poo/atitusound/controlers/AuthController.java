package br.edu.atitus.poo.atitusound.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitusound.dtos.UserDTO;
import br.edu.atitus.poo.atitusound.entity.UserEntity;
import br.edu.atitus.poo.atitusound.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final UserService service;

	public AuthController(UserService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<UserEntity> PostSignup(@RequestBody UserDTO dto){
		UserEntity entidade = new UserEntity();
		entidade.setEmail(dto.getEmail());
		entidade.setPassword(dto.getPassword());
		entidade.setUsername(dto.getUsername());
		entidade.setName(dto.getName());
		
		try {
			service.save(entidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("Error", e.getMessage()).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(entidade);
		
	}
	
	
	
}
