package com.cd.hc.service;

import com.cd.hc.dao.model.db.HCUserDO;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
public interface UserService {

	void add(HCUserDO hcUserDO);

	int getCount();

}
