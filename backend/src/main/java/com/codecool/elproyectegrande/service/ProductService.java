package com.codecool.elproyectegrande.service;

import com.codecool.elproyectegrande.controller.dto.NewProductDTO;
import com.codecool.elproyectegrande.controller.dto.ProductDTO;
import com.codecool.elproyectegrande.dao.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    private List<Product> products;

    @Autowired
    public ProductService(List<Product> products) {
        this.products = new ArrayList<>();
    }

    public List<ProductDTO> getAllProducts(){
        return products.stream().map(this::convertProductToDTO).toList();
    }

    public void addNewProduct(NewProductDTO product) {
        products.add(convertDTOtoProduct(product));
    }
    private Product convertDTOtoProduct(NewProductDTO productDTO){
        return new Product(products.size(),productDTO.name(),productDTO.description(),productDTO.userID());
    }
    private ProductDTO convertProductToDTO(Product product){
        return new ProductDTO(product.getId(),product.getName(),product.getDescription(),product.getUserID());
    }
}
