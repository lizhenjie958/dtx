
package cn.itcast.dtx.tccdemo.bank2;


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
@EnableFeignClients(basePackages = {"cn.itcast.dtx.tccdemo.bank2"})
@ComponentScan({"cn.itcast.dtx.tccdemo.bank2","org.dromara.hmily"})
public class Bank2TccServer {

	public static void main(String[] args) {
		SpringApplication.run(Bank2TccServer.class, args);

	}

}
