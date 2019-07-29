package kr.green.spring.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	public static String uploadFile(String uploadPath, String originalName, byte[] 	
			fileData)throws Exception{
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString() +"_" + originalName;
		//업로드 날짜를 기준으로 파일 경로를 추가
		String savedPath = calcPath(uploadPath);
		File target = new File(uploadPath + savedPath, savedName);
		FileCopyUtils.copy(fileData, target);
		//
		String uploadFileName = makeIcon(uploadPath, savedPath, savedName);
		return uploadFileName;
	}
	//private인데  static이 붙는 이유는 위에 메소드에서 static이 붙었기 때문에  static은  static만 불러올수 있어서 ?
	private static String calcPath(String uploadPath) {
		Calendar cal = Calendar.getInstance();//지금날짜가져옴
		
		
		//File.separator 현재운영체제에맞는 구분자선택해서 넣어줌, 운영체제마다구분자가다름 
		// /2019
		String yearPath = File.separator+cal.get(Calendar.YEAR);
		// /2019/07
		String monthPath = yearPath + File.separator 
            + new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
		// /2019/07/29
		String datePath = monthPath + File.separator 
            + new DecimalFormat("00").format(cal.get(Calendar.DATE));
		//폴더생성
		makeDir(uploadPath, yearPath, monthPath, datePath);
		
		return datePath;
 
	}
	//String... paths :  
	private static void makeDir(String uploadPath, String... paths) {
		if(new File(uploadPath + paths[paths.length-1]).exists())
			//paths[paths.length-1]마지막번지에엤는 datePath가 존재하면 =>해당날자의폴더가 있으면 
			return;
		for(String path : paths) {
			File dirPath = new File(uploadPath + path);
			if( !dirPath.exists())
				dirPath.mkdir();
		}
	}
	private static String makeIcon(String uploadPath, String path, String fileName)
        	throws Exception{
		String iconName = uploadPath + path + File.separator + fileName;
		return iconName.substring(uploadPath.length()).replace(File.separatorChar, '/');
	}
}
