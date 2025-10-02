package vip.xiaonuo.a.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DemoDTO {
    /** 名称 */
    @Schema(description = "名称")
    private String name;
}
