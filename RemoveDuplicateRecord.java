package com.test.linkedhasset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/**
*
*/
public class RemoveDuplicateRecord {
	static List<UserVO> an = new ArrayList<UserVO>();
	static List<UserVO> bn = new ArrayList<UserVO>();

	public static List<UserVO> testMethod() {
		UserVO userVO1 = new UserVO();
		userVO1.setCode("CODE1");
		userVO1.setId("ID1");
		userVO1.setUsername("Test1");
		an.add(userVO1);
		UserVO userVO2 = new UserVO();
		userVO2.setCode("CODE2");
		userVO2.setId("ID2");
		userVO2.setUsername("Test2");
		an.add(userVO2);
		UserVO userVOBn = new UserVO();
		userVOBn.setCode("CODEBn1");
		userVOBn.setId("IDBn1");
		userVOBn.setUsername("Testbn1");
		bn.add(userVOBn);
		UserVO userVOBn1 = new UserVO();
		userVOBn1.setCode("CODE2");
		userVOBn1.setId("IDBn2");
		userVOBn1.setUsername("Testbn2");
		bn.add(userVOBn1);
		List<UserVO> grpusers = new ArrayList<UserVO>();
		List<UserVO> grpusrs = new ArrayList<UserVO>();

		grpusers.addAll(an);
		grpusers.addAll(bn);
		// Removing Duplicates
		grpusrs.addAll(new LinkedHashSet<>(grpusers));
		return grpusrs;
	}

	public static void main(String[] args) {
		System.out.println(testMethod());
	}
}
class UserVO {
	private String code;
	private String id;
	private String username;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final UserVO other = (UserVO) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return code.hashCode();
	}

}
