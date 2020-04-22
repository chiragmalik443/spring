package com.brainmentors.apps.dao;

public interface QuestionQueries {
	String ADD_SQL = "insert into questions (name, optiona, optionb,rans, score) values(?,?,?,?,?)";
	String SELECT_SQL = "select id, name, optiona, optionb, rans, score from questions where status='A'";
	String DELETE_SQL = "delete from questions where id=?";
	String SELECT_BY_ID = "select id , name, optiona, optionb, rans , score from questions where id=?";
	// Add Update Query
}
