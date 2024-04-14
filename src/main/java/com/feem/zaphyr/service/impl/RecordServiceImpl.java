package com.feem.zaphyr.service.impl;

import org.springframework.stereotype.Service;

import com.feem.zaphyr.model.Anonimous;
import com.feem.zaphyr.model.RecordVO;
import com.feem.zaphyr.service.RecordService;

@Service
public class RecordServiceImpl implements RecordService {

  @Override
  public Anonimous getDataRecord() {
    var anonimous = new Anonimous();
    var recordVO = new RecordVO("null", 12);
    anonimous.setName("Anonimous Record");
    anonimous.setRecordVO(recordVO);
    return anonimous;
  }


}
