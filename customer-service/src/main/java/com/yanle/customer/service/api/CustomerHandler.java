package com.yanle.customer.service.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.yanle.customer.api.CustomerApi;
import com.yanle.customer.dao.master.CustomerDao;
import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;
import com.yanle.prd.domain.rpc.ResultDTO;
import com.yanle.prd.domain.rpc.RpcCommonCode;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/11 16:43
 */
@Service(interfaceClass = CustomerApi.class)
@Component
public class CustomerHandler implements CustomerApi {

    @Resource
    private CustomerDao customerDao;

    public ResultDTO<Page<Customer>> queryWithPg(CustomerVo customerVo) {
        return null;
    }

    public ResultDTO<Long> create(Customer customer) {
        return null;
    }

    public ResultDTO<Integer> delete(Long pk) {
        return null;
    }

    public ResultDTO<Integer> update(Customer customer) {
        return null;
    }

    public ResultDTO<Customer> get(Long pk) {
        Customer customer = customerDao.getById(pk);
        if (null != customer) {
            return new ResultDTO<Customer>(RpcCommonCode.SUCCESS, null, customer);
        } else {
            return new ResultDTO<Customer>(RpcCommonCode.FAILURE, "没有找到该顾客相关信息", null);
        }

    }
}
