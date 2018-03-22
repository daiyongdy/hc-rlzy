package com.cd.hc.dao.mapper;

import com.cd.hc.dao.model.po.HCUserDO;
import com.cd.hc.dao.model.po.HCUserDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HCUserDOMapper {
    int countByExample(HCUserDOExample example);

    int deleteByExample(HCUserDOExample example);

    int insert(HCUserDO record);

    int insertSelective(HCUserDO record);

    List<HCUserDO> selectByExample(HCUserDOExample example);

    int updateByExampleSelective(@Param("record") HCUserDO record, @Param("example") HCUserDOExample example);

    int updateByExample(@Param("record") HCUserDO record, @Param("example") HCUserDOExample example);
}