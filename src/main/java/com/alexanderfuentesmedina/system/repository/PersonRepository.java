package com.alexanderfuentesmedina.system.repository;

import com.alexanderfuentesmedina.system.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  @Query("SELECT P FROM Person P")
  List<Person> list();
  Person findPersonById(int id);
  void delete(Person p);
}
