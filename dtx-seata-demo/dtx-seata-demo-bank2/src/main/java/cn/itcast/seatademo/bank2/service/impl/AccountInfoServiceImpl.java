package cn.itcast.seatademo.bank2.service.impl;

import cn.itcast.seatademo.bank2.dao.AccountInfoDao;
import cn.itcast.seatademo.bank2.service.AccountInfoService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Administrator
 * @version 1.0
 **/
@Service
@Slf4j
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    AccountInfoDao accountInfoDao;


    @Transactional      // 开启本地事务。注：全局事务在调用方开启，被调用方不需要再次开启全局事务
    @Override
    public void updateAccountBalance(String accountNo, Double amount) {
        log.info("bank2 service begin,XID：{}", RootContext.getXID());   // xid全局事务的id
        //李四增加金额
        accountInfoDao.updateAccountBalance(accountNo,amount);
        if(amount==3){
            //人为制造异常
            throw new RuntimeException("bank2 make exception..");
        }
    }
}
