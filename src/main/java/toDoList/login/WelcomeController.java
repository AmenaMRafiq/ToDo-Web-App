package toDoList.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@SessionAttributes("name")
public class WelcomeController {
  
//@RequestMapping(value = "/login")
//@ResponseBody //instead of looking for a view, give this body response
//public String sayHello() {
//  return "Hello World";
//}
//  
//  @Autowired
//  LoginService service;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String showLoginPage(ModelMap model) {
    model.put("name", retrieveLoggedInUserName());
    return "welcome"; 
  }
  
  private String retrieveLoggedInUserName() {
    Object principal = SecurityContextHolder.getContext()
        .getAuthentication().getPrincipal();
    if (principal instanceof UserDetails)
      return ((UserDetails) principal).getUsername();

    return principal.toString();
  }
  
//  @RequestMapping(value = "/login", method = RequestMethod.POST)
//  public String handleUserLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {
//    
//    if(!service.isUserValid(name, password)) {
//      model.put("errorMessage", "Invalid credentials");
//      return "login";
//    }
//    
//    model.put("name", name);
//    model.put("passsword", password);
//    return "welcome"; 
//  }
}