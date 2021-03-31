package com.ex01.rest.student.api;

import com.ex01.module.student.dto.StudentInformationCreateDTO;
import com.ex01.module.student.dto.StudentInformationDTO;
import com.ex01.module.student.model.StudentInformationModel;
import com.ex01.module.student.service.StudentService;
import com.ex01.module.student.utils.domain.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Student")
@RestController
@RequestMapping("/ex01")
public class StudentAPI {

    @Autowired
    private StudentService studentService;

    private Logger logger = LoggerFactory.getLogger(StudentAPI.class);

    @ApiOperation(value = "This is an example of Rest API Endpoint")
    @ApiResponses(value = { @ApiResponse(code = 200, response = String.class, message = "Success") })
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        StudentInformationDTO dto = new StudentInformationDTO();
        dto.setId("6062e3bbf82bd943902ad9d5");
       // studentService.delete("6062e3bbf82bd943902ad9d5");
        logger.info("StudentAPI: {}", dto);
        return "test";
    }

    @ApiOperation(value = "This is an example of Rest API Endpoint")
    @ApiResponses(value = { @ApiResponse(code = 200, response = String.class, message = "Success") })
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestBody(required=false) StudentInformationCreateDTO request){
        StudentInformationCreateDTO datas = studentService.add(request);
        JsonResponse jsonResponse = new JsonResponse(datas, true);
        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
    }

    @ApiOperation(value = "This is an example of Rest API Endpoint")
    @ApiResponses(value = { @ApiResponse(code = 200, response = String.class, message = "Success") })
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<?> update(@RequestBody(required=false) StudentInformationDTO request){
        StudentInformationModel datas = studentService.update(request);
        JsonResponse jsonResponse = new JsonResponse(datas, true);
        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
    }

    @ApiOperation(value = "This is an example of Rest API Endpoint")
    @ApiResponses(value = { @ApiResponse(code = 200, response = String.class, message = "Success") })
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable String id){
        boolean success = studentService.delete(id);
        JsonResponse jsonResponse = new JsonResponse(success);
        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
    }


}
