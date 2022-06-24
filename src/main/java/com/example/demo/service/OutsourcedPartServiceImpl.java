package com.example.demo.service;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.repositories.OutsourcedPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 4/30/2022
 * Time: 2:47 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class OutsourcedPartServiceImpl implements OutsourcedPartService{
    private OutsourcedPartRepository partRepository;

    @Autowired
    public OutsourcedPartServiceImpl(OutsourcedPartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<OutsourcedPart> findAll() {
        return (List<OutsourcedPart>) partRepository.findAll();
    }

    @Override
    public OutsourcedPart findById(int theId) {
        Long theIdl=(long)theId;
        Optional<OutsourcedPart> result = partRepository.findById(theIdl);

        OutsourcedPart thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        }
        else {
            // we didn't find the employee
            //throw new RuntimeException("Did not find part id - " + theId);
            return null;
        }

        return thePart;
    }

    @Override
    public void save(OutsourcedPart thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }

}
