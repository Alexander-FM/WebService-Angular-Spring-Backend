package com.alexanderfuentesmedina.system.service;

import com.alexanderfuentesmedina.system.entity.Person;
import com.alexanderfuentesmedina.system.repository.PersonRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {
private final PersonRepository repository;

  public PersonService(PersonRepository repository) {
    this.repository = repository;
  }
  public List<Person> list(){
    return repository.list();
  }
  public Person add(Person p){
    return repository.save(p);
  }
  public Person listById(int id){
    return repository.findPersonById(id);
  }
  public Person edit(Person p){
    return repository.save(p);
  }
  public Person delete(int id){
    Person p = repository.findPersonById(id);
    if(p!=null){
      repository.delete(p);
    }
    return p;
  }
}
