package com.fd.targettime.target.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 目标
 * </p>
 *
 * @author zxq
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Target对象", description="目标")
public class Target extends Model<Target> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "清单id")
    private Integer targetListId;

    @ApiModelProperty(value = "目标描述")
    private String targetName;

    @ApiModelProperty(value = "目标优先级")
    private String targetLevel;

    @ApiModelProperty(value = "任务时长：秒")
    private Integer targetTime;

    @ApiModelProperty(value = "重复类型： 0-无，1-每日重复")
    private Integer repeatType;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "目标开始时间")
    private String startTime;

    @ApiModelProperty(value = "创建人")
    private Integer createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Integer updateBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除: 0-未删除，1-删除")
    private Integer deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
