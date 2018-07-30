package com.gupaoedu.vip.pattern.factory.abst;

import com.gupaoedu.vip.pattern.factory.Code;
import com.gupaoedu.vip.pattern.factory.Enginner;
import com.gupaoedu.vip.pattern.factory.Programer;
import com.gupaoedu.vip.pattern.factory.Work;

/**
 * Created by Administrator on 2018/7/30.
 */
public class DefacultFactory extends Factory {
    @Override
    public Work getCode() {
        return new Code();
    }

    @Override
    public Work getProgramer() {
        return new Programer();
    }

    @Override
    public Work getEnginner() {
        return new Enginner();
    }
}
