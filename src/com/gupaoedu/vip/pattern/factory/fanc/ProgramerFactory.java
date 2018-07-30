package com.gupaoedu.vip.pattern.factory.fanc;

import com.gupaoedu.vip.pattern.factory.Programer;
import com.gupaoedu.vip.pattern.factory.Work;

/**
 * Created by Administrator on 2018/7/30.
 */
public class ProgramerFactory implements Factory{
    @Override
    public Work getWork() {
        return new Programer();
    }
}
