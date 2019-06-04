package com.mapper;

import com.pojo.MmallUser;
import java.util.List;

public interface MmallUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallUser record);

    MmallUser selectByPrimaryKey(Integer id);

    List<MmallUser> selectAll();

    int updateByPrimaryKey(MmallUser record);
}