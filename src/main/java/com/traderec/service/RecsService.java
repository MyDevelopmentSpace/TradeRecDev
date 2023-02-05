package com.traderec.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traderec.model.Recs;
import com.traderec.repository.RecsRepository;
//defining the business logic
@Service
public class RecsService 
{
@Autowired
RecsRepository recsRepository;

public List<Recs> getAllRecs() 
{
List<Recs> recs = new ArrayList<Recs>();
List<Recs> result = new ArrayList<Recs>();
//return All records
	recsRepository.findAll().forEach(recs1 -> recs.add(recs1));

//return only records belongs to ASIA region
	result = recs.stream().filter(recs1 -> recs1.getRecRegion().equals("UK")).collect(Collectors.toList());
//return only records taxAmount greater than 1000
	//result = recs.stream().filter(recs1 -> recs1.getTaxAmount()>1000).collect(Collectors.toList());
//return only records RecName Starts with GDS
	//result = recs.stream().filter(recs1 -> recs1.getRecName().contains("GDS")).collect(Collectors.toList());
//double filter return only records RecRegion is UK and taxAmount greater than 1000
	//result = recs.stream().filter(recs1 -> recs1.getRecName().contains("GDS")).filter(recs1 -> recs1.getTaxAmount()>1000).collect(Collectors.toList());
return result;
}

public Recs getRecsById(int id) 
{
return recsRepository.findById(id).get();
}

public void saveOrUpdate(Recs recs) 
{
	recsRepository.save(recs);
}

public void delete(int id) 
{
	recsRepository.deleteById(id);
}

public void update(Recs recs, int recid) 
{
	recsRepository.save(recs);
}

}