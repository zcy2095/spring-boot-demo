package com.zcy.sevice;

import com.zcy.spi.SPI;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class BSPIService implements SPI {
    @Override
    public void say() {
        System.out.println("西瓜B好帅！");
    }
}
