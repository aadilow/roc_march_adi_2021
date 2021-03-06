package string2;

public class strings2 {

	public static void main(String[] args) {
		// odd word length convert middle char to uppercase = (length-1)/2
		// even word length first char uppercase

		String str1 = "The quick brown fox ate my homework :(";
		String[] x = str1.split(" ");
		StringBuilder s = new StringBuilder();

		// detect word length by splitting at white space. Store in array and measure
		// length then write to new string
		for (int i = 0; i < x.length; i++) { // for each word
			int z = x[i].length();

			for (int j = 0; j < z; j++) {
				if (z % 2 == 0) { // even
					if (j == 0)
						s.append(x[i].toUpperCase().charAt(j));
					else
						s.append(x[i].charAt(j)).charAt(j);

				} else {// odd
					if (j == ((z - 1) / 2))
						s.append(x[i].toUpperCase().charAt(j));
					else
						s.append(x[i].charAt(j)).charAt(j);
				}

			}
			s.append(' ').charAt(z);

		}

		System.out.println(s);

	}

}
