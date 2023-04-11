package org.koreait.controllers.members;

import org.koreait.models.member.MemberDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/member/login")
public class LoginController {

    @GetMapping
    public String login(String success, Model model) {
        // 로그인한 회원정보

        model.addAttribute("success", success);
        return "member/login";
    }
}
