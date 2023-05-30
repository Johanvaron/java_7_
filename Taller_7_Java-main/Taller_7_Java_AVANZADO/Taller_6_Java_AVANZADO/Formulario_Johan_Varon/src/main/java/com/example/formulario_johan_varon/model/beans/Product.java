package com.example.formulario_johan_varon.model.beans;

public class Product {

    private int product_id;

    private  String product_name;

    private  int product_value;

    private  int category_id;

public  Product(){
    this.product_id = product_id;
    this.product_name = product_name;
    this.product_value = product_value;
    this.category_id = category_id;

}

    public int getProduct_id() {return product_id;}

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
}

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_valve() {
        return product_value;
    }

    public void setProduct_valve(int product_valve) {
        this.product_value = product_valve;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String setCategory_id(int category_id) {
        this.category_id = category_id;
        return null;
    }

    @Override
    public String toString() {
        return  "Product{" +
                "product_id" + product_id +
                ",product_name ='" + product_name + '\'' +
                ", product_value='" + product_value + '\'' +
                ", category_id='" + category_id + '\'' +
                '}';


    }

    public int getProduct_value() {
        return 0;
    }

    public void setProduct_value(int productValue) {
    }
}