package com.lashes.spring.rest.controller;

import com.lashes.spring.rest.entity.Client;
import com.lashes.spring.rest.sevice.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Работает с EmployeeService
@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> showAllClients() {
        List<Client> allClients = clientService.getAllClients();
        return allClients;

    }
}
