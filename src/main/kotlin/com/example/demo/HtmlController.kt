package com.example.demo

import org.springframework.ui.Model
import org.springframework.ui.set

//org.springframework.ui.set is the extension function able to write model["title"] = "Blog" instead of model.addAttribute("title", "Blog").

class HtmlController {

    fun blog(model: Model): String {
        model["title"] = "Blog Spring"
        return "blog"
    }
}