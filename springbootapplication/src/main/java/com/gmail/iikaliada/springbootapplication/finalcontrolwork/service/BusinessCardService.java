package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.BusinessCardDTO;

import java.util.List;

public interface BusinessCardService {
    void add(BusinessCardDTO businessCardDTO);

    List<BusinessCardDTO> getBusinessCards();

    void deleteById(Long id);
}
