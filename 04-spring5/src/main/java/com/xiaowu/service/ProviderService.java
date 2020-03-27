package com.xiaowu.service;

import com.xiaowu.dao.ProviderDao;

public class ProviderService {

    private ProviderDao providerDao;

    public void update(){
        System.out.println("更新了供应商的信息");
        ProviderDao.update();
    }

    public ProviderDao getProviderDao() {
        return providerDao;
    }

    public void setProviderDao(ProviderDao providerDao) {
        this.providerDao = providerDao;
    }
}
