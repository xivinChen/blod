package com.blod.mapper;

import com.blod.entity.Dianzan;
import com.blod.entity.DianzanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DianzanMapper {
    int countByExample(DianzanExample example);

    int deleteByExample(DianzanExample example);

    int deleteByPrimaryKey(Integer ckId);

    int insert(Dianzan record);

    int insertSelective(Dianzan record);

    List<Dianzan> selectByExample(DianzanExample example);

    Dianzan selectByPrimaryKey(Integer ckId);

    int updateByExampleSelective(@Param("record") Dianzan record, @Param("example") DianzanExample example);

    int updateByExample(@Param("record") Dianzan record, @Param("example") DianzanExample example);

    int updateByPrimaryKeySelective(Dianzan record);

    int updateByPrimaryKey(Dianzan record);
}