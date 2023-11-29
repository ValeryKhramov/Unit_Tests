import java.util.Arrays;
import java.util.List;

/* Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
        a. Рассчитывает среднее значение каждого списка.
        b. Сравнивает эти средние значения и выводит соответствующее сообщение:
        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
        - ""Средние значения равны"", если средние значения списков равны.*/
public class Lists {

    public String avgLists(List<Integer> firstNumbers, List<Integer> secondNumbers) {
        int firstSum = 0;
        for (int i = 0; i < firstNumbers.size(); i++) {
            firstSum = firstSum + firstNumbers.get(i);
        }
        int avgFirstNum = firstSum / firstNumbers.size();

        int secondSum = 0;
        for (int i = 0; i < secondNumbers.size(); i++) {
            secondSum = secondSum + secondNumbers.get(i);
        }
        int avgSecondNum = secondSum / secondNumbers.size();


        if (avgFirstNum > avgSecondNum) {
            return "Первый список имеет большее среднее значение";
        }
        if (avgSecondNum > avgFirstNum) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";


    }

}
