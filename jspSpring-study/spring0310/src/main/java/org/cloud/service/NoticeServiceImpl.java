package org.cloud.service;

import java.util.List;

import org.cloud.dto.NoticeDTO;
import org.cloud.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<NoticeDTO> noticeList() throws Exception {
		return noticeMapper.noticeList();
	}
	
	@Override
	public int insertNotice(NoticeDTO notice) throws Exception {
		noticeMapper.insertNotice(notice);
		return 0;
	}
	
	@Override
	public NoticeDTO noticeDetail(int num) throws Exception {
		NoticeDTO notice = noticeMapper.noticeDetail(num);
		return notice;
	}
	
	@Override
	public void updateHit(int id) throws Exception {
	    noticeMapper.updateHit(id);
	}
	
	@Override
	public int updateNotice(NoticeDTO notice) throws Exception {
		return noticeMapper.updateNotice(notice);
	}
	
	@Override
	public int deleteNotice(int id) throws Exception {
		return noticeMapper.deleteNotice(id);
	}
}
