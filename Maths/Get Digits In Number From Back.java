
package  Maths;
import java.util.Arrays;



class Get_Digits_In_Number_From_Back{
  
    public static void main(String[] args) {
            int number = 12345;
      
            getDigits(number);
    }

  

    public static int[] getDigits(int number){
        int lengthOfNumber = (int) Math.ceil(Math.log10(number + 1)); // method to get the length of length in constant time
        int [] digitInNumbers = new int[lengthOfNumber]; // to store the digits

        int index=0;
        while (number!=0){ // till number not divisible
          
            int lastDigit = number%10;  // get last digit
          
            digitInNumbers[index] = lastDigit; // store the digits
          
            number/=10; // remove the last digit
          
            index++;
        }

      
        System.out.println( Arrays.toString(digitInNumbers)); // print the store digits

        return  digitInNumbers; // return the value

    }



  

}
