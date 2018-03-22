package com.cd.hc.dao.mapper.db;

import com.cd.hc.dao.model.db.HCUserDO;
import com.cd.hc.dao.model.db.HCUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HCUserDOMapper {
    int countByExample(HCUserDOExample example);

    int deleteByExample(HCUserDOExample example);

    int insert(HCUserDO record);

    int insertSelective(HCUserDO record);

    List<HCUserDO> selectByExample(HCUserDOExample example);

    int updateByExampleSelective(@Param("record") HCUserDO record, @Param("example") HCUserDOExample example);

    int updateByExample(@Param("record") HCUserDO record, @Param("example") HCUserDOExample example);
}