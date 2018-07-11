package com.yanle.customer.dao.master;

import com.yanle.prd.domain.Customer;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 16:52
 */
@Repository
public interface CustomerDao {
    Customer getById(Long cusId);
}
