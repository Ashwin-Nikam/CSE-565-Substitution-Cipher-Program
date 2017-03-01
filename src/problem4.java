import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class problem4 {
		
		public static void main(String args[]){
		
		String[] mainarr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String plaintext = "But soft what light through yonder window breaks It is the east and Juliet is the sun!  Arise, fair sun, and kill the envious moon, Who is already sick and pale with grief That thou her maid art far more fair than she. Be not her maid, since she is envious; Her vestal livery is but sick and green, And none but fools do wear it. Cast it off. It is my lady, O, it is my love";
		plaintext = plaintext.toLowerCase();
		plaintext = plaintext.replaceAll("[^a-z]","");
		String [] pt = plaintext.split("(?!^)");
		String[] ct = new String[pt.length];
		String[] tt1 = new String[mainarr.length];
		String[] tt2 = new String[mainarr.length];
		
		
		
		//Translation Table 1
		for(int i=0;i<mainarr.length;i++){
			int a = (3*i)%26;
			tt1[i]=mainarr[a];
		}
		System.out.println("Translation Table 1");
		for(int i=0;i<mainarr.length;i++){
			System.out.print(mainarr[i]);
		}System.out.println();
		for(int i=0;i<tt1.length;i++){
			System.out.print(tt1[i]);
		}
		
		
		
		System.out.println("\n");
		
		
		
		//Translational Table 2
		for(int i=0;i<mainarr.length;i++){
			int b = ((5*i)+13)%26;
			tt2[i]=mainarr[b];
		}
		System.out.println("Translation Table 2");
		for(int i=0;i<mainarr.length;i++){
			System.out.print(mainarr[i]);
		}System.out.println();
		for(int i=0;i<tt2.length;i++){
			System.out.print(tt2[i]);
		}
		
		
		
		//Monoalphabetic substitution function
		System.out.println("\n\nMonoalphabetic substitution function");
		for(int i=0;i<pt.length;i++){
			System.out.print(pt[i]);
			int h = Arrays.asList(mainarr).indexOf(pt[i]);
			int j = (3*h)%26;
			ct[i]=mainarr[j];
		}
		System.out.println();
		for(int i=0;i<ct.length;i++){
			System.out.print(ct[i]);
		}
		
		
		//Frequency Distribution 1
		int[] count = new int[mainarr.length];
		System.out.println("\n\nFrequency Distribution for Monoalphabetic substitution function");
		for(int i=0;i<mainarr.length;i++){
			System.out.print(mainarr[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<ct.length;i++){
			int h = Arrays.asList(mainarr).indexOf(ct[i]);
			for(int j=0;j<mainarr.length;j++){
				if(ct[i].equals(mainarr[j])){
					count[h]+=1;
				}
			}
		}
		for(int i=0;i<count.length;i++){
			System.out.print(count[i]+"\t");
		}
		
		
		//Polyalphabetic substitution function
		System.out.println("\n\nPolyalphabetic substitution function");
		for(int i=0;i<pt.length;i++){
			System.out.print(pt[i]);
			if(i%2==0){
				int h = Arrays.asList(mainarr).indexOf(pt[i]);
				int x = ((5*h)+13)%26;
				ct[i]=mainarr[x];
			}else{
				int h = Arrays.asList(mainarr).indexOf(pt[i]);
				int y = (3*h)%26;
				ct[i]=mainarr[y];
			}
		}
		System.out.println();
		for(int i=0;i<ct.length;i++){
			System.out.print(ct[i]);
		}
		
		//Frequency Distribution 2
				int[] count1 = new int[mainarr.length];
				System.out.println("\n\nFrequency Distribution for Polyalphabetic substitution function");
				for(int i=0;i<mainarr.length;i++){
					System.out.print(mainarr[i]+"\t");
				}
				System.out.println();
				for(int i=0;i<ct.length;i++){
					int h = Arrays.asList(mainarr).indexOf(ct[i]);
					for(int j=0;j<mainarr.length;j++){
						if(ct[i].equals(mainarr[j])){
							count1[h]+=1;
						}
					}
				}
				for(int i=0;i<count1.length;i++){
					System.out.print(count1[i]+"\t");
				}
		
		
	}
}
