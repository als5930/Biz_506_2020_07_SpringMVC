package com.biz.blog.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.biz.blog.model.BlogVO;

@Service
public class BlogService {

	private String blogFile= "blog.txt";
	
	public void selectAll() {
		ClassPathResource rs = new ClassPathResource(blogFile);
		Path path= null;
		
		try {
			path =Paths.get(rs.getURI());
			List<String> blogList = Files.readAllLines(path);
			
			for(String str : blogList) {
				System.out.println(str);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	// java 1.8이상에서만 정상작동 되는 코드
	public void insert(BlogVO blogVO) {
		
		// Service의 class 들이 저장되는 폴더 정보가져오기
		ClassPathResource rs = new ClassPathResource(blogFile); 
		Path path=null; 
		BufferedWriter buffer =null;
		FileWriter fileWriter = null;
		PrintWriter print =null;
		try {
			path = Paths.get(rs.getURI());
			fileWriter= new FileWriter(path.toString(),true);
			print =new PrintWriter(fileWriter);
			
			String strBlog = String.format("%s:%s:%s");
			blogVO.getUser();
			blogVO.getTitle();
			blogVO.getUser();
			
			print.println(strBlog);
			print.flush();
			print.close();
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
