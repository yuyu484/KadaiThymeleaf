package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        // 入力画面を表示する際に、previousの値をモデルに追加
        if (previous != null) {
            model.addAttribute("previous", previous);
        }
        return "input"; // 入力画面(input.html)を返す
    }
}


