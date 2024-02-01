package lcs.rubrica.controller;

import lcs.rubrica.model.User;
import lcs.rubrica.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<User> {
}
