
public class project12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String pnt = "this is !!!!";
		//
		//
		// String a2="another string";
		// int sizeofstring= pnt.length();
		//
		// char pntchar=pnt.charAt(4);
		// System.out.println(pnt.charAt(1));
		// int at=pnt.indexOf('t');
		//
		// String adding=pnt+" "+a2;
		// String adding1=pnt.concat(a2);
		// System.out.println(adding);
		// System.out.println(adding1);
		// System.out.println(at);
		//
		// char a1='a';
		// int a3=1;
		//
		// int b1=a1+a3;
		//
		// System.out.println("this is a1 "+b1);
		// System.out.println("this is a3 "+a3);
		//
		// System.out.println(a1);
		// System.out.println(a2);
		//
		// System.out.println(sizeofstring);
		//
		// String p1;
		// p1 = "this is second string!!!";
		//
		//
		//
		// System.out.println(pnt);
		//
		// System.out.println(p1);

		// p1 = "this is new string!!!";

		// System.out.println(p1);

		String c1 = "People nTech";
		String c2 = "People ntechtech";
		
		System.out.println(c1.toUpperCase());
		System.out.println(c1.toLowerCase());
		
		System.out.println(c2.startsWith(c1));
		
		System.out.println("contains function"+c2.contains("People"));
		
		System.out.println("this is replace character only  "+c1.replace('T', 'n'));
		
		System.out.println("this is replace ALL function "+c1.replaceAll("Tech", "People"));
		
		System.out.println("this is replace funxtion  "+c2.replace("tech", "People"));
		
		System.out.println("this is replace FIRST function   "+c2.replaceFirst("tech", "People"));
		
		System.out.println(c1.compareTo(c2));
		
		
		String aaa="";
		
		System.out.println(aaa.trim());
		
		
		System.out.println("this is isempty function   "+aaa.isEmpty()+aaa.length());
		
	
	
		String subofc1=c1.substring(0, 6);
		String c3=c1.substring(6);
		
		
		
		System.out.println(subofc1);
		
		System.out.println(c3);
		System.out.println(c1.equals(c2));
		

		System.out.println(c1.equalsIgnoreCase(c2));
		
		
		

	}

}
