package com.dmcsystemsp.aula.muitos.nton.repositories;

import com.dmcsystemsp.aula.muitos.nton.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
