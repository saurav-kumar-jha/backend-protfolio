package com.protofolio.Client.data.Controller;

import com.protofolio.Client.data.ClientDTO.clientEntity;
import com.protofolio.Client.data.Exception.GlobalException;
import com.protofolio.Client.data.Service.clientService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@Slf4j
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private clientService clientservice;

    @GetMapping("/user")
    public List<clientEntity> getAll(){
        return clientservice.getAllEntry();
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveAll(@RequestBody @Validated clientEntity myEntity){
        clientservice.saveAll(myEntity);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            clientservice.deleteById(id);
            return ResponseEntity.noContent().build();
        }catch (GlobalException e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
