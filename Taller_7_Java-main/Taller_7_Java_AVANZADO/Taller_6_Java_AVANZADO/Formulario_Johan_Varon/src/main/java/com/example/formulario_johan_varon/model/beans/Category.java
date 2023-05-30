package com.example.formulario_johan_varon.model.beans;

public class Category {
    public static int getCategory_id;
    private static int category_id;
    private String category_name;


    public Category (){
        this.category_id = category_id;
        this.category_name = category_name;
}


public static int getCategory_id()  { return category_id;}
    public void setCategory_id(int categoryId) {this.category_id = category_id;}


public String   getCategory_name()   { return category_name;}

    public void setCategory_name(String categoryName) {this.category_name = category_name;}

    @Override
    public String toString() {
        return "Category{" +
                ",category_id" + category_id +
                ",category_name ='" + category_name + '\'' +
                '}';
    }
}



