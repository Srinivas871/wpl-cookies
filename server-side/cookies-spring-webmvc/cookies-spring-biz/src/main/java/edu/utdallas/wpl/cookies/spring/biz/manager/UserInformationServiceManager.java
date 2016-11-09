package edu.utdallas.wpl.cookies.spring.biz.manager;

import java.util.List;

import edu.utdallas.wpl.cookies.spring.common.dto.UserInformation;

public interface UserInformationServiceManager {

	public UserInformation createUserInformation(UserInformation userInfomation);
	
	public List<UserInformation> getUserInformations();
	
	public UserInformation getUserInformation(Integer id);
	
	public UserInformation updateUserInformation(UserInformation userInfomation);
	
	public void deleteUserInformation(UserInformation userInfomation);
	
	public void deleteUserInformation(Integer id);
}
