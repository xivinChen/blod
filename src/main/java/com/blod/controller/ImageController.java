package com.blod.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.blod.utils.FastDFSClient;
import com.blod.utils.JsonUtils;




/**
 * 
 * @ClassName:  ImageController   
 * @Description:图片上传Controller   
 * @author: xivin 
 * @date:   2019年3月8日 上午8:57:04   
 * 
 *     ps:kindEdit  最好支持text/json 格式  否则会出现浏览器兼容问题
 *     因此，本例子中的文件上传返回的是text/json
 *     
 * @Copyright: 2019 www.xivin.com Inc. All rights reserved. 
 * 注意：本内容仅限于xivin科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
@Controller
public class ImageController {

	
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	//,produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8"
	@RequestMapping(value="pic/upload",produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	@ResponseBody
	private String fileUpload(MultipartFile uploadFile)  {
		//创建FastDFS服务器
		//System.out.println("图片上传接口");
		FastDFSClient fastDFSClient=null;
		Map map=new HashMap();
		try {
			//System.out.println("jinlaile");
			fastDFSClient = new FastDFSClient("classpath:conf/client.conf");
		
		//上传文件
		String originalName=uploadFile.getOriginalFilename();
		String extName=originalName.substring(originalName.lastIndexOf(".")+1);
		String path = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
		//返回json格式
		System.out.println(IMAGE_SERVER_URL+path);
		map.put("error", 0);
		map.put("url", IMAGE_SERVER_URL+path);
		String result = JsonUtils.objectToJson(map);
		return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println("yichang");
			e.printStackTrace();
			map.put("error", 1);
			map.put("message", "图片上传失败");
			String result = JsonUtils.objectToJson(map);
			return result;
			//return JsonUtils.objectToJson(map);
		}
		
	}
	
	
}
