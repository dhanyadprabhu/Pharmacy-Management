package com.cognizant.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.entity.ManageUser;
import com.cognizant.project.entity.Medicines;
import com.cognizant.project.service.PharmacyService;

@Controller
public class PharmaController {
	@Autowired
	PharmacyService pharmacyService;
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Medicines medicine = new Medicines();
		theModel.addAttribute("medicine", medicine);
		return "addMedicine1";
	}

	@PostMapping("/saveMedicine")
	public String saveMedicine(@Valid @ModelAttribute("medicine") Medicines theMedicine,
			BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "addMedicine1";
		}
		pharmacyService.saveOrUpdate(theMedicine);
		return "main-page";

	}

	@GetMapping("/list")
	public String listMedicines(Model theModel) {
		List<Medicines> medicines = pharmacyService.getAllMedicines();
		theModel.addAttribute("medicines", medicines);

		return "medicine-list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("medicineId") int theId, Model theModel) {
		Medicines theMedicine = pharmacyService.getMedicines(theId);
		theModel.addAttribute("medicine", theMedicine);
		return "addMedicine1";
	}

	@GetMapping("/delete")
	public String deleteMedicine(@RequestParam("medicineId") int theId) {
		pharmacyService.deleteMedicine(theId);
		return "redirect:/list";
	}

	@PostMapping("/findbyid")
	public String findByid(@RequestParam("search") String medicineId, Model theModel) {
		int medid = Integer.parseInt(medicineId);
		Medicines medicines = pharmacyService.findMedicines(medid);
		if (medicines == null) {
			throw new RuntimeException("No product of this id");
		}
		theModel.addAttribute("medicines", medicines);

		return "search-list";

	}
	@GetMapping("/logout")
	public String logout() {
		
		return "login";
	}

	@ExceptionHandler(value = RuntimeException.class)
	public String exceptionHandler() {
		return "myException-handler-page";
	}
}
