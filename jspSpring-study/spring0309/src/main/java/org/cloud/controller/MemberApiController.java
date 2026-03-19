package org.cloud.controller;

import java.util.List;

import org.cloud.dto.MemberInfoDTO;
import org.cloud.service.MemberService;
import org.cloud.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/member")
public class MemberApiController {

	private final MemberServiceImpl memberServiceImpl;
	
	@Autowired
	private MemberService memberService;
	
	MemberApiController(MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}
	
	@GetMapping
	public List<MemberInfoDTO> openMemberList() throws Exception {
		return memberService.memberList();
	}
	
	@PostMapping("/write")
	public ResponseEntity<String> writeMember(@RequestBody MemberInfoDTO member) throws Exception {
		try {
			memberService.writeMember(member);
			return ResponseEntity.ok("success");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Fail:"+e.getMessage());
		}
	}
	
	@GetMapping("/{id}")
	public MemberInfoDTO memberDetail(@PathVariable("id") String id) throws Exception {
		return memberService.memberDetail(id);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<String> updateMember(@PathVariable("id") String id, @RequestBody MemberInfoDTO member) throws Exception {
		member.setId(id);
		memberService.updateMember(member);
		return ResponseEntity.ok("success");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMember(@PathVariable("id") String id) throws Exception {
		memberService.deleteMember(id);
		return ResponseEntity.ok("success");
	}
}
