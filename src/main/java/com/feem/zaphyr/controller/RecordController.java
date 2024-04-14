package com.feem.zaphyr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feem.zaphyr.model.Anonimous;
import com.feem.zaphyr.service.RecordService;

@RestController
@RequestMapping("record")
@CrossOrigin("*")
public class RecordController {

  @Autowired
  private RecordService recordService;

  @GetMapping
  public Anonimous get() {
    return recordService.getDataRecord();
  }
  
}
