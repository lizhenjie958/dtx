
package cn.itcast.dtx.tccdemo.bank1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableAspectJAutoProxy // 增加切面配置
@EnableFeignClients(basePackages = {"cn.itcast.dtx.tccdemo.bank1.spring"})
@ComponentScan({"cn.itcast.dtx.tccdemo.bank1","org.dromara.hmily"})	// 增加org.dromara.hmily的扫描项
public class Bank1TccServer {

	public static void main(String[] args) {
		SpringApplication.run(Bank1TccServer.class, args);

	}

}
