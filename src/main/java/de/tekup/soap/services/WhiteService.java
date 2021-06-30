package de.tekup.soap.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import de.tekup.soap.models.whitetest.Address;
import de.tekup.soap.models.whitetest.Exam;
import de.tekup.soap.models.whitetest.Student;
import de.tekup.soap.models.whitetest.StudentExamen;
import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;

@Service
public class WhiteService {
	
	public WhiteTestResponse getStatus (StudentRequest studentRequest)
	
	{
		Address a1 =new Address("aa","aaa",17);
		
		Exam e1=new Exam("111","java",false);
		Student s1 =new Student();
		s1.setAddress(a1);
		s1.setId(1);
		s1.setName("sami");
		
		
		StudentExamen studentExam = new StudentExamen();
		
		studentExam.getListesStudents().add(s1);
		studentExam.getListesExamens().add(e1);
		
		
		WhiteTestResponse whiteTestResponse=new WhiteTestResponse();
		List<String> erors = whiteTestResponse.getBadRequest();
		boolean verifStudent =false;
		boolean verifExamen =false;
		Student studentrecupere=null;
		Exam examenrecupere=null;
		Date d=new Date();
		
		for (Student stu : studentExam.getListesStudents()) {
			if(stu.getId() == studentRequest.getStudentId()) {
				verifStudent=true;
				studentrecupere=stu;
				break;
			}
			
		}
		if(verifStudent == false)
		{
			erors.add("id student not exist");
		}
		
		for (Exam exa : studentExam.getListesExamens()) {
			if(exa.getCode().equalsIgnoreCase(studentRequest.getExamCode())) {
				verifExamen=true;
				examenrecupere=exa;
				break;
			}
			
		}
		if(verifExamen == false)
		{
			erors.add("code examen not exist");
		}
		
		if(erors.isEmpty()) {
			whiteTestResponse.setStudent(studentrecupere);
			whiteTestResponse.setExam(examenrecupere);
			whiteTestResponse.setDate(d);
			
		}
		
		return whiteTestResponse;
	}
	
	/*
	public StudentExamen listesExamens(Student student)
	{
		//
		Exam e1=new Exam("111","java",true);
		Exam e2=new Exam("222","bbb",false);
		Exam e3=new Exam("333","ccc",true);
		
       StudentExamen studentExam = new StudentExamen();
		
		
		studentExam.getListesExamens().add(e1);
		studentExam.getListesExamens().add(e2);
		studentExam.getListesExamens().add(e3);
		//
		StudentExamen studentExamenDisponible = new StudentExamen() ;
	   List<Exam>listesExamensDisponibles = new ArrayList<>();
		
		
		
		for (Exam exa : studentExam.getListesExamens()) {
			if(exa.isDisponibility()==true)
			{
				listesExamensDisponibles.add(exa);
			}
			
		}
		studentExamenDisponible.setListesExamens(listesExamensDisponibles);
		studentExamenDisponible.setListesStudents(null);
		
		return studentExamenDisponible;
	}
*/

}
