package io.rocktest.modules;

import io.rocktest.modules.annotations.RockWord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Print extends RockModule {

    private static Logger LOG = LoggerFactory.getLogger(Print.class);

    @RockWord(keyword="print")
    public Map<String,Object> print(Map<String,Object> params) {

        String msg = getStringParam(params,"msg","");
        System.out.println(msg);

        return null;

    }


}
