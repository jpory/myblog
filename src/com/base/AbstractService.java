package com.base;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
public abstract  class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {
	protected BaseDao<T, ID> baseDao;
	@Override
	public int deleteByPrimaryKey(ID id) {
		return baseDao.deleteByPrimaryKey(id);
	}
	@Override
	public int insertSelective(T record) {
		return baseDao.insertSelective(record);
	}
	@Override
	public T selectByPrimaryKey(ID id) {
		return baseDao.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(T record) {
		return baseDao.updateByPrimaryKey(record);
	}
	@Override
	public int updateByPrimaryKeyWithBLOBs(T record) {
		return baseDao.updateByPrimaryKeyWithBLOBs(record);
	}
	@Override
	public int updateByPrimaryKey(T record) {
		return baseDao.updateByPrimaryKey(record);
	}
	@Override
	public int insert(T record) {
		return baseDao.insert(record);
	}
}