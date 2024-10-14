import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        System.out.println("Добро пожаловать в игру *звуки заводной электропилы* Угадай число");
        System.out.println("Правила просты: Система загадала целое число - вы должны его отгадать! У вас 2 попытки (:");
        System.out.println("Для досрочного завершения игры введите число 999 !"); // сделал на уроке
        System.out.println("Введите загаданное целое число!");
        int nomer = scanner.nextInt();
        if (nomer < randomNumber || nomer > randomNumber) System.out.println("Вы ввели значение которое больше или меньше загаданного системой числа!");
        do {
            System.out.println("Введите загаданное целое число снова!"); // сделал на уроке
            break;

        }while (nomer < randomNumber || nomer > randomNumber);
        int nomerdva = scanner.nextInt();
        if (nomerdva < randomNumber || nomerdva > randomNumber) System.out.println("Вы исчерпали количество ваших попыток и игра завершилась досрочно!");
        if (nomerdva == randomNumber)System.out.println("Вы угадали загаданное число и победили со второй попытки!");
        else if (nomerdva == 999) System.out.println("Вы завершили игру принудительно досрочно!");
        if (nomer == randomNumber)System.out.println("Вы угадали загаданное число и победили с первой попытки!");
        else if (nomer == 999) System.out.println("Вы завершили игру принудительно досрочно!");

       scanner.close();


// сделал на уроке
    }
}