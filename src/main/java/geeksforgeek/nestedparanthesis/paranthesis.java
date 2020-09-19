package geeksforgeek.nestedparanthesis;

/*
*    Find maximum depth of nested parenthesis in a string
*
*
* @chauhanuday
*/
public class paranthesis {

    public static void main(String args[]) {
        String s = "(((X))(((Y))))";
        System.out.println(maxDepth(s));
    }

   private static int maxDepth(String s) {
        int current_max = 0;
        int max = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                //push
                current_max++;
                if (current_max > max)
                    max++;//increament highest max 
            } else  if (s.charAt(i) == ')') {
                //pop
                if (current_max > 0)
                    current_max--;
                else
                    return -1;
            }
        }
        // finally check for unbalanced string
        if (current_max != 0) {
            return -1;
        }

        return max;
    }
}