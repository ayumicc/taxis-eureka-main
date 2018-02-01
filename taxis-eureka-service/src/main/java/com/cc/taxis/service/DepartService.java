package com.cc.taxis.service;

import com.cc.taxis.mapper.DepartMapper;
import com.cc.taxis.model.Depart;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class DepartService {

    @Autowired
    private DepartMapper departMapper;

    public List<Depart> getAll(){
        return departMapper.selectAll();
    }

    public Depart getId(int depNo) {
       return departMapper.selectByPrimaryKey(depNo) ;
    }

    public void delete(int depNo) {
        departMapper.deleteByPrimaryKey(depNo);
    }

    public PageInfo<Depart> findDepartByPage(int pageNum , int pageSize) {
        PageHelper.startPage(pageNum , pageSize);
        Example example = new Example(Depart.class);
        Page<Depart> departs =(Page<Depart>) departMapper.selectByExample(example);
        PageInfo<Depart> pageInfo = new PageInfo<>(departs);
        return pageInfo;
    }

    public void save(Depart depart){
        if (depart.getDepno() == null)
            departMapper.insertSelective(depart);
        else
            departMapper.insert(depart);
    }
}
