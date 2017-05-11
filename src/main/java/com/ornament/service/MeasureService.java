package com.ornament.service;

import com.ornament.domain.Measure;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by chenshuguo on 2017/5/11.
 */
public interface MeasureService {
    public List<Measure> getMeasures(Integer pageStart, String startDate, String endDate, Integer status);
}
