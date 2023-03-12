package je.panse.doro.samsara.i2frame.consoleTextArea;

public class ReturnAreaForm {
	public static String returnList(String panelName) {
		String text="";
		switch(panelName) {
			case ("CCPIROS") :
				text = "[Enter]\n\t" +
			      "--------------------------------\n\t" +
			      "[ 1 ] New Patient\n\t" +
			      "[ 2 ] SOAP\n" +
			      "[ 3 ] Disease Category\n\t" +
			      "[ 4 ] Item\n\t" +
			      "-------------------------------\n\t";
				return text;
			case ("PMHSUJOBJ"):
				text = "[SOAP]\n" +
					"------------------------------\n" +
					" [ 1 ] Chief complaint\n" +
					"	[ 11 ] Present illness\n" +
					"	[ 12 ] Symptom\n" +
					"	[ 13 ] ROS\n" + 
					" [ 2 ] Past Medical History\n\n" +
					" [ 3 ] Subjective Complaint\n" +
					" [ 4 ] Objective Findings\n" +
					" [ 5 ] Laboratory Test\n\n" +
					" [ 6 ] Assessment\n" + 
					" [ 7 ] Plan\n\n" +
					" [ 10 ] Disease follow-up\n\n" +
					"------------------------------\n";
					return text;
			case ("ASSESSPLAN"):
				text = "[ASSESSPLAN]\n" +
					"------------------------------\n" +
					" [ 1 ] Chief complaint\n" +
					"	[ 11 ] Present illness\n" +
					"	[ 12 ] Symptom\n" +
					"	[ 13 ] ROS\n" + 
					"------------------------------\n";
					return text;
			case ("OTHER"):
				text = "[OTHER]\n" +
					"------------------------------\n" +
					" [ 1 ] Chief complaint\n" +
					" [ 2 ] Past Medical History\n\n" +
					" [ 3 ] Subjective Complaint\n" +
					" [ 4 ] Objective Findings\n" +
					" [ 5 ] Laboratory Test\n\n" +
					" [ 6 ] Assessment\n" + 
					" [ 7 ] Plan\n\n" +
					" [ 10 ] Disease follow-up\n\n" +
					"------------------------------\n";
					return text;
			default:
			}
     	return null;
	}
}