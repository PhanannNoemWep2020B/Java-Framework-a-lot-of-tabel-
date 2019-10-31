package System.out;

public class exercises1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercisess1
		String word = "programing";
		String word1 = "homeword";
		String word2 = "marker";
		String keyword = " is the first half of ";
		System.out.println(word.substring(0, word.length() / 2) + keyword + word);
		System.out.println(word1.substring(0, word1.length() / 2) + keyword + word1);
		System.out.println(word2.substring(0, word2.length() / 2) + keyword + word2);
		
		//exercisess2
		String a = "welcome";
		String first = a.substring(0,4);
		String meduim = a.substring(4,7);
		String last = meduim.toUpperCase();
		String result = first + last;
		System.out.println("From welcome to " + result);
		
		//exercisess3
		String website = "www.google.com/";
		String world1 = "web2020";
		String world2 = " doesn't end with /";
		if(website.contains("/")) {
			System.out.println(website + world1 );
		}else {
			System.out.println(website + world2);
		}
		
		//exercisess4
		String sentence = "this is the most common way";
		char key = 'o';
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == key) {
				count++;
			}
		}
		System.out.println("There are " + count + " letter o in This is the most common way.");
		
		//exercisess5
		String sentence1 = "This is the most common way of creating string";
		String homework = sentence1.replace("string", "STRING");
		
		System.out.println(homework);
	}
}
