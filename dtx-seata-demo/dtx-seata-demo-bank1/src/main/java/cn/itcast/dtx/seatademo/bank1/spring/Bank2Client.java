package cn.itcast.dtx.seatademo.bank1.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator.
 */
@FeignClient(value="seata-demo-bank2",/*李四微服务名称*/fallback=Bank2ClientFallback.class/*降级方法*/)
public interface Bank2Client {
    //远程调用李四的微服务.由李四提供！/bank2为工程路径
    @GetMapping("/bank2/transfer")
    public  String transfer(@RequestParam("amount") Double amount);
}
