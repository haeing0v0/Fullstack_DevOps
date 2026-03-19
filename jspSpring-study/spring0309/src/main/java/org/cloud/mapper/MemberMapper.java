package org.cloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.dto.MemberInfoDTO;

@Mapper
public interface MemberMapper {

	List<MemberInfoDTO> MemberList() throws Exception;
	int writeMember(MemberInfoDTO member) throws Exception;
	MemberInfoDTO memberDetail(String id);
    void updateMember(MemberInfoDTO member);
    void deleteMember(String id);
}
