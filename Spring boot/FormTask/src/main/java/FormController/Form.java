package FormController;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form {

	@RequestMapping("/")
	public String form() {
		System.out.println("Hello");
		return "form";

	}

	@RequestMapping("/save")
	public void save(@RequestParam("name") String name, @RequestParam("age") int age) {
		try {
			File f = new File("Form.txt");
			f.createNewFile();

			PrintWriter pw = new PrintWriter(f);
			pw.println(name);
			pw.println(age);
			pw.flush();
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
