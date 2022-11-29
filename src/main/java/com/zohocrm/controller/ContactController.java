package com.zohocrm.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	
//	@Autowired
//	private ContactService contactService;
	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService=contactService;
	}
	
	
	@RequestMapping("/listContact")
	public String listAllContact(Model model) {
		
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contact", contacts);
		return "list_contact";
		
	}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,Model model) {
		Contact contact = contactService.getContactById(id);
		
		model.addAttribute("contact", contact);
		return "contact_info";
	
		
	}
	

}
