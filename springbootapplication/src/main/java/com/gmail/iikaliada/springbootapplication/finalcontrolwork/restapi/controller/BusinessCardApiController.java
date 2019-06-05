package com.gmail.iikaliada.springbootapplication.finalcontrolwork.restapi.controller;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.BusinessCardService;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.BusinessCardDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class BusinessCardApiController {

    private BusinessCardService businessCardService;

    public BusinessCardApiController(BusinessCardService businessCardService) {
        this.businessCardService = businessCardService;
    }

    @PostMapping("/businessCard")
    public ResponseEntity<String> addBusinessCard(@Valid @RequestBody BusinessCardDTO businessCardDTO,
                                                  BindingResult bindingResult) {
        businessCardService.add(businessCardDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/businessCard/card")
    public List<BusinessCardDTO> getBusinessCard() {
        return businessCardService.getBusinessCards();
    }

    @DeleteMapping("/businessCard/{id}")
    public ResponseEntity<String> deleteArticle(@PathVariable("id") Long id) {
            businessCardService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
