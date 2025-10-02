package vip.xiaonuo.a.feign.provider.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.xiaonuo.a.api.DemoApi;
import vip.xiaonuo.a.entity.dto.DemoDTO;
import vip.xiaonuo.a.feign.DemoFeign;
import vip.xiaonuo.a.param.DemoParam;

/**
 * @ClassName DemoFeignProvider
 * @Description TODO
 * @Author RHY
 * @Date 2025/9/30 17:40
 * @Version 1.0
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoFeignProvider implements DemoFeign {

    private final DemoApi demoApi;

    @RequestMapping("/feign/demo/query")
    @Override
    public DemoDTO query(DemoParam demoParam) {
        return demoApi.query(demoParam);
    }
}
