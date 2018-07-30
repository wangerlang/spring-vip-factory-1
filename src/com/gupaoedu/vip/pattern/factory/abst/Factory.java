package com.gupaoedu.vip.pattern.factory.abst;

import com.gupaoedu.vip.pattern.factory.Work;

/**
 * Created by Administrator on 2018/7/30.
 */
public abstract class Factory {
    public abstract Work getCode();
    public abstract Work getProgramer();
    public abstract Work getEnginner();
}
