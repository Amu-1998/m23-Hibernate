package com.cg.service;

import com.cg.dao.CollegeDao;
import com.cg.dao.CollegeDaoImpl;
import com.cg.entities.College;

public class CollegeServiceImpl implements CollegeService{
private CollegeDao dao;
	
	public CollegeServiceImpl() {
		super();
		dao=new CollegeDaoImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollegeByid(int Id) {
		College college=dao.searchCollegeByid(Id);
		return college;
	}

	@Override
	public boolean deleteCollege(int Id) {
		dao.beginTransaction();
		boolean res=dao.deleteCollege(Id);
		dao.commitTransaction();
		return res;
	}

}
