package com.example.formulario_johan_varon.model.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CategoryRepositorylmpl {
    List<Category> listAllObj() throws SQLException // listAllObj
    ;

    Category byIdObj(Integer id) throws SQLException // byIdObj
    ;

    Integer saveObj(Category category) throws SQLException // saveObj
    ;

    void deleteObj(Integer id) throws SQLException // deleteObj
    ;

    Category createObj(ResultSet rs) throws SQLException  // createObj
    ;
}
