package com.iotyun.manager.netty;

import java.util.Map;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelId;

@Component
@EnableScheduling
//@Async
public class AlarmTask {

//    /**默认是fixedDelay 上一次执行完毕时间后执行下一轮*/
//    @Scheduled(cron = "0/5 * * * * *")
//    public void run() throws InterruptedException {
//        Thread.sleep(6000);
//        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用cron  {}"+(System.currentTimeMillis()/1000));
//    }
//
//    /**fixedRate:上一次开始执行时间点之后5秒再执行*/
//    @Scheduled(fixedRate = 5000)
//    public void run1() throws InterruptedException {
//        Thread.sleep(6000);
//        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用fixedRate  {}"+(System.currentTimeMillis()/1000));
//    }
    
    /**第一次延迟2秒后执行，之后按fixedDelay的规则每5秒执行一次
     * @throws InterruptedException */
    @Scheduled(initialDelay = 2000, fixedDelay = 600000)
    public void run3() throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+"=====>>>>>开始读取（在线用户）设备传感器数据");
        Map<String, DeviceState>  onlineDevicesState = ConnectManager.getInstance().getOnlineDevicesState();
        
        
 

    }

    
}
