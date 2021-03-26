package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Size(min = 1, max = 85)
    @NotBlank
    private String location;

    public String getLocation() {
        return location
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){}

}
