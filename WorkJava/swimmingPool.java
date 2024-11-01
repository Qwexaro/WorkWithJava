package WorkJava;

public class swimmingPool
{
    public static void main(String[] args) {
        int valume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int bassein = 0;
        int time = 0;
        while (bassein != valume)
        {
            bassein += fillingSpeed;
            bassein -= devastationSpeed;
            time += 1;
        }
        System.out.println("Количество минут затраченных на заполнение: " + time);
    }
}
