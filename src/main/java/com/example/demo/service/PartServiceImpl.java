package com.example.demo.service;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 4/21/2022
 * Time: 1:50 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PartServiceImpl implements PartService{
        private PartRepository partRepository;

        @Autowired

    public PartServiceImpl(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<Part> findAll() {
        return (List<Part>) partRepository.findAll();
    }
    public List<Part> listAll(String keyword){
        if(keyword !=null){
            return partRepository.search(keyword);
        }
        return (List<Part>) partRepository.findAll();
    }
    @Override
    public Part findById(int theId) {
        Long theIdl=(long)theId;
        Optional<Part> result = partRepository.findById(theIdl);

        Part thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find part id - " + theId);
        }

        return thePart;
    }

    @Override
    public void save(Part thePart) {
            partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }
}
