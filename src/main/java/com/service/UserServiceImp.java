package com.service;

import com.mapper.MmallUserMapper;
import com.pojo.MmallUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private MmallUserMapper mmallUserMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mmallUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insert(MmallUser record){
        return mmallUserMapper.insert(record);
    }

    @Override
    public MmallUser selectByPrimaryKey(Integer id) {
        return mmallUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MmallUser> selectAll() {
        return mmallUserMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(MmallUser record) {
        return mmallUserMapper.updateByPrimaryKey(record);
    }
}
