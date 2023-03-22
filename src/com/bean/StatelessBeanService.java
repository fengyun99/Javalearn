package com.bean;


import com.dao.BillDao;
import com.dao.User;

import java.util.List;

public class StatelessBeanService {
    //虽然有billDao属性，但billDao是没有状态信息的，是Stateless Bean?public
    BillDao billDao;

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }

    public List<User> findUser(String Id) {
        return null;
    }
}
