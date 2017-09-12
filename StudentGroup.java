import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	Scanner sc=new Scanner(System.in);
	
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents(){
	
students=Student.Student(100,Rajesh,17/04/1996,23.9);
//students=Student.Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
try
{
if(students==NULL)
throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
		return students;
	}

	@Override
	public void setStudents(Student[] students){
		// Add your implementation here

//int index=sc.nextInt();
int index=2;
if(index<0&&index>=student.lenth)
try
{
throw new IllegalArgumentException;
}
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}


}

	@Override
	public Student getStudent(int index)
{
		// Add your implementation here
   String student=Student.Student(100,Rajesh,17/04/1996,23.9);
//String student[]=Student.Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		//return student;
if(students==NULL||index<0&&index>=student.lenth)
try
{
throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[index]=student;

	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
   String student=Student.Student(100,Rajesh,17/04/1996,23.9);
//String student[]=Student.Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
if(students==NULL||index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[index].append(student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
if(students==NULL||index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[students.length-1]=student;


	}

	@Override
	public void addLast(Student student)
{
		// Add your implementation here
//int index=sc.nextInt();
int index=2;
if(students==NULL||index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[index].delete(student);

	}

	@Override
	public void add(Student student, int index)

if(student==NULL)
try
{
throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
System.out.println("Student not exist");
//ile.printStackTrace();
}
if(index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[index]=student;
}

	@Override

	public void remove(int index)
{

if(student==NULL)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
System.out.println("Student not exist");
//ile.printStackTrace();
}
if(index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
students[index].delete(student);


	}

	@Override
	public void remove(Student student)
{
		
if(students==NULL||index<0&&index>=student.lenth)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
for(int i=1;i<students.lenth;i++)
students[i].delete(student);

	}

	@Override
	public void removeFromIndex(int index) {
if(students==NULL)
try
{

throw new IllegalArgumentException;
 }
catch(IllegalArgumentException ile)
{
ile.printStackTrace();
}
for(int i=0;i<index;i++)
students[i].delete(student);
for(int i=students.length-1;i>index;i++)
students[i].delete(student);

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
public static void main(String args[])
{
StudentGroup sg=new StudentGroup();
}

}
