package com.ibm.training.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.training.model.Movie;
import com.ibm.training.model.Theatre;

@Repository
public class AdminDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void movieInsert(Movie mv) {
		jdbcTemplate.update("insert into movie values (?,?,?,?)", mv.getM_id(),
				mv.getM_name(),mv.getM_date(),mv.getM_time());
	}
	
	public void movieDelete(String id) {
		jdbcTemplate.update("delete from movie where m_id=?",id);
	}
	
	public void theatreInsert(Theatre t) {
		jdbcTemplate.update("insert into theatre (t_id,t_name,seat_id,m_id)values (?,?,?,?)", t.getT_id(),t.getT_name(),t.getSeat_id(),t.getM_id());
	}
	
	public List<Theatre> fetchAllTheater() {

		return jdbcTemplate.query("select * from theatre", new BeanPropertyRowMapper<Theatre>(Theatre.class));
	}  
	
	  
	
	public List<Movie> fetchAllMovie(){
		return jdbcTemplate.query("select * from movie", new BeanPropertyRowMapper<Movie>(Movie.class));
	}
	public void updateMovie(Movie m) {
		jdbcTemplate.update("update movie set m_name=?,m_date=?,m_time=? where m_id=?",m.getM_name(),m.getM_date(),m.getM_time(),m.getM_id());
	}
	public void  updateTheatre(Theatre th) {
		jdbcTemplate.update("update theatre set t_name=?, seat_id=? where t_id=? ",th.getT_name(), th.getSeat_id(),
				th.getT_id());
	}  
}
