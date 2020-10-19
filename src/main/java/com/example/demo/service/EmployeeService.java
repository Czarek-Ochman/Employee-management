package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@NoArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addingEmployee(EmployeeBuilder employeeBuilder) {
        Person person = new Person(employeeBuilder.getFirstName(), employeeBuilder.getLastName(), employeeBuilder.getAge(),
                new Address(employeeBuilder.getCountry(), employeeBuilder.getCity(), employeeBuilder.getStreet(), employeeBuilder.getZipCode()));
        Employee employee = new Employee();
        if (employeeBuilder.getId() == null) {
            employee = new Employee(person, employeeBuilder.getBonus(), employeeBuilder.getSection());
        } else {
            person.setId(employeeBuilder.getId());
            person.getAddress().setId(employeeBuilder.getId());
            employee = new Employee(employeeBuilder.getId(), person, employeeBuilder.getBonus(), employeeBuilder.getSection());
        }
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public String getEmployeeForEdited(Long id, Model model) {
        try {
            Employee employeeById = employeeRepository.findById(id).get();
            EmployeeBuilder employeeBuilder = new EmployeeBuilder();
            model.addAttribute("newEmployee", employeeBuilder);
            model.addAttribute("oldEmployee", employeeById);
            model.addAttribute("mode", "edited");
        } catch (NoSuchElementException e) {
            System.out.println("Wrong ID!");
        }
        return "editEmployee";
    }

    public String editedEmployee(EmployeeBuilder employeeBuilder) {
        addingEmployee(employeeBuilder);
        return "redirect:/panel-administratora";
    }

    public String getEmployee(Section section, Model model) {
        List<Employee> allBySection = employeeRepository.findAllBySection(section);
        String title = getSection(section);
        model.addAttribute("title", title);
        model.addAttribute("allBySection", allBySection);
        return "listEmployee";
    }

    private String getSection(Section section) {
        String word = "Incorrect data!";
        switch (section) {
            case IT:
                word = "Dział IT";
                break;
            case SALES:
                word = "Dział Sprzedaży";
                break;
            case CONTROL:
                word = "Dział kontroli";
                break;
            case LABORATORY:
                word = "laboratorium";
                break;
            case PRODUCTION:
                word = "Dział produkcji";
                break;
        }
        return word;
    }
}