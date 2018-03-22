package com.cd.hc.service.impl;

import com.cd.hc.dao.mapper.biz.HCUserBizMapper;
import com.cd.hc.dao.mapper.db.HCUserDOMapper;
import com.cd.hc.dao.model.db.HCUserDO;
import com.cd.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zuti on 2018/3/22.
 * email zuti@centaur.cn
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private HCUserDOMapper hcUserDOMapper;

	@Autowired
	private HCUserBizMapper hcUserBizMapper;

	@Override
	public void add(HCUserDO hcUserDO) {
		hcUserDOMapper.insert(hcUserDO);
	}

	@Override
	public int getCount() {
		return hcUserBizMapper.getCount();
	}
}
