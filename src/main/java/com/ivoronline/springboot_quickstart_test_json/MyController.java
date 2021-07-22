package com.ivoronline.springboot_quickstart_test_json;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //=======================================================================
  // DESERIALIZE
  //=======================================================================
  @RequestMapping("/Deserialize")
  public String deserialize(@RequestBody RequestDTO requestDTO) {
    return requestDTO.name + " is " + requestDTO.age + " years old";
  }

  //=======================================================================
  // SERIALIZE
  //=======================================================================
  @RequestMapping("/Serialize")
  public ResponseDTO serialize() {

    //CREATE RESPONSE DTO
    ResponseDTO responseDTO      = new ResponseDTO();
                responseDTO.name = "John1";
                responseDTO.age  = 20;

    //RETURN RESPONSE DTO
    return responseDTO;

  }

}
