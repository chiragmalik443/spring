package com.brainmentors.apps.models;

public class Question {
private int id;
private String name;
private String optionA;
private String optionB;
private String rans;
private int score;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOptionA() {
	return optionA;
}
public void setOptionA(String optionA) {
	this.optionA = optionA;
}
public String getOptionB() {
	return optionB;
}
public void setOptionB(String optionB) {
	this.optionB = optionB;
}
public String getRans() {
	return rans;
}
public void setRans(String rans) {
	this.rans = rans;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", optionA=" + optionA + ", optionB=" + optionB + ", rans=" + rans
			+ ", score=" + score + "]";
}


}
