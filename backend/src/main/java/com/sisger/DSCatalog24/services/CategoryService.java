package com.sisger.DSCatalog24.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sisger.DSCatalog24.dto.CategoryDTO;
import com.sisger.DSCatalog24.entities.Category;
import com.sisger.DSCatalog24.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; 
	
	@Transactional(readOnly = true)  
	public List<CategoryDTO> findAll (){ 
		List<Category> list = repository.findAll(); 
		
		return list.stream().map(x->new CategoryDTO(x)).collect(Collectors.toList());
 	
	}

}
