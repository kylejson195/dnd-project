package org.launchcode.dndproject.data;


import org.launchcode.dndproject.models.Adventurer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdventurerRepository extends CrudRepository<Adventurer, Integer> {
}
