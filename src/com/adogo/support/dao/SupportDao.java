package com.adogo.support.dao;

import java.util.List;

import com.adogo.support.entity.Support;

/**
 * @author sfz
 *
 */
public interface SupportDao {

	/**
	 * @return
	 */
	public List<Support> findAll();

	/**
	 * @param supportId
	 * @return
	 */
	public Support findById(long supportId);
	
	/**
	 * @param support
	 * @return
	 */
	public int create(Support support);
	
	/**
	 * @param support
	 * @return
	 */
	public int update(Support support);


}
