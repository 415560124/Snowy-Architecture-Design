package vip.xiaonuo.a.api.context;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import vip.xiaonuo.a.api.DemoApi;
import vip.xiaonuo.a.entity.dto.DemoDTO;
import vip.xiaonuo.a.feign.DemoFeign;
import vip.xiaonuo.a.param.DemoParam;

/**
 * @ClassName DemoContextBean
 * @Description TODO
 * @Author 41556
 * @Date 2025/9/30 17:31
 * @Version 1.0
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class DemoContextBean implements DemoApi {

    private final DemoFeign demoFeign;

    @Override
    public DemoDTO query(DemoParam demoParam) {
        return demoFeign.query(demoParam);
    }
}
