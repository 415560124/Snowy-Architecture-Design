package vip.xiaonuo.a.modular.demo.provider;

import com.alibaba.fastjson.JSONObject;
import vip.xiaonuo.a.api.DemoApi;
import vip.xiaonuo.a.entity.dto.DemoDTO;
import vip.xiaonuo.a.param.DemoParam;

/**
 * @ClassName DemoApiProvider
 * @Description TODO
 * @Author RHY
 * @Date 2025/9/30 17:46
 * @Version 1.0
 */
public class DemoApiProvider implements DemoApi {
    @Override
    public DemoDTO query(DemoParam demoParam) {
        DemoDTO dto = new DemoDTO();
        dto.setName(demoParam.getName());
        return dto;
    }
}
