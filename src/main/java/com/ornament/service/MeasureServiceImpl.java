package com.ornament.service;

import com.ornament.dao.MeasureDao;
import com.ornament.domain.Measure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenshuguo on 2017/5/11.
 */
@Service
public class MeasureServiceImpl implements MeasureService {

    @Autowired
    MeasureDao measureDao;

    public List<Measure> getMeasures(Integer pageStart, String startDate, String endDate, Integer status) {
        return measureDao.getMeasures(pageStart, startDate, endDate, status);
    }
}
