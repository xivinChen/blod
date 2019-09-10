package com.blod.mapper;

import com.blod.entity.Critique;
import com.blod.entity.CritiqueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CritiqueMapper {
    int countByExample(CritiqueExample example);

    int deleteByExample(CritiqueExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(Critique record);

    int insertSelective(Critique record);

    List<Critique> selectByExampleWithBLOBs(CritiqueExample example);

    List<Critique> selectByExample(CritiqueExample example);

    Critique selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") Critique record, @Param("example") CritiqueExample example);

    int updateByExampleWithBLOBs(@Param("record") Critique record, @Param("example") CritiqueExample example);

    int updateByExample(@Param("record") Critique record, @Param("example") CritiqueExample example);

    int updateByPrimaryKeySelective(Critique record);

    int updateByPrimaryKeyWithBLOBs(Critique record);

    int updateByPrimaryKey(Critique record);
}