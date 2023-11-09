class Stringope
{
	public static void main(String args[])
	{
		String str = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
		String str1 = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";
		String clg = "ChristUniversity";
		String s1 = "EFGHIJK";
		char ch = str.charAt(170);
		System.out.println("The CharAt is: "+ch);
		System.out.println("The ComapareTo is: "+str.compareTo(str1));
		System.out.println("The concat is: "+str.concat("Im a TATA Product"));
		System.out.println("The contains is: "+str.contains("the surrounding villages"));
		System.out.println("The endswith is: "+str.endsWith("o"));
		System.out.println("The endswith is: "+str.endsWith("."));
		System.out.println("The equals() is: "+str.equals(str1));
		System.out.println("The equalsIgnoreCase() is: "+str.equalsIgnoreCase(str1));
		System.out.println("The format() is: "+str.format("The college name is %s",clg));
		byte[] by = s1.getBytes();
		for(int i = 0; i < by.length; i++)
		{
			System.out.println(by[i]);
		}
		String str2 = new String("Hello Christ University");
		char[] c = new char[10];
		str2.getChars(6, 16, c, 0);
		System.out.println(c);
		System.out.println("The indexOf() is: "+str.indexOf("w"));
		
		//intern()
		String s7 = new String("hello");
		String s8 = "hello";
		String s9 = s7.intern();
		System.out.println(s8==s9);
		
		//isempty()
		System.out.println(str.isEmpty());
		
		String joinString1=String.join("-","welcome","to","Christ");
		System.out.println(joinString1);  
		
		int index1 = s1.lastIndexOf('E');
		System.out.println(index1);
		
		System.out.println("The length is: "+str.length());
		
		String reString=s1.replace('E','A');
		System.out.println(reString);  
		
		String repString=str.replaceAll("o","e");
		System.out.println(repString); 
		
		String[] word = str.split("\\s");
		for(String w:word)
		{
			System.out.println(w);
		}
		System.out.println(str.startsWith("We realizes"));
		System.out.println("Substring: "+str.substring(2,100));
		
		String s10="Bangalore";  
		char[] ch8=s10.toCharArray();  
		for(int i=0;i<ch8.length;i++){  
		System.out.println(ch8[i]);  
		}
		
		String s1lower = s1.toLowerCase();
		System.out.println(s1lower);
		
		String s1upp = s1.toUpperCase();
		System.out.println(s1upp);
		
		String a = "Christ University";
		System.out.println("Trim is: "+a.trim()+"University");
		
		int v = 100;
		String strr = String.valueOf(v);
		System.out.println(s1+10);
	}
}