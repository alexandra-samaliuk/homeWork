package HomeTask4.homeTask4_2;

import java.util.Scanner;

public class HomeTask4_2 {
    public static void main(String[] args) {
        System.out.println("Введите объем коробки");
        Scanner scanner = new Scanner(System.in);
        double volume = scanner.nextDouble();
        double volume2;
        while (true) {
            System.out.println("Выберете фигуру, которую вы хотите положить в коробку\n1 - Цилиндр\n2 - Пирамида\n3 - Шар");
            int figura = scanner.nextInt();
            switch (figura) {
                case 1:
                    Cylinder cylinder = new Cylinder(1 + Math.random() * 2, 1 + Math.random() * 2);
                    volume2 = cylinder.volume(cylinder.getRadius(),cylinder.getHigh());
                    System.out.println(volume2);
                    break;
                case 2:
                    Pyramid pyramid = new Pyramid(1 + Math.random() * 10, 1 + Math.random() * 2);
                    volume2 = pyramid.volume(pyramid.getSquare(),pyramid.getHeight());
                    System.out.println(volume2);
                    break;
                case 3:
                    Ball ball = new Ball(1 + Math.random() * 2);
                    volume2 = ball.volume(ball.getRadius());
                    System.out.println(volume2);
                    break;
                default:
                    System.out.println("Такой фигуры не существует");
                    System.out.println("Продолжайте добавлять фигуры");
                    volume2 = 0;
            }
            if(volume2 != 0){
                if (volume >= volume2) {
                    System.out.println("Фигура добавлена в коробку");
                    volume = volume - volume2;
                    if(volume > 0){
                        System.out.println("Продолжайте добавлять фигуры");
                    }
                } else {
                    System.out.println("Фигура не добавлена, места нет");
                    break;
                }
            }
        }

    }
}
