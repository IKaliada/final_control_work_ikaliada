package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.impl;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.BusinessCard;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.BusinessCardConverter;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.UserConverter;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.BusinessCardDTO;
import org.springframework.stereotype.Component;

@Component
public class BusinessCardConverterImpl implements BusinessCardConverter {
    private final UserConverter userConverter;

    public BusinessCardConverterImpl(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    @Override
    public BusinessCard fromBusinessCardDTO(BusinessCardDTO businessCardDTO) {
        BusinessCard businessCard = new BusinessCard();
        businessCard.setTitle(businessCardDTO.getTitle());
        businessCard.setFullname(businessCardDTO.getFullname());
        businessCard.setWorkingTelephone(businessCardDTO.getWorkingTelephone());
        businessCard.setUser(userConverter.fromDTO(businessCardDTO.getUserDTO()));
        return businessCard;
    }

    @Override
    public BusinessCardDTO toBusinessCardDTO(BusinessCard businessCard) {
        BusinessCardDTO businessCardDTO = new BusinessCardDTO();
        businessCardDTO.setId(businessCard.getId());
        businessCardDTO.setFullname(businessCard.getFullname());
        businessCardDTO.setTitle(businessCard.getTitle());
        businessCardDTO.setWorkingTelephone(businessCard.getWorkingTelephone());
        return businessCardDTO;
    }
}
