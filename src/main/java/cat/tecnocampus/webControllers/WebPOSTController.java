package cat.tecnocampus.webControllers;

import cat.tecnocampus.controllers.ClassroomController;
import cat.tecnocampus.domain.Classroom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class WebPOSTController {

    private ClassroomController classroomController;


    public WebPOSTController(ClassroomController classroomController) {
        this.classroomController = classroomController;
    }


    @GetMapping("/newClass")
    public String createClassroom(Model model) {
        System.out.println("Holaaaaaa");
        model.addAttribute("clr", new Classroom());
        System.out.println("Holaaaaaa2");
        return "classroomForm";
    }

    @PostMapping("/newClassroom")
    //See Errors error parameters: it takes the errors from the validators. It MUST be right after the parameters
    public String createClassroom(@Valid @ModelAttribute("clr") Classroom clr, Errors errors, Model model, RedirectAttributes redirectAttributes) {


        if (errors.hasErrors()) {
            model.addAttribute("clr", clr);

            return "/newClass";
        }

        model.addAttribute("name", clr.getName());

        classroomController.insert(clr);

        redirectAttributes.addAttribute("name", clr.getName());

        return "redirect:/classrooms/{name}";
    }
}
