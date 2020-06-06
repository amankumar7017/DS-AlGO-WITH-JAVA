class ToggleString{
	public static void main(String[] args) {
			
			String s = "AbCdEfGHijklmnopqRSTUVWXYZ";

			System.out.println("this is given String "+s);

			StringBuilder sb = new StringBuilder(s);

			for (int i=0;i < sb.length();i++) {
				char ch = sb.charAt(i);

				if(ch >= 'a' && ch <= 'z'){
					ch = char(ch-'a'+ 'A');
				}else{
					ch = (char)(ch-'A'+'a');
				}


				sb.setCharAt(i,ch);
			}

			String result = sb.toString();
			System.out.println("this is Toggled String "+result);

		}
	}
