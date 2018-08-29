package stringpack;

public class Occurence {

	public static void main(String[] args) {
		String s="aabbccddeeeffffgg";
		int l=s.length();
		int count=0;
		int d=0;
		int lofreq=0;
		int hifreq=0;
		for(int i=0;i<l;i++)
		{
			count=0;
			char  c=s.charAt(0);
			for(int j=0;j<l;j++) {
			if(c==s.charAt(j))
			     count++;
			}
			s=s.replace(c+"","");
			d=l-s.length();
			l=l-d;
			if(count>hifreq)
				hifreq=count;
			else
				lofreq=count;
		}

		System.out.println(lofreq);
		System.out.println(hifreq);
	}

}
