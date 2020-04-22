package com.brainmentors.apps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.brainmentors.apps.models.Question;

@Repository
public class QuestionDAO implements QuestionQueries{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public String addQuestion(Question question) {
		int result = jdbcTemplate.update(ADD_SQL,question.getName(), question.getOptionA(),
				question.getOptionB(),question.getRans(), question.getScore());
		return result>0?"Question Added ":"Question Not Added";
		
	}
	
	public Question findById(int id) {
		Question questionObject = jdbcTemplate.queryForObject(SELECT_BY_ID, new Object[]{id},new QuestionRowMapper());
		return questionObject;
	}
	
	public List<Question> getAllQuestions(){
		return jdbcTemplate.query(SELECT_SQL, new QuestionRowMapper());
	}
	
	public String remove(int id) {
		int result = jdbcTemplate.update(DELETE_SQL, id);
		return result>0?"Record Deleted":"Record Not Deleted";
		
	}
	
	// Create Update Function
}

class QuestionRowMapper implements RowMapper<Question>{

	@Override
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Question question = new Question();
		question.setId(rs.getInt("id"));
		question.setName(rs.getString("name"));
		question.setOptionA(rs.getString("optiona"));
		question.setOptionB(rs.getString("optionb"));
		question.setRans(rs.getString("rans"));
		question.setScore(rs.getInt("score"));
		return question;
	}
	
}