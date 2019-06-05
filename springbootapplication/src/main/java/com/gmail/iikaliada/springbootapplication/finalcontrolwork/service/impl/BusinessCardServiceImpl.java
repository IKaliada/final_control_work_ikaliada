package com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.impl;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.BusinessCardRepository;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.BusinessCard;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.BusinessCardService;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.converter.BusinessCardConverter;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.service.model.BusinessCardDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusinessCardServiceImpl implements BusinessCardService {
    private final BusinessCardRepository businessCardRepository;
    private final BusinessCardConverter businessCardConverter;

    public BusinessCardServiceImpl(BusinessCardRepository businessCardRepository, BusinessCardConverter businessCardConverter) {
        this.businessCardRepository = businessCardRepository;
        this.businessCardConverter = businessCardConverter;
    }

    @Override
    @Transactional
    public void add(BusinessCardDTO businessCardDTO) {
        BusinessCard businessCard = businessCardConverter.fromBusinessCardDTO(businessCardDTO);
        businessCardRepository.persist(businessCard);
    }

    @Override
    @Transactional
    public List<BusinessCardDTO> getBusinessCards() {
        List<BusinessCard> businessCards = businessCardRepository.getAllEntity();
        return businessCards.stream().map(businessCardConverter::toBusinessCardDTO).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        businessCardRepository.removeById(id);
    }
}
