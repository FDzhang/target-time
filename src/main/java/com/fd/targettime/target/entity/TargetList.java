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
 * 目标清单
 * </p>
 *
 * @author zxq
 * @since 2021-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TargetList对象", description="目标清单")
public class TargetList extends Model<TargetList> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "清单名称")
    private String targetListName;

    @ApiModelProperty(value = "创建人")
    private Integer createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Integer updateBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除")
    private Integer deleted;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
