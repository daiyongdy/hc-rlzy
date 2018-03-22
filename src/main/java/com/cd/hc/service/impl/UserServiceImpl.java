package com.cd.hc.service.impl;

import com.cd.hc.dao.mapper.HCUserDOMapper;
import com.cd.hc.dao.model.po.HCUserDO;
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

	@Override
	public void add(HCUserDO hcUserDO) {
		hcUserDOMapper.insert(hcUserDO);
		int i = 1 / 0;
	}
}
