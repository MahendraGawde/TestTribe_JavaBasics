package interviewPreparation;

public class FirstAndLastOccurenceOfChar {
    public static void main(String[] args) {
        String input = "Hello World";
        input = input.toLowerCase();

        int firstIndex = -1;
        int lastIndex = -1;

        for(int index = 0; index< input.length(); index++){
            if(input.charAt(index) =='o'){
                firstIndex =index;
                break;
            }
        }
        for (int index = input.length()-1; index >= 0 ; index--) {
            if(input.charAt(index) == 'o'){
                lastIndex =index;
                break;
            }
        }
        if(firstIndex<0){
            System.out.println("Character is not present");
        }else {
            System.out.println("first index of o -> " + firstIndex);
            System.out.println("last index of o ->" + lastIndex);
        }
    }
}
