import java.util.Scanner;
/** двумерный класс точки.**/
public class Point3d {
    /** координата X **/
    private double xCord;
    /** координата Y **/
    private double yCord;
    /** координата Z **/
    private double zCord;
    /** Конструктор инициализации**/
    public Point3d(double x, double y, double z) {
        xCord = x;
        yCord = y;
        zCord = z;
    }
    /** Конструктор по умолчанию **/
    public Point3d() {
        this(0,0,0); }
    /** Возвращение координаты X **/
    public double getX() {
        return xCord; }
    /** Возвращение координаты Y **/
    public double getY() {
        return yCord; }
    /** Возвращение координаты Z **/
    public double getZ() {
        return zCord; }
    /** установка значения координаты X **/
    public void setX (double val) {
        xCord = val; }
    /** установка значения координаты Y **/
    public void setY (double val) {
        yCord = val; }
    /** установка значения координаты Z **/
    public void setZ (double val) {
        zCord = val; }
    /** метод для сравнения значений двух объектов Point3d **/
    public static boolean compare (Point3d a, Point3d b) {
        return (a.xCord == b.xCord && a.yCord == b.yCord && a.zCord == b.zCord);
    }
    /** метод для вычисления расстояния между двумя точками **/
    public double distanceTo(Point3d a) {
        double range = Math.sqrt((xCord - a.xCord) * (xCord - a.xCord) +
                (yCord - a.yCord) * (yCord - a.yCord) + (zCord - a.zCord) * (zCord - a.zCord)) * 100;
        range = (int)range;
        return range / 100;
    }
    public static void main(String[] args) // основной метод
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 координаты: ");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double c1 = in.nextDouble();
        Point3d Point1 = new Point3d(a1,b1,c1); // применяем конструктор инициализации
        System.out.print("Введите 3 координаты: ");
        a1 = in.nextDouble();
        b1 = in.nextDouble();
        c1 = in.nextDouble();
        Point3d Point2 = new Point3d(); // применяем конструктор по умолчанию
        Point2.setX(a1); Point2.setY(a1); Point2.setZ(a1); // устанавливаем значения с помощью методов
        System.out.println("(" + Point1.getX() + "," + Point1.getY() + "," + Point1.getZ() + ")"); // выводим первый объект
        System.out.println("(" + Point2.getX() + "," + Point2.getY() + "," + Point2.getZ() + ")"); // выводим второй объект
        if (compare(Point1, Point2)) // сравнение значений
            System.out.println("Точки имеют одинаковые координаты.");
        else System.out.println("Точки имеют разные координаты.");
        System.out.println("Расстояние между точками: " + Point1.distanceTo(Point2)); // вывод расстояния между точками
    }
}
