package students.data.processing;

import org.xml.sax.SAXException;
import xml.parser.Student;
import xml.parser.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"       Grade= B
		 * Student (id= 2) "Israt" "Khan"      Grade= A
		 * Student (id= 3) "Mohi" "Uddin"      Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= C
		 * .................................................
		 * 
		 * 
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"\\src\\xml\\reader\\selenium.xml";
				String pathQtp = System.getProperty("user.dir") + "\\src\\xml\\reader\\qtp.xml";
				String tag = "id";
				//Declare a Map with List<String> into it.

				Map<String, List<Student>> map = new HashMap<String, List<Student>>();
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */

				List<Student> SeleniumStudents = new ArrayList<>();
				List<Student> QtpStudents = new ArrayList<>();

				//Create XMLReader object.
				XmlReader read = new XmlReader();

				//Parse Data using parseData method and then store data into Selenium ArrayList.
				SeleniumStudents = read.parseData(tag, pathSelenium);

				//Parse Data using parseData method and then store data into Qtp ArrayList.
				QtpStudents = read.parseData(tag, pathQtp);

				//add Selenium ArrayList data into map.
				map.put("Selenium", SeleniumStudents);

				//add Qtp ArrayList data into map.
				map.put("QTP", QtpStudents);
		
		      	
				//Retrieve map data and display output.

				Iterator<Map.Entry<String, List<Student>>> ite = map.entrySet().iterator();
				while (ite.hasNext()){
					Map.Entry pair = (Map.Entry) ite.next();
					System.out.println(pair.getKey()+  ":"  + pair.getValue() + "\n");
				}
			}

}
