package com.example.paginationandsorting.service;


import com.example.paginationandsorting.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    List<Product> findProductsWithSorting(String field);

    Page<Product> findProductsWithPagination(int offset, int pageSize);

    Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);

    List<Product> sortBasedOnSomeField( String field);

    Page<Product> getProductWithPagination(int offset , int pageSize);

    Page<Product>  getProoductWithPaginationAndSorting(int offset, int pageSize, String field);
}
