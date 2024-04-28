package palindrome;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<10&& x>=0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;


        List<Integer> numbers = new ArrayList<>();
        while (x != 0) {
            numbers.add(x % 10);
            x /= 10;
        }
        int length= numbers.size();
        int mid= length/2;
        for(int i= 0; i<mid;i++){
            if(numbers.get(i)!= numbers.get(length-1-i))
                return false;
        }
        return true;
    }
}
