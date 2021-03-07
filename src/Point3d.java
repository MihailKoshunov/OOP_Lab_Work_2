/**
* Трёхмерный класс точки
 * Данный класс наследуется от класса Point2d
 * **/
public class Point3d extends Point2d{

    /** Координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d (double x, double y,double z) {
        super(x,y);
        zCoord = z;
    }

    /** Конструктор по умолчанию **/
    public Point3d()
    {
        this(0,0,0);
    }

    /** Метод который вычисляет расстояние между двумя точками **/
    public double distanceTo(Point3d p)
    {
        double xx = this.getX() - p.getX();
        double yy = this.getY() - p.getY();
        double zz = this.getZ() - p.getZ();
        return (Math.sqrt(xx*xx + yy*yy + zz*zz));
    }

    /** Возвращение координаты Z **/
    public double getZ()
    {
        return zCoord;
    }

    /** Установка значения координаты Z. **/
    public void setZ(double val)
    {
        zCoord = val;
    }

}
