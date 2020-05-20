package demo.vo;

import demo.enums.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * 自定义统一响应体
 */
@Getter
@ApiModel
public class ResultVO<T> {


    @ApiModelProperty(value = "状态码",notes = "默认1000是成功")
    private int code;

    @ApiModelProperty(value = "响应信息",notes = "来说明响应情况")
    private String msg;

    @ApiModelProperty(value = "响应的具体信息")
    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS,data);
    }

    public ResultVO(ResultCode result, T data) {
        this.code = result.getCode();
        this.msg = result.getMsg();
        this.data = data;
    }
}
