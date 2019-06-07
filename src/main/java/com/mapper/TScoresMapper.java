package com.mapper;

import com.pojo.TScores;
import java.util.List;

public interface TScoresMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TScores record);

    TScores selectByPrimaryKey(Long id);

    List<TScores> selectAll();

    int updateByPrimaryKey(TScores record);
}