package com.trend.lazyinject.demo.component;

import com.trend.lazyinject.annotation.ComponentImpl;
import com.trend.lazyinject.annotation.DebugLog;
import com.trend.lazyinject.annotation.InjectComponent;
import com.trend.lazyinject.demo.model.BaseModel;
import com.trend.lazyinject.demo.model.ModelA;
import com.trend.lazyinject.lib.LazyInject;
import com.trend.lazyinject.lib.log.LOG;
import com.trend.lazyinject.lib.utils.ProcessUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by swift_gan on 2018/4/17.
 */
@ComponentImpl(process = "com.trend.lazyinject.demo.p1")
public class TestComponentImpl implements TestComponent {

    public TestComponentImpl() {
    }


    @DebugLog
    @Override
    public List<String> provide1() {
        return new ArrayList<>();
    }
    @DebugLog
    @Override
    public ArrayList<Integer> provide2() {
        return new ArrayList<>();
    }
    @DebugLog
    @Override
    public ArrayList<? extends BaseModel> provide3() {
        return new ArrayList<>();
    }
    @DebugLog
    @Override
    public ModelA provide4(Map strings,String test) {
        return new ModelA(ProcessUtils.getProcessName(LazyInject.context()));
    }
    @DebugLog
    @Override
    public Map<String, BaseModel> provide5() {
        return new HashMap<>();
    }
    @DebugLog
    @Override
    public Map<String, ? extends ModelA> provide6() {
        return new HashMap<>();
    }
    @DebugLog
    @Override
    public Map<String, ? extends ArrayList> provide7() {
        return new HashMap<>();
    }
}
