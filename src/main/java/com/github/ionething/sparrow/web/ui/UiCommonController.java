package com.github.ionething.sparrow.web.ui;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UiCommonController {

    @GetMapping("/{moduleName}/{pageName}.html")
    public String uiCommonPage(@PathVariable String moduleName, @PathVariable String pageName,
                               HttpServletRequest request, Model model) {
        System.out.println(request.getRequestURI());
        model.addAttribute("viewPath", moduleName + "/" + pageName);
        return "common/template";
    }
}
