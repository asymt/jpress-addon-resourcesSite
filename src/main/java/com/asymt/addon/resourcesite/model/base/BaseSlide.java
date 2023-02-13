package com.asymt.addon.resourcesite.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSlide<M extends BaseSlide<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	public void setId(Integer id) {
		set("id", id);
	}

    /**
     * 主键ID
     */
	public Integer getId() {
		return getInt("id");
	}

    /**
     * 排序号
     */
	public void setOrderNo(Integer orderNo) {
		set("order_no", orderNo);
	}

    /**
     * 排序号
     */
	public Integer getOrderNo() {
		return getInt("order_no");
	}

    /**
     * 图片路径
     */
	public void setImg(String img) {
		set("img", img);
	}

    /**
     * 图片路径
     */
	public String getImg() {
		return getStr("img");
	}

    /**
     * 跳转链接
     */
	public void setTargetUrl(String targetUrl) {
		set("target_url", targetUrl);
	}

    /**
     * 跳转链接
     */
	public String getTargetUrl() {
		return getStr("target_url");
	}

    /**
     * 创建日期
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建日期
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

}
