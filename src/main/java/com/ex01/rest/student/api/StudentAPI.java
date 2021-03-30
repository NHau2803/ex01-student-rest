package com.ex01.rest.student.api;

import com.ex01.module.student.dto.StudentInformationDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Student")
@RestController
@RequestMapping("/ex01")
public class StudentAPI {

    private Logger logger = LoggerFactory.getLogger(StudentAPI.class);

    @ApiOperation(value = "This is an example of Rest API Endpoint")
    @ApiResponses(value = { @ApiResponse(code = 200, response = String.class, message = "Success") })
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        StudentInformationDTO dto = new StudentInformationDTO();
        dto.setId("6062e3bbf82bd943902ad9d5");
        logger.info("StudentAPI: {}", dto);
        return "test";
    }




}
