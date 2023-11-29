package com.Spring.MyWebApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.Spring.MyWebApplication.model.Contact;

@Controller
public class HomeController {
	
	@Autowired
	ContactRepo repo;
	
	@RequestMapping("home")
	public String home()
	{
		System.out.println("hi");
		return "home.jsp";
	}
	@PostMapping("/addContact")
	public String addContact(Contact data,Model model) {
//		System.out.println(firstName +" "+ lastName+" " + email);
//		 if (phone_number.matches(".*[a-zA-Z].*") || phone_number.length() != 10) {
//		        model.addAttribute("error", "Invalid phone number. Please enter a 10-digit number.");
//		        return "error.jsp";
//		    }
//		model.addAttribute("firstName",firstName);
//		model.addAttribute("lastName",lastName);
//		model.addAttribute("phone_number", phone_number);
//		model.addAttribute("email",email);
		repo.save(data);
		
//		 model.addAttribute("firstName", data.getFirstName());
//	        model.addAttribute("lastName", data.getLastName());
//	        model.addAttribute("phone_number", data.getPhone_number());
//	        model.addAttribute("email", data.getEmail());
		return "sucess.jsp";
	}
	@GetMapping("/allContacts")
	public String getAllContacts(Model model) {
		List<Contact> contacts = repo.findAll();
		model.addAttribute("data", contacts);
		return "allContacts.jsp";
	}
	
	

}
