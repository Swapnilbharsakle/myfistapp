package com.example.demo;

import java.util.Scanner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SwitchCaseController {

    @GetMapping("/switch-case")
    public String switchCase(@RequestParam(name = "month", required = false, defaultValue = "0") int month, Model model) {
        String monthString = null;
        
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            case 0:
                monthString = "exited";
                break;
            default:
                monthString = "Enter Correct Number";
        }

        model.addAttribute("output", monthString);
        return "switch-case";
    }
}

