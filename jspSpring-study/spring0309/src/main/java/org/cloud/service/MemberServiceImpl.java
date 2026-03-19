package org.cloud.service;

import java.util.List;

import org.cloud.dto.MemberInfoDTO;
import org.cloud.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public List<MemberInfoDTO> memberList() throws Exception {
		return memberMapper.MemberList();
	}
	
	@Override
	public int writeMember(MemberInfoDTO member) throws Exception {
		memberMapper.writeMember(member);
		return 0;
	}
	
	@Override
	public MemberInfoDTO memberDetail(String id) {
	    return memberMapper.memberDetail(id);
	}

	@Override
	public void updateMember(MemberInfoDTO member) {
	    memberMapper.updateMember(member);
	}

	@Override
	public void deleteMember(String id) {
	    memberMapper.deleteMember(id);
	}
}
