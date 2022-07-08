public class BitManipulation {
    public static void main(String[] args) {
        // There are 4 operations of bit manipulation
        // 1. GET
        // 2. SET
        // 3. CLEAR
        // 4. UPDATE

        // Get
        // 1st know the binary digit position
        // then left shift 1 to that position name it bitmask
        // then apply And to original number and bitmask
        int n = 3;
        int position = 2;        
        int bitmask = 1<<position;
        if((n&bitmask)==0){
            System.out.println("Digit is 0");
        }else{
            System.out.println("Digit is 1 ");
        }

        // Set 
        // 1st know the binary digit position
        // then left shift 1 to that position name it bitmask
        // then apply OR to original number and bitmask
        // particular digit is changed
        n = 5;
        position = 1;
        bitmask = 1<<position;
        System.out.println("number before Set "+ n);
        int c = (n | bitmask);
        System.out.println("number after Set 1 = "+c);

        // clear
        // 1st know the binary digit position
        // then left shift 1 to that position name it bitmask
        // then apply not to bitmask
        // then apply And to original number and bitmask
        n = 7;
        position = 2;
        bitmask = 1<<position;
        bitmask = ~bitmask;
        c = (n&bitmask);
        System.out.println("number before Set "+ n);
        System.out.println("number after Clear = "+c);

        //update
        // 2 case 
        // if update to 0 => apply clear operation 
        // if update to 1 =>apply Set operation





    }
}
