package vip.xiaonuo.a.api;

import vip.xiaonuo.a.entity.dto.DemoDTO;
import vip.xiaonuo.a.param.DemoParam;

/**
 * @ClassName 示例API
 * @Description 用作a模块示例展示
 * @Author RHY
 * @Date 2025/9/30 17:29
 * @Version 1.0
 */
public interface DemoApi {
    /**
     * 查询示例
     *
     * @author RHY
     * @date 2025/9/30 17:29
     **/
    DemoDTO query(DemoParam demoParam);
}
