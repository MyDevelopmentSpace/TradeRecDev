package com.traderec.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traderec.model.Recs;
import com.traderec.service.RecsService;

//mark class as Controller
@RestController
public class RecsController 
{

@Autowired
RecsService recsService;

@GetMapping("/rec")
private List<Recs> getAllRecs() 
{
return recsService.getAllRecs();
}

@GetMapping("/rec/{recid}")
private Recs getRecs(@PathVariable("recid") int recid) 
{
return recsService.getRecsById(recid);
}

@DeleteMapping("/rec/{recid}")
private void deleteRec(@PathVariable("recid") int recid) 
{
	recsService.delete(recid);
}

@PostMapping("/recs")
private int saveRec(@RequestBody Recs recs) 
{
	recsService.saveOrUpdate(recs);
	return recs.getRecId();
}

@PutMapping("/recs")
private Recs update(@RequestBody Recs recs) 
{
	recsService.saveOrUpdate(recs);
	return recs;
}

}
