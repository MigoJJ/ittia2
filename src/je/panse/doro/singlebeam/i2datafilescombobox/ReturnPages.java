package je.panse.doro.singlebeam.i2datafilescombobox;

public class ReturnPages {
	public static String mainEnter() {
		String text = "[Enter]\n" +
                  "--------------------------------\n" +
                  "[ 1 ] New Patient\n" +
                  "[ 2 ] SOAP\n" +
                  "[ 3 ] Disease Category\n" +
                  "[ 4 ] Item\n" +
                  "-------------------------------\n";
    return text;
	}
	
	public static String emrSOAP() {
		String text = "[SOAP]\n" +
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
	}
}