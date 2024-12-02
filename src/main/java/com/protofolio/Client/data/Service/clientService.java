package com.protofolio.Client.data.Service;

import com.protofolio.Client.data.ClientDTO.clientEntity;
import com.protofolio.Client.data.Exception.GlobalException;
import com.protofolio.Client.data.Repo.clientRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class clientService {

    @Autowired
    private clientRepository clientrepository;

    public List<clientEntity> getAll(){
        List<clientEntity> ClientEntity = clientrepository.findAll();

        if (ClientEntity.isEmpty()){
            throw new GlobalException("User not exist!!!!");
        }else {
            return ClientEntity;
        }
    }

    public List<clientEntity> getAllEntry(){
        return clientrepository.findAll();
    }

    public void saveAll(clientEntity cliententity){
       clientrepository.save(cliententity);
    }

    @Transactional
    public void deleteById(Long id) throws GlobalException {
        if (clientrepository.existsById(id)){
            clientrepository.deleteById(id);
        }else {
            throw new GlobalException("Failed to delete..");
        }
    }


}
