package MS.StudentPersonalDetails.controller;

import MS.StudentPersonalDetails.model.PersonalDetails;
import MS.StudentPersonalDetails.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Controller{
    @Autowired
    private Service service;

    @GetMapping("/pd")
    public List<PersonalDetails> getAll(){
        return service.getAllPD();
    }

    @GetMapping("/pd/{id}")
    public Optional<PersonalDetails> getById(@PathVariable(value="id") Integer PDID){
        return service.getById(PDID);
    }



}