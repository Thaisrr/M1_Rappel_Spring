package fr.m1iii.rappel.controller;

import fr.m1iii.rappel.entity.User;
import fr.m1iii.rappel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    @ResponseBody
    private List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/one")
    @ResponseBody
    private User getById(@RequestParam long id ) {
        return userService.findById(id);
    }

    @GetMapping("/one_bis/{id}")
    @ResponseBody
    private User getByIdBis(@PathVariable long id ) {
        return userService.findById(id);
    }

    @PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
    @ResponseBody
    private User save(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    @ResponseBody
    private User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping(value = "delete_id")
    @ResponseBody
    private String deleteById(@RequestParam long id) {
        return userService.deleteById(id);
    }


    @DeleteMapping(value = "delete")
    @ResponseBody
    private String delete(@RequestBody User user) {
        return userService.delete(user);
    }

}
