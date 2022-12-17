package com.example.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Citizen;

public interface Repository extends CrudRepository<Citizen, Integer>
{

}
