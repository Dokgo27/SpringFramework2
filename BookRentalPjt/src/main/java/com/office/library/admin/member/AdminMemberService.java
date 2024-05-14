package com.office.library.admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminMemberService {
	
	@Autowired
	AdminMemberDao adminMemberDao;
	
	final static public int ADMIN_ACCOUNT_ALREADY_EXIST = 0;
	final static public int ADMIN_ACCOUNT_CREATE_SUCCESS = 1;
	final static public int ADMIN_ACCOUNT_CREATE_FAIL = -1;
	
	public int createAccountConfirm(AdminMemberVo adminMemberVo) {
		
		System.out.println("[AdminMemberService] createAccountConfirm()");
		
		boolean isMember = adminMemberDao.isAdminMember(adminMemberVo.getA_m_id());
		
		if(!isMember) {
			int result = adminMemberDao.insertAdminAccount(adminMemberVo);
			
			if(result > 0)
				return ADMIN_ACCOUNT_CREATE_SUCCESS;
			else
				return ADMIN_ACCOUNT_CREATE_FAIL;
		} else {
			return ADMIN_ACCOUNT_ALREADY_EXIST;
		}
		
	}
	
	public AdminMemberVo loginConfirm(AdminMemberVo adminMemberVo) {
		System.out.println("[AdminMemberService] loginConfirm()");
		
		AdminMemberVo loginedAdminMemberVo = adminMemberDao.selectAdmin(adminMemberVo);
		
		if (loginedAdminMemberVo != null)
			System.out.println("[AdminMemberService] ADMIN MEMBER LOGIN SUCCESS!!");
		else
			System.out.println("[AdminMemberService] ADMIN MEMBER LOGIN FAIL!!");
		
		return loginedAdminMemberVo; // login 이 제대로 안됨 --> null 값이 날라감, 잘됨 --> 그 해당 유저 정보값이 날라감
		
	}
	
}
