package com.traderec.repository;
import org.springframework.data.repository.CrudRepository;

import com.traderec.model.Recs;
public interface RecsRepository extends CrudRepository<Recs, Integer>
{
}
