package org.gdupt.service;

import org.gdupt.bean.Pet;
import org.gdupt.dao.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author czy
 * @create 2021-08-09 14:31
 */
@Service
public class PetService {

    @Autowired
    PetMapper petMapper;

    public List<Pet> queryAllPet() {
        return petMapper.queryAllPet();
    }

    public Pet getPetById(Integer id){

        return petMapper.getPetById(id);
    }

}
