package com.dmcsystemsp.aula.muitos.nton.services;

import com.dmcsystemsp.aula.muitos.nton.dto.CategoryDTO;
import com.dmcsystemsp.aula.muitos.nton.dto.ProductDTO;
import com.dmcsystemsp.aula.muitos.nton.entities.Category;
import com.dmcsystemsp.aula.muitos.nton.entities.Product;
import com.dmcsystemsp.aula.muitos.nton.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO insert(ProductDTO dto){

        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        for(CategoryDTO catDTO : dto.getCategories()){
            Category cat = new Category();
            cat.setId(catDTO.getId());
            entity.getCategories().add(cat);
        }

        entity = repository.save(entity);
        return new ProductDTO(entity);

    }

}
