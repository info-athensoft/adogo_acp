package com.adogo.ad.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("adPostDaoJdbcImpl")
public class AdPostDaoJdbcImpl implements AdPostDao {

}
