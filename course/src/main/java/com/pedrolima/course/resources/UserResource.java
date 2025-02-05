package com.pedrolima.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pedrolima.course.entities.User;
import com.pedrolima.course.services.UserService;

@RestController //controlador rest do recurso web
@RequestMapping(value = "/users") //nome do recurso
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping //inserir um novo recurso no banco
	public ResponseEntity<User> insert( @RequestBody User obj){ //o requestbody é a conversão do json desserializado
		obj = service.insert(obj);
		// estrturura pra gerar o 201 na resposta
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); //conversão do tipo de dado pro created aceitar
		return  ResponseEntity.created(uri).body(obj);
	}
}
