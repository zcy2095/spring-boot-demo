package com.zcy.sevice;

import org.springframework.stereotype.Component;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
@Component
public class BserviceImpl {

    AServiceImpl aService;
    public BserviceImpl() {
    }

    public void setaService(AServiceImpl aService) {
        this.aService = aService;
    }
}
