package com.exampleTwo.springlearn.service;

import com.exampleTwo.springlearn.service.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PhoneController {

     private Phone phone;

     @Autowired
     PhoneController(@Qualifier("keyPadPhone") Phone phone)
     {
         this.phone = phone;
     }

     public Phone getPhone() {
          return phone;
     }
}
