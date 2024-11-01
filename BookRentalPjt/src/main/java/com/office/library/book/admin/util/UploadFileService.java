package com.office.library.book.admin.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {
	
	public String upload(MultipartFile file) {
		
		boolean result = false;
		
		//파일 저장
		String fileOriName = file.getOriginalFilename();
		String fileExtnesion = 
				fileOriName.substring(fileOriName.lastIndexOf("."), fileOriName.length());
		String uploadDir = "C:\\library\\upload\\";
		
		UUID uuid = UUID.randomUUID();
		String uniqueName = uuid.toString().replaceAll("-", "");
		
		File saveFile = new File(uploadDir + "\\" + uniqueName + fileExtnesion);
		
		if (!saveFile.exists())
			saveFile.mkdirs();
		
		try {
			file.transferTo(saveFile);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (result) {
			System.out.println("[UploadFileService] FILE UPLOAD SECCESS!!");
			return uniqueName + fileExtnesion;
			
		} else {
			System.out.println("[UploadFileService] FILE UPLOAD FAIL!!");
			return null;
		}
		
		
		
	}

}
