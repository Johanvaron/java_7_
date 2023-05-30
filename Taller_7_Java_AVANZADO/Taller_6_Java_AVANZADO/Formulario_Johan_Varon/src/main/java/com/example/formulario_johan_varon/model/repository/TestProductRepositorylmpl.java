package com.example.formulario_johan_varon.model.repository;

import com.example.formulario_johan_varon.model.beans.Product;

import java.sql.SQLException;

public class TestProductRepositorylmpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository = (Repository<Product>) new TestProductRepositorylmpl();

        System.out.println("========== saveObj Insert =========="); // insert
        Product productInsert = new Product();
        productInsert.setProduct_name("Queso");
        productInsert.setProduct_value(113212);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("Arroz");
        productInsert.setProduct_value(12000);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj =========="); //update
        Product productUpdate = new Product();
        productUpdate.setProduct_id(1);
        productUpdate.setProduct_name("Mandarina");
        productUpdate.setProduct_value(125456);
        productUpdate.setCategory_id(1);
        repository.saveObj(productUpdate);
        repository.listAllObj().forEach(System.out::println);

        System.out.println("========== saveObj =========="); //delete
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    } // TestProductRepositoryImpl
}

