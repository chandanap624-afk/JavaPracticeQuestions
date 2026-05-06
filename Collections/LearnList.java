package com.wipro.Java.Collections;


//***Example for ArrayList***//

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<Learner> learnerslist = new ArrayList<Learner>();

		Learner l1 = new Learner();
		l1.setName("siri");

		Learner l2 = new Learner();
		l2.setName("vani");
		l2.setVideo("On");

		Learner l3 = new Learner();
		l3.setName("Pravalli");
		l3.setVideo("On");
		l3.setMic("On");

		learnerslist.add(l1);
		learnerslist.add(l2);
		learnerslist.add(l3);
		
		
				
		
		for (Learner obj : learnerslist) {
			System.out.println(obj.getName() + "\n" + obj.getMic() + "\n_____________________");
			

		}
		
		}


	}





