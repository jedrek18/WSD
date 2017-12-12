package com.mkyong.stock.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkyong.util.CustomHibernateDaoSupport;

@Repository("clientDao")
public class ClientDaoImpl extends CustomHibernateDaoSupport implements ClientDao{}