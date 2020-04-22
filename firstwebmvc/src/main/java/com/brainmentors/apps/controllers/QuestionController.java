package com.brainmentors.apps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.brainmentors.apps.dao.QuestionDAO;
import com.brainmentors.apps.models.Question;

@Controller
public class QuestionController {
	@Autowired
	private QuestionDAO questionDAO;
	
	

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}
	
	// Create RequestMapping for Update , Call DAO 
	
	@RequestMapping(path = "/editquestion", method =  RequestMethod.GET)
	public String editQuestionById(@RequestParam("qid") int id, Model model) {
			Question question = questionDAO.findById(id);
			model.addAttribute("questionModel",question);
			List<Question> list = questionDAO.getAllQuestions();
			model.addAttribute("updateflag","E");
			model.addAttribute("questions", list);
			return "question";
			//return "redirect:/question";
	}
	
	@RequestMapping(path = "/deletequestion",method = RequestMethod.GET)
	public String deleteQuestionById(@RequestParam("qid") int id, Model model) {
		//  JDBC Call
		// Remaining Questions
		// Question Set in Model and then move to question.jsp
		System.out.println("Question Id in delete is "+id);
		String msg = questionDAO.remove(id);
		model.addAttribute("questionModel",new Question());
		model.addAttribute("msg",msg);
		return "redirect:/question";
	}


	@RequestMapping(path = "/question",method = RequestMethod.GET)
	public String showQuestionAddScreen(@ModelAttribute("questionModel") Question question, Model model) {
		model.addAttribute("questionModel", new Question());
		List<Question> list = questionDAO.getAllQuestions();
		model.addAttribute("questions", list);
		return "question";
	}
	
	@RequestMapping(path = "/addquestion",method = RequestMethod.POST)
	public String addQuestionInDB(@ModelAttribute("questionModel") Question question, Model model) {
		System.out.println("Question Coming "+question);
		String message = questionDAO.addQuestion(question);
		List<Question> list = questionDAO.getAllQuestions();
		model.addAttribute("questions", list);
		model.addAttribute("msg",message);
		//model.addAttribute("questionModel", new Question());
		return "redirect:/question";
	}
}
