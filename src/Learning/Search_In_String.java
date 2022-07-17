package Learning;

public class Search_In_String {
    public static void main(String[] args) {
        String str = "Naruto";
        char chr = 'o';
        System.out.println();
        System.out.println(searchInString(str,chr));
        System.out.println(search(str,chr));


    }
    static boolean searchInString(String str, char chr){
        if (str.length() == 0)
            return false;
       //String n =  str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            if (chr == str.charAt(i))
                return true;
        }

        return false;
    }
    static int search(String str, char ch){
        if (str.length() == 0)
            return -1;
        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i))
                return i;
        }
        return -1;
    }

}
