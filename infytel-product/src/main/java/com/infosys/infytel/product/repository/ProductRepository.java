package com.infosys.infytel.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.product.entity.product;

public interface ProductRepository extends JpaRepository <product, Integer>{

}
