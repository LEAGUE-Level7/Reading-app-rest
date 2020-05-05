package org.llamas.readingapp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/download")
public class DownloadTest {
	
	private static final String EXTERNAL_FILE_PATH = "./Books/";

	@RequestMapping("/file/{bookName:.+}/{fileName:.+}")
	public void downloadBookResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName, @PathVariable("bookName") String bookName) throws IOException {
		System.out.println(EXTERNAL_FILE_PATH + bookName + "/" + fileName);
		File file = new File(EXTERNAL_FILE_PATH + bookName + "/" + fileName);
		if (file.exists()) {
			System.out.println("yuhhh");
			//get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				//unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			 //Here we have mentioned it to show as attachment
			 //response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) file.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

			FileCopyUtils.copy(inputStream, response.getOutputStream());

		}
	}
	
	
	@RequestMapping("/file/{bookName:.+}/{pages:.+}/{pageName:.+}/{fileName:.+}")
	public void downloadPageResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("bookName") String bookName, @PathVariable("pages") String pages, @PathVariable("pageName") String pageName, @PathVariable("fileName") String fileName) throws IOException {
		System.out.println(EXTERNAL_FILE_PATH + bookName + "/" + pages + "/" + pageName + "/" + fileName);
		File file = new File(EXTERNAL_FILE_PATH + bookName + "/" + pages + "/" + pageName + "/" + fileName);
		if (file.exists()) {
			System.out.println("yuhhh");
			//get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				//unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			 //Here we have mentioned it to show as attachment
			 //response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) file.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

			FileCopyUtils.copy(inputStream, response.getOutputStream());

		}
	}
	
}
