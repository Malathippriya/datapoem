package com.assessment2.datapoem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assessment2.datapoem.project;
import com.assessment2.datapoem.projectRepository;

@Service
public class projectService 
{
	@Autowired
    private projectRepository repo;
	
	public List<project> listAll() {
        return repo.findAll();
    }
     
    public void save(project project) {
        repo.save(project);
    }
     
    public project get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}