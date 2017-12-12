package com.mkyong.stock.bo.impl;

import com.mkyong.stock.dao.impl.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("clientBo")
public class ClientBoImpl{
	
	@Autowired
	ClientDao clientDato;

}
