package javanew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamQues1 {

	public static void main(String[] args) {
ArrayList<String> ls=new ArrayList<>();
ls.add("Hello");
ls.add("Interview");
ls.add("Questions");
ls.add("Answers");
ls.stream().forEach(System.out::println);
	}

}
