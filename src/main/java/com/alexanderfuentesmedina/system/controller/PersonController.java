package com.alexanderfuentesmedina.system.controller;

import com.alexanderfuentesmedina.system.entity.Person;
import com.alexanderfuentesmedina.system.service.PersonService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("api/person")
public class PersonController {
private final PersonService service;

  public PersonController(PersonService service) {
    this.service = service;
  }
  @GetMapping
  public List<Person> list(){
    return service.list();
  }
  @PostMapping
  public Person add(@RequestBody Person p){
    return service.add(p);
  }
  @GetMapping(path = {"/{id}"})
  public Person listarId(@PathVariable("id")int id){
    return service.listById(id);
  }
  @PutMapping(path = {"/{id}"})
  public Person editar(@RequestBody Person p,@PathVariable("id") int id){
    p.setId(id);
    return service.edit(p);
  }
  @DeleteMapping(path = {"/{id}"})
  public Person delete(@PathVariable("id") int  id){
    return service.delete(id);
  }
}
