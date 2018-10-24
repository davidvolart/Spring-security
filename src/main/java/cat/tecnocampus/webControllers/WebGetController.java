package cat.tecnocampus.webControllers;

import cat.tecnocampus.controllers.ClassroomController;
import cat.tecnocampus.domain.Classroom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebGetController {
    private final ClassroomController classroomController;

    public WebGetController(ClassroomController classroomController) {
        this.classroomController = classroomController;
    }

    @GetMapping("classrooms")
    public String listClassrooms(Model model) {
        model.addAttribute("classroomList", classroomController.findAll());
        return "classrooms";
    }

    @GetMapping("classrooms/{name}")
    public String showClassroom(@PathVariable String name, Model model) {
        model.addAttribute("classroom", classroomController.getClassroom(name));
        return "showClassroom";
    }

}
