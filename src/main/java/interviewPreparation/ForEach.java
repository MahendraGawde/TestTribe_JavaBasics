package interviewPreparation;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Shyam", "Vikrant", "Sita", "Gita","Vikas"
        };
        System.out.println("------------->For normal<-----------------");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println("------------>For each method<--------------");

        for(String name : names){
            System.out.println(name);
        }
    }
}
