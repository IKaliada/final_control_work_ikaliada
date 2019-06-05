package com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.impl;

import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.BusinessCardRepository;
import com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model.BusinessCard;
import org.springframework.stereotype.Repository;

@Repository
public class BusinessCardRepositoryImpl extends GenericRepositoryImpl<Long, BusinessCard> implements BusinessCardRepository {
}
