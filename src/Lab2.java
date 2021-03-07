import java.util.Scanner;

public class Lab2 {


    public static void main(String[] args) {
        Point3d[] myPoint = new Point3d[3];
        Scanner in = new Scanner(System.in);
        //Цикл ввода координат точек
        for (int i = 0; i < myPoint.length; i++)
        {
            myPoint[i] = new Point3d();
            System.out.print("Координата x для " + (i + 1) + " объекта: ");
            myPoint[i].setX(in.nextDouble());
            System.out.print("Координата y для " + (i + 1) + " объекта: ");
            myPoint[i].setY(in.nextDouble());
            System.out.print("Координата z для " + (i + 1) + " объекта: ");
            myPoint[i].setZ(in.nextDouble());
        }

        //Создан цикл, чтобы вывести данные о точках которые мы вводили
        for (int i = 0; i < myPoint.length; i++)
        {
            System.out.println("Вывод точек для: " + (i+1) + " объекта: (" + myPoint[i].getX() + " " + myPoint[i].getY() + " " + myPoint[i].getZ() + ")");
        }

        //Проверка на равность точек
        if (checkPoints(myPoint[0], myPoint[1], myPoint[2]))
        {
            //Если условие которое мы прописали верно, выведет площадь треугольника
            System.out.printf("Площадь треугольника: " + "%.2f", computeArea(myPoint[0], myPoint[1], myPoint[2]));
        }
        else
        {
            //Если условие которое мы прописали верно, выведет площадь треугольника
            System.out.println("Некоторые точки имею равные координаты. Пожалуйста, введите правильные данные");
        }
    }


    /** Метод который вычисляет площадь треугольника **/
    public static double computeArea (Point3d p1, Point3d p2, Point3d p3) //Вычисление площади треугольника
    {
        double a = p1.distanceTo(p2); //Вычисление стороны a
        double b = p2.distanceTo(p3); //Вычисление стороны b
        double c = p3.distanceTo(p1); //Вычисление стороны c
        double per = ((a+b+c)/2); //Вычисление периметра
        return (Math.sqrt(per*(per-a)*(per-b)*(per-c))); //Возвращаемое значение - площадь треугольника по формуле Герона
    }

    /**Метод который проверяет равность точек **/
    public static boolean checkPoints(Point3d p1, Point3d p2, Point3d p3)
    {
        if (((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()) && (p1.getZ() == p2.getZ())) ||
                ((p2.getX() == p3.getX()) && (p2.getY() == p3.getY()) && (p2.getZ() == p3.getZ())) ||
                ((p1.getX() == p3.getX()) && (p1.getY() == p3.getY()) && (p1.getZ() == p3.getZ())))
            return false;
        return true;

    }

}
