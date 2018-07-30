package com.gupaoedu.vip.pattern.factory.fanc;

import com.gupaoedu.vip.pattern.factory.Enginner;
import com.gupaoedu.vip.pattern.factory.Work;

/**
 * Created by Administrator on 2018/7/30.
 */
public class EnginnerFactory implements Factory {
    @Override
    public Work getWork() {
        return new Enginner();
    }
}
