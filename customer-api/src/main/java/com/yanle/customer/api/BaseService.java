package com.yanle.customer.api;

import com.yanle.prd.domain.rpc.ResultDTO;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/11 16:12
 */
public interface BaseService<T> {
    /**
     * 新增记录
     * @param t
     * @return
     */
    public ResultDTO<Long> create(T t);

    /**
     * 根据主键删除
     * @param pk
     * @return
     */
    public ResultDTO<Integer> delete(Long pk);

    /**
     * 根据主键更新记录
     * @param t
     * @return
     */
    public ResultDTO<Integer> update(T t);

    /**
     * 根据主键查询
     * @param pk
     * @return
     */
    public ResultDTO<T> get(Long pk);

}
