import java.util.Random;

public class Main {
    public static void main(String[] args){

        System.out.println(generateRandomAge());
        System.out.println(getAgeAndTemperature(generateRandomAge(),-12));
        System.out.println(getAgeAndTemperature(24,-20));
        System.out.println(getAgeAndTemperature(16,21));
        System.out.println(getAgeAndTemperature(23,-30));
        System.out.println(getAgeAndTemperature(50,12));
    }
       public static String getAgeAndTemperature(int age, int temperature) {
           if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
               return "можно идти гулять";
           }else if (age <= 20 && temperature >= 0 && temperature <= 28) {
               return "можна идти гулять";
           }else if (age > 45 && temperature >= -10 && temperature <= 25) {
               return "можна идти гулять";
           }else {
               return "оставайтесь дома";
           }
       }
       // дополнительные дз
       public static int generateRandomAge(){
        // Random = генерирует случайное число
        Random random = new Random();
        // nextInt() - означает что это целое число то что мы пишем в скобках это до какого числа он может генерировать
        int age = random.nextInt(100);
        return age;
       }
}