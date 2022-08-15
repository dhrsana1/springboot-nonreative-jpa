package com.poc.spring_project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.spring_project.domain.ZIPRepo;
import com.poc.spring_project.domain.ZipCode;

@RestController
@RequestMapping(value = "/zipcode")
public class ZipCodeApi {

    @Autowired
    private ZIPRepo zipRepo;


    @GetMapping("/{zipcode}")
    public Optional<ZipCode> findById(@PathVariable String zipcode) {
        System.out.println("Sent: "+zipcode );
        return getById(zipcode);
    }

    @GetMapping("/by_city")
    public List<ZipCode> postZipCode(@RequestParam String city) {
        System.out.println("Sent: "+city + "row exists: ");
        return zipRepo.findByCity(city);
    }

    @PostMapping
    public Optional<ZipCode> create(@RequestBody ZipCode zipCode) {
        return getById(zipCode.getZip());
    }

    private Optional<ZipCode> getById(String zipCode) {
        return zipRepo.findById(zipCode);
    }

    @GetMapping("/allzips")
	public Iterable<ZipCode> getAllComments() {
		return zipRepo.findAll();
	}


 
}
