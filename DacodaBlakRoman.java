public class DacodaBlakRoman {
    private int translate(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public int romanToInt(String s) {
        int sum = 0;
        int cur = translate(s.charAt(0));

        for (int i=1; i<s.length(); i++){
            int next = translate(s.charAt(i));

            if (cur < next)
             sum -= cur;
            else
             sum += cur;
            cur = next;
        }
        sum += cur;
        return sum;
}
}
/*DACODA'S EXPLANATION:
 Start with a switch statement to store the Roman Numerals
 with the corresopnding number that have been provided by the question.
 int romanToInt method requires a String, which is the Roman Numeral i.e "V".
 The question ask for the sum of provided Roman Numerals. Therefore the first variable
 is an int named sum, with the value of 0. That is what we must figure out. 
 From here, we can write the last line "return sum;" 
 Back up to the variables. "int cur" equals the number from the switch statement.
 DRILL DOWN: From the switch statement, an input is given and then matched up in the 
 switch statement.
 The for statement is going to traverse you through the characters.
 If the "cur" is less than "next", then the "sum" is equal to "cur" minus the "sum".
 This is done because in Roman Numerals, if the first number, from the left,
 is smaller than the next number to the right, you subtract left from right
 to get the number. i.e I=1, V=5, IV=4.
 If "cur" is not less then the "sum" is equal to "cur" plus "sum". Keep going through
 characters. The sum is "cur" plus "sum".
 Return the sum.

 */