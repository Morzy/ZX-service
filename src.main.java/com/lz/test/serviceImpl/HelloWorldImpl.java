package com.lz.test.serviceImpl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.lz.test.model.User;
import com.lz.test.services.HelloWorld;

@WebService(endpointInterface="com.lz.test.services.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

           Map<Integer, User> users = new LinkedHashMap<Integer, User>();


           public String sayHi(String text) {
                       return "Hello " + text;
          }


          public String sayHiToUser(User user) {
                    users.put(users.size()+1, user);
                    return "Hello "+ user.getName();
          }

          public String[] SayHiToUserList(List<User> userList) {
                    String[] result = new String[userList.size()];
                    int i=0;
                    for(User u:userList){
                         result[i] = "Hello " + u.getName();
                         i++;
                    }
            return result;
          }
}