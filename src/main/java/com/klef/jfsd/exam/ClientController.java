package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {
    
    // 1. Display a simple greeting message
    @RequestMapping("/welcome")
    public String showGreeting() {
        return "greeting"; // This will render a JSP named "greeting.jsp"
    }
    
    // 2. Render a JSP file named "test"
    @RequestMapping("/test")
    public String showTestPage() {
        return "test"; // This will render a JSP named "test.jsp"
    }
    
    // 3. Display ID and name parameters in a view (JSP file)
    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo"; // This will render a JSP named "showInfo.jsp"
    }
    
    // 4. Perform arithmetic operations and display the result
    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "calculateSum"; // This will render a JSP named "calculateSum.jsp"
    }
    
    // 5. Display an Employee Form
    @RequestMapping("/employeeForm")
    public String showEmployeeForm() {
        return "employeeForm"; // This will render a JSP named "employeeForm.jsp"
    }
    
    // 6. Take two values from the URL and print their sum in JSP
    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "addNumbers"; // This will render a JSP named "addNumbers.jsp"
    }
    
    // 7. Combine two string values
    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("combined", combined);
        return "combine"; // This will render a JSP named "combine.jsp"
    }
    
    // 8. Perform addition and multiplication of two values
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate"; // This will render a JSP named "calculate.jsp"
    }
}
