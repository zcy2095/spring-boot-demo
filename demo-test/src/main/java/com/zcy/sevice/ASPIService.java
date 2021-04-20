package com.zcy.sevice;

import com.zcy.spi.SPI;

/**
 * @Author zhangchongyu
 * @Description
 * @Date
 */
public class ASPIService implements SPI {
    @Override
    public void say() {
        System.out.println("西瓜A好帅！");
    }
}
