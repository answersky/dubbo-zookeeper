package cn.monitor.service;

import cn.monitor.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author answer
 *         2018/2/5
 */
public class CusServiceTest extends BaseTest{
    @Resource
    private CusService cusService;

    @Test
    public void findUserInfo() throws Exception {
        cusService.findUserInfo();
    }

}