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

    public Integer changeMeasureStatus(Integer measureId) {
        return measureDao.changeMeasureStatus(measureId);
    }

    public Integer createMeasure(Integer collectionId, float measurePrice, String measureDate){
        Measure measure = new Measure();
        measure.setCollectionId(collectionId);
        measure.setMeasureDate(measureDate);
        measure.setMeasurePrice(measurePrice);
        return measureDao.createMeasure(measure);
    }
}
