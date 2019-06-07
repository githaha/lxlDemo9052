package com.service;

import com.pojo.MmallUser;

import java.util.List;

public interface UserService {
   public int deleteByPrimaryKey(Integer id);

    public int insert(MmallUser record);

    public MmallUser selectByPrimaryKey(Integer id);

    public  List<MmallUser> selectAll();

    public int updateByPrimaryKey(MmallUser record);
}
