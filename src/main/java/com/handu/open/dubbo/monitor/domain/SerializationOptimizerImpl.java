package com.handu.open.dubbo.monitor.domain;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
       
        //序列号
        classes.add(URL.class);
        return classes;
    }
}
