package com.example.ciclo4_reto3;

import com.example.ciclo4_reto3.repositories.crud.AccessoryCrudRepository;
import com.example.ciclo4_reto3.repositories.crud.OrderCrudRepository;
import com.example.ciclo4_reto3.repositories.crud.SupplementsCrudRepository;
import com.example.ciclo4_reto3.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ciclo4Reto3Application {

    @Autowired
    private AccessoryCrudRepository crudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    @Autowired
    private SupplementsCrudRepository supplementsCrudRepository;


    public static void main(String[] args) {
        SpringApplication.run(Ciclo4Reto3Application.class, args);
    }


}
