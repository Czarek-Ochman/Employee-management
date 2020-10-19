package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagementController {

    private EmployeeService employeeService;

    @Autowired
    public ManagementController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/dodaj-pracownika")
    public String addEmployee(Model model) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        model.addAttribute("employeeBuilder", employeeBuilder);
        model.addAttribute("mode", "addingEmployee");
        return "addEmployee";
    }

    @PostMapping("/dodaj-pracownika")
    public String addingEmployee(EmployeeBuilder employeeBuilder) {
        employeeService.addingEmployee(employeeBuilder);
        return "redirect:/panel-administratora";
    }

    @GetMapping("/edytuj-pracownika")
    public String editEmployee(@RequestParam Long id, Model model) {
        return employeeService.getEmployeeForEdited(id, model);
    }

    @PostMapping("/edytuj-pracownika")
    public String editedEmployee(EmployeeBuilder employeeBuilder) {
        return employeeService.editedEmployee(employeeBuilder);
    }

    @GetMapping("/panel-administratora")
    public String adminPanel() {
        return "adminPanel";
    }

    @GetMapping("/skasuj-pracownika")
    public String deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/panel-administratora";
    }

    @GetMapping("/lista-pracowników-dzial")
    public String listWithEmployee(@RequestParam Section section, Model model) {
        return employeeService.getEmployee(section, model);
    }
}