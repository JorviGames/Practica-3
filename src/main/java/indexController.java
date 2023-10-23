
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yorvi
 */
@Controller
public class indexController {
    
    @RequestMapping("/")
    public String page(Model model){
        model.addAttribute("attribute", "Value");
        return "index";
    }
    
}
