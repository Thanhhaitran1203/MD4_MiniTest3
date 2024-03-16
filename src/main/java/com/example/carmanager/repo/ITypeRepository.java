package com.example.carmanager.repo;

import com.example.carmanager.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeRepository extends CrudRepository<Type,Long> {
    Page<Type> findAll(Pageable pageable);
}
