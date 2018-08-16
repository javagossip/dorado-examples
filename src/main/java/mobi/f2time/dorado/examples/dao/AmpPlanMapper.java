package mobi.f2time.dorado.examples.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mobi.f2time.dorado.examples.model.AmpPlan;
import mobi.f2time.dorado.examples.model.AmpPlanExample;

public interface AmpPlanMapper {
    int countByExample(AmpPlanExample example);

    int deleteByExample(AmpPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmpPlan record);

    int insertSelective(AmpPlan record);

    List<AmpPlan> selectByExample(AmpPlanExample example);

    AmpPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmpPlan record, @Param("example") AmpPlanExample example);

    int updateByExample(@Param("record") AmpPlan record, @Param("example") AmpPlanExample example);

    int updateByPrimaryKeySelective(AmpPlan record);

    int updateByPrimaryKey(AmpPlan record);

}