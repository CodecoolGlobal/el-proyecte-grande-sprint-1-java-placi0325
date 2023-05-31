package com.codecool.elproyectegrande.dao.product;

import com.codecool.elproyectegrande.controller.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    void addNewProduct();
    List<ProductDTO> getAllProducts();
    
}
