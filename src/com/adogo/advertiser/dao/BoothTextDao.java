package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.booth.BoothText;

/**
 * @author Athens
 *
 */
public interface BoothTextDao {
	/**
	 * @param boothId
	 * @return
	 */
	public List<BoothText> findByBoothId(long boothId);
	
	/**
	 * @param boothText
	 * @return
	 */
	public int create(BoothText boothText);
	
	/**
	 * @param boothTextList
	 * @return
	 */
	public int[] createInBatch(List<BoothText> boothTextList);
	
	/**
	 * @param boothText
	 * @return
	 */
	public int update(BoothText boothText);
	
	/**
	 * @param boothTextList
	 * @return
	 */
	public int[] updateInBatch(List<BoothText> boothTextList);
}
