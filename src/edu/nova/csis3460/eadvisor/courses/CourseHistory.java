package edu.nova.csis3460.eadvisor.courses;

public class CourseHistory
{
	public Course course = null;
	public String semester = null;
	public Character grade = null;
	public Integer crn = null;
	
	public CourseHistory (Course course, String semester, Character grade, Integer crn)
	{
		course = this.course;
		semester = this.semester;
		grade = this.grade;
		crn = this.crn;
	}
	
	public Course getCourse(){
		return course;
	}
	
	public Character getGrade(){
		return grade;
	}
}
