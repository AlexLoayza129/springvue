package com.rappi.project.repository;
 
import com.rappi.project.entity.Suplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface SuplierRepository extends CrudRepository<Suplier, Long> {
}