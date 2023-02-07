package com.asymt.addon.resourcesite.model;

import io.jboot.db.annotation.Table;
import com.asymt.addon.resourcesite.model.base.BaseIntegralDetails;

/**
 * Generated by JPress.
 */
@Table(tableName = "integral_details", primaryKey = "id")
public class IntegralDetails extends BaseIntegralDetails<IntegralDetails> {
    private static final long serialVersionUID = 1L;

    public static final int ADD_TYPE=1;
    public static final int CONSUME_TYPE=2;
    public static final int EXPIRE_TYPE=3;

    public String getTypeStr(){
        switch (getType()){
            case 1: return "新增";
            case 2: return "消耗";
            case 3: return "过期";
            default: return "";
        }
    }

}

