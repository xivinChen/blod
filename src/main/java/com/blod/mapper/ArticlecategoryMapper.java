package com.blod.mapper;

import com.blod.entity.Articlecategory;
import com.blod.entity.ArticlecategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlecategoryMapper {
    int countByExample(ArticlecategoryExample example);

    int deleteByExample(ArticlecategoryExample example);

    int deleteByPrimaryKey(Integer ctgId);

    int insert(Articlecategory record);

    int insertSelective(Articlecategory record);

    List<Articlecategory> selectByExample(ArticlecategoryExample example);

    Articlecategory selectByPrimaryKey(Integer ctgId);

    int updateByExampleSelective(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByExample(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByPrimaryKeySelective(Articlecategory record);

    int updateByPrimaryKey(Articlecategory record);
}