package com.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Product;

// menambhakan entitiy class dan parmeer berikutnya tipe primary key nya
public interface ProductRepo extends CrudRepository<Product, Long> {

    // fungsi custom dalam repository kita
    List<Product> findByNameContains(String name);
}
