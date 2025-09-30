package vip.xiaonuo.a.modular.demo.provider;

import vip.xiaonuo.a.api.DemoApi;

/**
 * @ClassName DemoApiProvider
 * @Description TODO
 * @Author RHY
 * @Date 2025/9/30 17:46
 * @Version 1.0
 */
public class DemoApiProvider implements DemoApi {
    @Override
    public String query() {
        return "Success Provider";
    }
}
