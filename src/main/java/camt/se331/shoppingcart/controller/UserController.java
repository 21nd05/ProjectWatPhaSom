package camt.se331.shoppingcart.controller;

import camt.se331.shoppingcart.entity.Role;
import camt.se331.shoppingcart.entity.User;
import camt.se331.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pan on 5/14/2016.
 */
@RestController
@RequestMapping("/")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "customer",method = RequestMethod.GET)
    public List<User> list(){
        return userService.getUsers();
    }

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public  List<User> findUserByUsername (@RequestParam("name")String name){return userService.getUsersByName(name);}

    @RequestMapping(value = "customer/{id}",method = RequestMethod.GET)
    public  User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "customer/{id}",method = RequestMethod.PUT)
    public  User changeRole(@PathVariable("id") Long id) {
        User user  = userService.getUser(id);
        Role customerRole = new Role("Wholesale Customer");
        Set<Role> roles = new HashSet<>();
        roles.add(customerRole);
        user.setRoles(roles);
        return userService.updaterUser(user);
    }

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public @ResponseBody
    User add(@RequestBody User user, BindingResult bindingResult){
        return userService.addUser(user);
    }

}
