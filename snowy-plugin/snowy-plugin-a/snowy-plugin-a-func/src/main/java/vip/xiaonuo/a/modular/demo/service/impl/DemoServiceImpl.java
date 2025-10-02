package vip.xiaonuo.a.modular.demo.service.impl;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.xiaonuo.a.modular.demo.service.DemoService;
import vip.xiaonuo.sys.api.SysApi;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private SysApi sysApi;

    @Override
    public String getDefaultPassword() {
        return sysApi.getDefaultPassword();
    }
}
