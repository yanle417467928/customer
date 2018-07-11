package com.yanle.customer.api;

import com.github.pagehelper.Page;
import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;
import com.yanle.prd.domain.rpc.ResultDTO;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/11 16:21
 */
public interface CustomerApi extends BaseService<Customer> {

    /**
     * 分页查询
     *
     * @param customerVo
     * @return
     */
    public ResultDTO<Page<Customer>> queryWithPg(CustomerVo customerVo);
}
