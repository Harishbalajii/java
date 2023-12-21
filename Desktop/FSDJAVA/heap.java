public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int digit=0,letter=0;
		
		String str1=s.next();
		char ch[]=str1.toCharArray();
		int consonant;
		int vowel;
		for(int i=0;i<ch.length;i++) {
		 if(Character.isLetter(ch[i]))
			 letter++;
		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
				 ||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U') {
			 vowel++;
		 }
		 else {
			 consonant++;
		 }
		 else if(Character.isDigit(ch[i]))
			 digit++;	 
		 else {
			 special++;
		 }
		}
		System.out.println("Alphabets:"+letter);
		System.out.println("Digit:"+digit);	
		System.out.println("vowel:"+vowel);
		System.out.println("Consonant:"+consonant);
		
	
	}



