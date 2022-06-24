package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.repositories.PartRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Project: demo
 * Package: com.example.demo.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/22/2022
 * Time: 11:45 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AddPartController {
    @Autowired
    private ApplicationContext context;

 /*   @GetMapping("/showFormAddPart")
    public String showFormAddPart(Model theModel){
        Part part=new Part();
        theModel.addAttribute("part",part);
        return "partForm";
    }

    @PostMapping("/showFormAddPart")
    public String submitForm(@ModelAttribute("part") Part part, Model theModel){
        theModel.addAttribute("part",part);
        PartService repo=context.getBean(PartServiceImpl.class);
            repo.save(part);
        return "confirmationaddpart";
    }*/
    @GetMapping("/showPartFormForUpdate")
    public String showPartFormForUpdate(@RequestParam("partID") int theId,Model theModel){

        PartService repo=context.getBean(PartServiceImpl.class);
        OutsourcedPartService outsourcedrepo=context.getBean(OutsourcedPartServiceImpl.class);
        InhousePartService inhouserepo=context.getBean(InhousePartServiceImpl.class);

        boolean inhouse=true;
        List<OutsourcedPart> outsourcedParts=outsourcedrepo.findAll();
        for(OutsourcedPart outsourcedPart:outsourcedParts) {
            if(outsourcedPart.getId()==theId)inhouse=false;
        }
        //need logic here to distinguish between an inhouse and outsourced part use the discriminator somehow
        String formtype;
        if(inhouse){
            InhousePart inhousePart=inhouserepo.findById(theId);
            theModel.addAttribute("inhousepart",inhousePart);
            formtype="InhousePartForm";
        }
        else{
            OutsourcedPart outsourcedPart=outsourcedrepo.findById(theId);
            theModel.addAttribute("outsourcedpart",outsourcedPart);
            formtype="OutsourcedPartForm";
        }
        //set the employ as a model attibute to prepopulate the form

        //send over to our form
        return formtype;
    }

    @GetMapping("/deletepart")
    public String deletePart(@Valid @RequestParam("partID") int theId,  Model theModel){
        PartService repo = context.getBean(PartServiceImpl.class);
        Part part=repo.findById(theId);
        if(part.getProducts().isEmpty()){
            repo.deleteById(theId);
            return "confirmationdeletepart";
        }
        else{
            return "negativeerror";
        }



//        }c
    }

}
