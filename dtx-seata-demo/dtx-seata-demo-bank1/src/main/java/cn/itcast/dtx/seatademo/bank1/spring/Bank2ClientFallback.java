package cn.itcast.dtx.seatademo.bank1.spring;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @version 1.0
 **/
@Component
public class Bank2ClientFallback implements Bank2Client {

    @Override
    public String transfer(Double amount) {
        /**
         * 调用李四微服务失败的返回值
         */
        return "fallback";
    }
}
