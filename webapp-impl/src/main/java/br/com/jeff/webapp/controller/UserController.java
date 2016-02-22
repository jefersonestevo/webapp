package br.com.jeff.webapp.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.jeff.webapp.model.User;
import br.com.jeff.webapp.service.UserService;

import javax.inject.Inject;
import java.util.List;

@Controller
public class UserController {

    @Inject
    private UserService userService;

    @Inject
    private Result result;

    public void list() {
        result.include("users", userService.listAll());
    }

    @Post
    public void add(User user) {
        userService.addUser(user);

        result.forwardTo(this).list();
    }

}
