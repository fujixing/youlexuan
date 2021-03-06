package com.offcn.service;
import java.util.List;

import com.offcn.common.Specfiction;
import com.offcn.pojo.TbSpecification;

import com.offcn.common.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SpecificationService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbSpecification> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Specfiction specfiction);
	
	
	/**
	 * 修改
	 */
	public void update(Specfiction specification);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Specfiction findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbSpecification specification, int pageNum, int pageSize);
	
}
