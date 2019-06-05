package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.BusinessCard;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.BusinessCardDTO;

public interface BusinessCardConverter {
    BusinessCard fromBusinessCardDTO(BusinessCardDTO businessCardDTO);

    BusinessCardDTO toBusinessCardDTO(BusinessCard businessCard);
}
