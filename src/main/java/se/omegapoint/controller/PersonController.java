package se.omegapoint.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.omegapoint.model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping("/Persons.json")
    public List<Person> getPersons() {
        return retrievePersons();
    }

    private List<Person> retrievePersons() {
        Resource personsResource = new ClassPathResource("data/persons.json");
        ObjectMapper mapper = new ObjectMapper();
        List<Person> persons = new ArrayList<Person>();
        try {
            persons = mapper.readValue(personsResource.getInputStream(), new TypeReference<List<Person>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }


}
