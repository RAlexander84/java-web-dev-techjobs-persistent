package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 1, max = 250)
    @NotBlank(message = "skill description required")
    private String skillDescription;

//    @ManyToMany(mappedBy = "skills")
//    private List<Job> jobs=new ArrayList<>();

    public String getSkillDescription() {
        return skillDescription;
    }

//    public List<Job> getJobs() {
//        return jobs;
//    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Skill (){}
}