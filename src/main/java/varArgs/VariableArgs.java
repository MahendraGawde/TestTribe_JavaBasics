package varArgs;

public class VariableArgs {
// We can pass multiple arguments using ... declaration in method brackets.
    public static int sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,4,7));
    }
}
