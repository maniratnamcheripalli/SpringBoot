package com.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String get() {
		return "home";
	}

	@RequestMapping("/save")
	public String save(@RequestParam("name") String name, @RequestParam("age") int age) {
		try {
			File f = new File("Form.pdf");
			f.createNewFile();

			PrintWriter pw = new PrintWriter(f);
			pw.println(name);
			pw.println(age);
			pw.flush();
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "home";

	}

}
