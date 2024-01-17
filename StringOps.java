public class StringOps {
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        char temp;
        String sentence = "";
        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            if (temp >='A' && temp <= 'Z') {
                if (temp == 'A' || temp == 'E'|| temp == 'I'|| temp == 'O' || temp == 'U') {
                }
                else {
                    temp += 32;
                }
            }
           
            else if (temp == 'a' || temp == 'e'|| temp == 'i'|| temp == 'o' || temp == 'u') {
                temp -= 32;
            }
            sentence += temp;
        }
        return sentence;
    }

    public static String camelCase (String string) {
        char temp;
        String nospace = "";
        int j = 0;
        int i;
        for (i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            if (temp != ' ') {
               break;
            }
        }
        j = i;
        for (i = (string.length() - 1); i > 0; i--) {
            temp = string.charAt(i);
            if (temp != ' ') {
               break;
            }
        }
        int length = i + 1;
        temp = string.charAt(j);
        if (string.charAt(j) >= 'A' && string.charAt(j) <='Z'){
            temp += 32;
           nospace += temp;
        }
        else {
            nospace += temp;
        }
        j++;
        while (j < length) {
            temp = string.charAt(j);
            if (temp >='A' && temp <= 'Z') {
            temp += 32;
            nospace += temp;
            }
            else if (temp >='a' && temp <= 'z') {
                nospace += temp;
            }
            else if (temp == ' ') {
                j++;
                temp = string.charAt(j);
                if (temp != ' ') {
                   if (temp >='a' && temp <= 'z') {
                      temp -= 32;
                      nospace += temp;
                    }
                }
                else if (temp == ' ') {
                    while (temp != ' ' && j < length) {
                        j++;
                    }
                    j--;
                } 
            }
            j++;
        }
        return nospace;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        int j = 0;
        for (int i= 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        int [] arr = new int[counter];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr)
            {
                arr[j] = i;
                j++;
            }
        }
        return arr[];
    }
}
