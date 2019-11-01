package com.cmz.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @nickname 陈梦洲
 * @date 2019/11/1
 * @description 等值查询使用的分片算法，包括in
 */
public class TblPreShardAlgo implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingColumn) {
        // 不分表
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-availableTargetNames:" + availableTargetNames);
        for (String tbname : availableTargetNames) {
            return tbname;
        }
        throw new IllegalArgumentException();
    }

}
