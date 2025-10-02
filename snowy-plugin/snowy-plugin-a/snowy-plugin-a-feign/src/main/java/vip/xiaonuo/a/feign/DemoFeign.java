package vip.xiaonuo.a.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.xiaonuo.a.api.DemoApi;
import vip.xiaonuo.a.entity.dto.DemoDTO;
import vip.xiaonuo.a.param.DemoParam;
import vip.xiaonuo.common.consts.FeignConstant;

/**
 * @ClassName DemoFeign
 * @Description TODO
 * @Author RHY
 * @Date 2025/9/30 17:30
 * @Version 1.0
 */
@FeignClient(name= FeignConstant.A_APP, contextId = "DemoFeign")
public interface DemoFeign {

    /**
     * 示例查询接口
     * @author RHY
     **/
    @RequestMapping("/feign/demo/query")
    DemoDTO query(DemoParam demoParam);
}
