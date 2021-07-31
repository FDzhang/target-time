package com.fd.targettime.target.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 目标日志
 * </p>
 *
 * @author zxq
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TargetLog对象", description="目标日志")
public class TargetLog extends Model<TargetLog> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "完成时间")
    private Date finishTime;

    @ApiModelProperty(value = "清单id")
    private Integer targetListId;

    @ApiModelProperty(value = "目标id")
    private Integer targetId;

    @ApiModelProperty(value = "目标描述")
    private String targetName;

    @ApiModelProperty(value = "目标优先级")
    private Integer targetLevel;

    @ApiModelProperty(value = "目标预计时长")
    private Integer targetExpectTime;

    @ApiModelProperty(value = "目标实际时长")
    private Integer targetActualTime;

    @ApiModelProperty(value = "目标是否完成")
    private Integer targetFinishTag;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "原因or心得")
    private String feel;

    @ApiModelProperty(value = "创建人")
    private Integer createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "是否删除")
    private Integer deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
