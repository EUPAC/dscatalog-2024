package com.sisger.DSCatalog24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisger.DSCatalog24.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long >{

}
