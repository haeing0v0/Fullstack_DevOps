package org.cloud.dto;

import lombok.Data;

@Data
public class FileDTO {

	private int fileIdx;
	private int boardId;
	private String originalFileName;
	private String storedFilePath;
	private long fileSize;
	private String creatorId;
}
