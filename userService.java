package com.assessment2.datapoem;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment2.datapoem.user;
import com.assessment2.datapoem.userRepository;

@Service
public class userService {

	@Autowired
    private userRepository repo;
	
	public List<project> listAll() 
	{
		System.out.println(repo.findAll());
        return repo.findAll();
    }
     

    public void save(user std) {
        repo.save(std);
    }
     
    public user get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
