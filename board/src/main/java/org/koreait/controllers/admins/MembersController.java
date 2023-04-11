package org.koreait.controllers.admins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/member")
public class MembersController {
    @GetMapping
    public String index(Model model) {

        model.addAttribute("pageTitle", "회원관리");
        model.addAttribute("menuCode", "member");

        return "admin/member/index";
    }
}
