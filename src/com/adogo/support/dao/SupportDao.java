package com.adogo.support.dao;

import java.util.List;

import com.adogo.support.entity.Support;

/**
 * @author fz
 *
 */
public interface SupportDao {

	public int create(Support support);

	public List<Support> findAll();

	public Support findById(long supportId);

	public int update(Support support);


}
