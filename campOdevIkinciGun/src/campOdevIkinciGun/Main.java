package campOdevIkinciGun;

public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp(1, "C# Kampı", 35);
		Camp camp2 = new Camp(2, "Java Kampı", 42);
		Camp camp3 = new Camp(3, "Temel Programlama", 17);
		
		Camp[] camps = {camp1,camp2,camp3};
		for (Camp camp : camps) {
			System.out.println(camp.campName);
		}
		System.out.println("----");
		
		Student student1 = new Student(1, "Mert Topçu", "mert.29@hotmail.com");
		Student student2 = new Student(2, "Ali Veli", "0555 000 0000");
		
		Student[] students = {student1,student2};
		for (Student student : students) {
			System.out.println(student.studentName);
		}
		System.out.println("----");
		
		CampManager campManager = new CampManager();
		campManager.addToCamp(camp2);
		System.out.println("----");
		campManager.removeToCamp(camp1);
	}

}
