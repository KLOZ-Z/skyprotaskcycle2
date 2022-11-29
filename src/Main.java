public class Main {

    public static void task1() {
        System.out.println("\nTask 1");
        int sum = 0;
        int plus = 15000;
        int k = 0;
        while(sum<=2459000){
            sum+=plus;
            k++;
            System.out.println("Месяц "+k+" , сумма накоплений равна "+sum+" рублей");
        }
    }

    public static void task2() {
        System.out.println("\nTask 2");
        int k = 0;
        while(k<10){
            k++;
            System.out.print(k+" ");
        }
        System.out.println("");
        for(;k>0;k--){
            System.out.print(k+" ");
        }
    }

    public static void task3() {
        System.out.println("\nTask 3");
        int population = 12000;
        int yearBorn = 17*12;
        int yearDeath = 8*12;
        for(int i=1;i<=10;i++){
            population = population+yearBorn-yearDeath;
            System.out.println("Год "+i+" численность населения составляет "+population*1000);
        }
    }

    public static void task1_2() {
        System.out.println("\nTask 1_2");
        double sum = 15;
        int k = 0;
        while(sum<=12000){
            k++;
            sum = sum*1.07;
            System.out.println("Месяц "+k+", сумма накоплений равна "+Math.round(sum*1000)+" рублей");
        }
    }

    public static void task2_2() {
        System.out.println("\nTask 2_2");
        double sum = 15;
        int k = 0;
        while(sum<=12000){
            k++;
            sum = sum*1.07;
            if(k % 6 == 0)
                System.out.println("Месяц "+k+", сумма накоплений равна "+Math.round(sum*1000)+" рублей");
        }
    }

    public static void task3_2() {
        System.out.println("\nTask 3_2");
        double sum = 15000;
        int k = 1;
        for(;k<=12*9;k++){
            sum = sum*1.07;
            if(k % 6 == 0)
                System.out.println("Месяц "+k+", сумма накоплений равна "+Math.round(sum)+" рублей");
        }
    }

    public static void task4_2() {
        System.out.println("\nTask 4_2");
        int friday = 4;
        int k = friday;
        while(k<=31){
            System.out.println("Сегодня пятница, "+ k + "-е число. Необходимо подготовить отчет.");
            k+=7;
        }
    }

    public static void task1_3() {
        System.out.println("\nTask 1_3");
        int cometYear = 0;
        int currentYear = 2022;
        while(cometYear<=currentYear-200){
            cometYear+=79;
        }
        for(;cometYear<=currentYear+100;cometYear+=79){
            System.out.println(cometYear);
        }
    }

    public static void task2_3() {
        System.out.println("\nTask 2_3");
        int k =2;
        for(int i = 1;i<=10;i++){
            System.out.println(k+"*"+i+"="+i*k);
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task1_2();
        task2_2();
        task3_2();
        task4_2();
        task1_3();
        task2_3();
    }
}