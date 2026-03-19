package org.cloud.service;

import java.util.List;

import org.cloud.dto.MemberInfoDTO;

public interface MemberService {

	List<MemberInfoDTO> memberList() throws Exception;
	int writeMember(MemberInfoDTO member) throws Exception;
	MemberInfoDTO memberDetail(String id);
	void updateMember(MemberInfoDTO member);
	void deleteMember(String id);
}
