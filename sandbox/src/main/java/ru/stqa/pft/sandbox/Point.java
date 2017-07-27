package ru.stqa.pft.sandbox;

/**
 * Created by Владимир on 23.07.2017.
 */

class Point {
    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    public String toString() {
        return "("+x+";"+y+")";
    }
    // выводит на экран описание точки
    public void printPoint() {
        System.out.print(this.toString());
    }
    // метод перемещает точку на указанный вектор
    public void movePoint(double a, double b) {
        x = x + a;
        y = y + b;
    }
    // метод изменяет координаты точки на указанные
    public void setPoint(double a, double b) {
        x = a;
        y = b;
    }
    // конструктор по умолчанию, создающий точку в начале координат
    public Point() {
        x = 100.0;
        y = 500.0;
    }
    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;
    }
    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
    }


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(-1,1);
        System.out.println("Distanse between "+p1+" and "+p2+" equals "+p1.length(p2));

    }
}