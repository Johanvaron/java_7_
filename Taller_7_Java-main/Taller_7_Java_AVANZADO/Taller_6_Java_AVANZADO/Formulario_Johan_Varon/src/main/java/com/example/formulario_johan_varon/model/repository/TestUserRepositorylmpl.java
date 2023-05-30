package com.example.formulario_johan_varon.model.repository;

import com.example.formulario_johan_varon.model.beans.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class TestUserRepositorylmpl implements Repository<User> {

    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositorylmpl() {
            @Override
            public void deleteObj(Integer id) throws SQLException {

            }
        };

        System.out.println("========== saveObj Insert =========="); // insert
        User userInsert = new User();
        userInsert.setUser_firstname("johan");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("johan@varon");
        userInsert.setUser_pssword("$6JH6@4w79DX4y");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("johan");
        userInsert.setUser_lastname("perez");
        userInsert.setUser_email("Johan@correo.com");
        userInsert.setUser_pssword("p6V36%5QS0UluI");
        repository.saveObj(userInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj =========="); //update
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("johan");
        userUpdate.setUser_lastname("Varon");
        userUpdate.setUser_email("JoanVaron@example.com");
        userUpdate.setUser_pssword("^JlB13L0U6MJ8s");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);

        System.out.println("========== saveObj =========="); //delete
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    } // TestUserRepositoryImpl
}