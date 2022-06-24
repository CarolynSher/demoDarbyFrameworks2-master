package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Project: demo
 * Package: com.example.demo.domain
 * <p>
 * User: carolyn.sher
 * Date: 4/29/2022
 * Time: 10:48 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part{
String companyName;

    public OutsourcedPart() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
