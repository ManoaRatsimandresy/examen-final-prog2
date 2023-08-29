package com.gestiondeparcinformatique.examenfinalprog2.controllers;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;
import com.gestiondeparcinformatique.examenfinalprog2.service.PersonnelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonnelControllers {
    private final PersonnelService personnelService;


    public PersonnelControllers(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }
    @GetMapping("/GetAllPersonnel")
    public List<Personnel> findAllPersonnel()
    {
        return personnelService.findAllPersonnel();

    }
}
