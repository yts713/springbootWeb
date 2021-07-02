package com.example.demo.service.impl;

import com.example.demo.dao.GoodMapper;
import com.example.demo.service.MiaoShaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/11 16:56
 * @Version 1.0
 */
@Service
public class MiaoShaInterfaceImpl implements MiaoShaInterface {
    @Autowired
    private GoodMapper goodMapper;
    @Override
    public int miaoShaService(String goodName) {
        int flag = 0;
        int goodNum = goodMapper.getGoodNum(goodName);
        if(goodNum>0) {
            int i = goodMapper.editGoodNum(goodName);
            if(i==1){
                flag=1;
            }
        }
        return flag;
    }
}
