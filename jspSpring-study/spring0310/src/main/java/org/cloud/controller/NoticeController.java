package org.cloud.controller;

import java.util.List;

import org.cloud.dto.NoticeDTO;
import org.cloud.service.NoticeService;
import org.cloud.service.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	NoticeService noticeService;
    
    @GetMapping("/list")
	public String openNoticeList(Model model) throws Exception {
		List<NoticeDTO> list = noticeService.noticeList();
		model.addAttribute("list", list);
		
		return "noticeList";
	}
    
    @GetMapping("/write")
	public String openNoticeWrite() throws Exception {
		return "noticeWriteUI";
	}
	
	@PostMapping("/write")
	public String insertNotice(NoticeDTO notice) throws Exception {
		noticeService.insertNotice(notice);
		return "redirect:/notice/list";
	}
	
	@GetMapping("/detail")
	public String noticeDetail(@RequestParam("id") int id, Model model) throws Exception {
	    noticeService.updateHit(id);
	    NoticeDTO notice = noticeService.noticeDetail(id);
	    model.addAttribute("notice", notice);
	    return "noticeDetail";
	}
	
	@GetMapping("/update")
	public String openNoticeUpdate(@RequestParam("id") int id, Model model) throws Exception {
	    NoticeDTO notice = noticeService.noticeDetail(id);
	    model.addAttribute("notice", notice);
	    return "noticeUpdate";
	}
	
	@PostMapping("/update")
	public String updateNotice(NoticeDTO notice) throws Exception {
	    noticeService.updateNotice(notice);
	    return "redirect:/notice/detail?id=" + notice.getId();
	}
	
	@GetMapping("/delete")
	public String deleteNotice(@RequestParam("id") int id) throws Exception {
	    noticeService.deleteNotice(id);
	    return "redirect:/notice/list";
	}
}
