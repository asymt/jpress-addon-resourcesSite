package com.asymt.addon.resourcesite.service;

import com.jfinal.plugin.activerecord.Page;
import com.asymt.addon.resourcesite.model.IntegralAvailables;
import io.jboot.db.model.Columns;

import java.util.List;

public interface IntegralAvailablesService  {

    /**
     * 根据主键查找Model
     *
     * @param id
     * @return
     */
    public IntegralAvailables findById(Object id);


    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @return
     */
    public IntegralAvailables findFirstByColumns(Columns columns);

    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public IntegralAvailables findFirstByColumns(Columns columns, String orderBy);


    /**
     * 查找全部数据
     *
     * @return
     */
    public List<IntegralAvailables> findAll();


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @return
     */
    public List<IntegralAvailables> findListByColumns(Columns columns);


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public List<IntegralAvailables> findListByColumns(Columns columns, String orderBy);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param count
     * @return
     */
    public List<IntegralAvailables> findListByColumns(Columns columns, Integer count);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @param count
     * @return
     */
    public List<IntegralAvailables> findListByColumns(Columns columns, String orderBy, Integer count);


    /**
     * 根据提交查询数据量
     *
     * @param columns
     * @return
     */
    public long findCountByColumns(Columns columns);


    /**
     * 根据ID 删除model
     *
     * @param id
     * @return
     */
    public boolean deleteById(Object id);


    /**
     * 删除
     *
     * @param model
     * @return
     */
    public boolean delete(IntegralAvailables model);


    /**
     * 根据 多个 id 批量删除
     *
     * @param ids
     * @return
     */
    public boolean batchDeleteByIds(Object... ids);


    /**
     * 保存到数据库
     *
     * @param model
     * @return id if success
     */
    public Object save(IntegralAvailables model);


    /**
     * 保存或更新
     *
     * @param model
     * @return id if success
     */
    public Object saveOrUpdate(IntegralAvailables model);

    /**
     * 更新
     *
     * @param model
     * @return
     */
    public boolean update(IntegralAvailables model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<IntegralAvailables> paginate(int page, int pageSize);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<IntegralAvailables> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return
     */
    public Page<IntegralAvailables> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


    /**
     * 统计更新用户的积分总额
     * @param userId
     */
    void updateUserIntegral(Long userId);

    /**
     * 过期用户积分
     */
    void expireIntegral();
}
