package optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoRunUsingOptional {
	
	public static void usingOptional(ArrayList<UserInfo> list) {
		Optional<UserInfo> userInfoOptional = getUserInfoByIdOptional(12345, list);
		
		userInfoOptional.ifPresent(userInfo -> System.out.println("User name found: " + userInfo.getName()));
		
		if (userInfoOptional.isPresent()) {
			System.out.println("User name found: " + userInfoOptional.get().getName());
		} else {
			System.out.println("User not found");
		}
		
		UserInfo nameOrDefault = userInfoOptional.orElse(new UserInfo(00000, "Guest"));
		System.out.println("User Name : " + nameOrDefault.getName());
		
		UserInfo nameOrComputed = userInfoOptional.orElseGet(()->generateDefaultUserInfo());
		System.out.println("User Name : " + nameOrComputed.getName());
	}
	
	public static Optional<UserInfo> getUserInfoByIdOptional(int id, ArrayList<UserInfo> list) {
		
		for (UserInfo userInfo : list) {
			if (id == userInfo.getId()) {
				return Optional.of(userInfo);
			}
		}
		return Optional.empty();
	}
	
	public static UserInfo generateDefaultUserInfo() {
		return new UserInfo(00000, "Guest");
	}

	public static void main(String[] args) {
		ArrayList<UserInfo> userInfoList = new ArrayList<UserInfo>();
		userInfoList.add(new UserInfo(12345, "James"));
		userInfoList.add(new UserInfo(12346, "Tomas"));
		userInfoList.add(new UserInfo(12347, "Edward"));
		
		usingOptional(userInfoList);
	}
}
