package com.example.demo.service;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.repositories.InhousePartRepository;
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
 * Time: 3:25 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class InhousePartServiceImpl implements InhousePartService {
    private InhousePartRepository partRepository;

    @Autowired
    public InhousePartServiceImpl(InhousePartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<InhousePart> findAll() {
        return (List<InhousePart>) partRepository.findAll();
    }

    @Override
    public InhousePart findById(int theId) {
        Long theIdl=(long)theId;
        Optional<InhousePart> result = partRepository.findById(theIdl);

        InhousePart thePart = null;

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
    public void save(InhousePart thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }

}
