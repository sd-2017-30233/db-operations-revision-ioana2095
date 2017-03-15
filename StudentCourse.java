/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ioana
 */
public class StudentCourse {
    public static void main(String[] args) throws SQLException, IOException {
        ArrayList<String> str = new ArrayList<String>();
        int op;
       StudentInfo s=new StudentInfo();
       CourseInfo c=new CourseInfo();
       StudentEnroll se=new StudentEnroll();
       do
	{
		System.out.println("Menu:");
		System.out.println(" 1 - Insert student");
		System.out.println(" 2 - Update student");
		System.out.println(" 3 - Delete student");
		System.out.println(" 4 - Insert course");
		System.out.println(" 5 - Update course");
		System.out.println(" 6 - Delete course");
		System.out.println(" 7 - Add student to courses");
		System.out.println(" 8 - View student info");
		System.out.println(" 9 - View course info");
		System.out.println(" 10 - View students of one course");
		System.out.println("Option: ");
                Scanner scanner = new Scanner (System.in);
		op = Integer.parseInt(scanner.next());
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		switch (op)
		{
			case 1:
                            System.out.println("Id_Student");
                            int id=Integer.parseInt(scanner.next());
                            System.out.println("Nume");
                            String nume=reader.readLine();
                            System.out.println();
                            System.out.println("Data nasteri y/m/d");
                            String bdate=scanner.next();
                            System.out.println("Adreasa str.NumeStrada nr.NumarCasa jud. Judetul");
                            String adresa=reader.readLine();
			    s.InsertStudent(id, nume,bdate, adresa);
				break;
			case 2:
			    System.out.println("Id_Student");
                            id=Integer.parseInt(scanner.next());
                            System.out.println("Nume");
                            nume=reader.readLine();
                            System.out.println();
                            System.out.println("Data nasteri y/m/d");
                            bdate=scanner.next();
                            System.out.println("Adreasa str.NumeStrada nr.NumarCasa jud. Judetul");
                            adresa=reader.readLine();
			    s.UpdateStudent(id, nume,bdate, adresa);
				break;
			case 3:
		            System.out.println("Id_Student");
                            id=Integer.parseInt(scanner.next());
                            s.DeleteStudent(id);
				break;
			case 4:
			    System.out.println("Id_Courses");
                            id=Integer.parseInt(scanner.next());
                            System.out.println("Nume");
                            nume=reader.readLine();
                            System.out.println("Teacher");
                            bdate=scanner.next();
                            System.out.println("Yearofstudy");
                            int Yearofstudy=Integer.parseInt(scanner.next());
			    c.InsertCourse(id, nume,bdate, Yearofstudy);
				break;
			case 5:
			    System.out.println("Id_Courses");
                            id=Integer.parseInt(scanner.next());
                            System.out.println("Nume");
                            nume=reader.readLine();
                            System.out.println("Teacher");
                            bdate=scanner.next();
                            System.out.println("Yearofstudy");
                            Yearofstudy=Integer.parseInt(scanner.next());
			    c.UpdateCourse(id, nume,bdate, Yearofstudy);
				break;
			case 6:
			    System.out.println("Id_Courses");
                            id=Integer.parseInt(scanner.next());
                            c.DeleteCourse(id);
				break;
			case 7:
			    System.out.println("Nume");
                            nume=reader.readLine();
                            int n=System.in.read();
                            for(int i=0;i<n;i++)
                            {
                                str.add(nume=reader.readLine());
                            }
                            se.InsertCourse(nume,str );
				break;
			case 8:
			    System.out.println("Nume");
                            nume=reader.readLine();
                            se.ViewStudentInfo(nume);
				break;
			case 9:
			    System.out.println("Nume");
                            nume=reader.readLine();
                            se.ViewCoursesInfo(nume);
				break;
			case 10:
			    System.out.println("Nume");
                            nume=reader.readLine();
                            se.ViewInfo(nume);
				break;
		}
	}
	while (op!=0);
    }
    
}
