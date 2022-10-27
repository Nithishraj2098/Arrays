/*import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//.regex--->import  -->eg..Read the file and get the phone number,email address,etc.,.
//1)Pattern  --> Compiled rep of regular expression-->to understand of jvm
//2)Matcher  -->to match ----interprets the pattern--->(find(),group(),start(),end())
//3)PatternSyntaxException -->UncheckedExecption



public class Regex{
	public static void main(String[] agrs){
		/*Scanner sc=new Scanner("System.in");
		String str="thi pidikka thi pidikka mutham kudu daa ";
		System.out.println("Enter the word to search boss");
		
		Pattern p=Pattern.compile("pidikka");
		Matcher m=p.matcher(str);
		int count=0;
		while(m.find()){
			count++;
			System.out.println(count+" "+m.group()+" Starts at "+m.start()+" Ends at "+m.end());
		}
		String str="thi pidikka thii Hai pidikka 123 mutham kudu daa";
		String str2=str.trim();
		//Pattern p=Pattern.compile("^thi");    //----->   ^ is used to find the given word is 1st or not--^ front of string
		//Pattern p=Pattern.compile("daa$");  //-----> $ is used to find the word is presenfd in last--->$back of string
		//Pattern p=Pattern.compile("t|i|k");   // ---> to check the given charcters into the string---->use | symbol
		//Pattern p=Pattern.compile("[tik]");    // used insted of t|i|k
        //Pattern p=Pattern.compile("[^tik]");         //^ is used in [] as[^_ _ _] used to print expect that input
        //Pattern p=Pattern.compile("[A-Z]");   // to check  whithin the range (or) \\w--->alphanumberic not special char-----\\W-->special char
        //Pattern p=Pattern.compile("[a-zA-Z]"); // used to check all the aphabets
        //Pattern p=Pattern.compile("\\s");    //used to print the space
        //Pattern p=Pattern.compile("\\S");    // used to print without space
        //Pattern p=Pattern.compile("\\d");   //use to print digits-----another [0-9]----\\D ....expect numbers
        //Pattern p=Pattern.compile("\\bthi");   // search by word
        //Pattern p=Pattern.compile("\\bthi\\b");  // search by exact word   \\B in last used not the exact--->\\B in last
        Pattern p=Pattern.compile(".");   // print all
		Matcher m=p.matcher(str);
		while(m.find()){
			//System.out.println("the thi is in frist");
			//System.out.println(" The daa is present in last of string");
			System.out.println(m.group()+" "+" Start at "+m.start());
		}

	} 
}
*/

//quantifers--->?, +,*,{}
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex{
	public static void main(String[] agrs){
		String str="ababaabaabaabbbba";
		//Pattern p=Pattern.compile("a+");     //---> + atleast one element
		//Pattern p=Pattern.compile("a*");      //----> * leaves gap of non chacter ///-->? atmost one match
		Pattern p=Pattern.compile("a{2}");       //----> {} used insed of aa// {1,3}--->given range
		Matcher m=p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" Start @ "+m.start());
		}

	}
}



//used in
   //1)chatboat app
   //2)from filling
   //3)compiler
   //4)TCP/IP
   //Digital circuites
