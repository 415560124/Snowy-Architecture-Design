package vip.xiaonuo.a.modular.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.xiaonuo.a.modular.demo.service.DemoService;
import vip.xiaonuo.common.pojo.CommonResult;

@Tag(name = "示例控制器")
@RestController
@Validated
public class DemoController {

    @Resource
    private DemoService demoService;

    @Operation(summary = "获取系统默认密码")
    @GetMapping("/default-password")
    public CommonResult<String> getDefaultPassword() {
        return CommonResult.ok(demoService.getDefaultPassword());
    }
}
