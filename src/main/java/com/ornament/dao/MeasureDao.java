package com.ornament.dao;

import com.ornament.domain.Measure;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by chenshuguo on 2017/5/11.
 */
public interface MeasureDao {
    /**
     *
     * @param pageStart
     * @param startDate
     * @param endDate
     * @param status
     * @return
     */
    public List<Measure> getMeasures(@Param("pageStart")Integer pageStart, @Param("startDate")String startDate, @Param("endDate")String endDate, @Param("status")Integer status);

    /**
     *
     * @param measure
     * @return
     */
    public int createMeasure(@Param("measure")Measure measure);

    /**
     *
     * @param measureId
     * @return
     */
    public Integer changeMeasureStatus(@Param("measureId")Integer measureId);
}
