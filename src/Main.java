import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class RectangleArea {
    double a, b, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ten program pomoze obliczyc obszar prostokąta");
        System.out.println("wpisz dlugosc strony a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("wpisz dlugosc strony b:");
        b = Double.parseDouble(br.readLine());
    }

    void computeField() {
        area = a * b;
    }

    void fieldDisplay() {
        System.out.print("obszar prostokąta ze stroną a = ");
        System.out.printf("%2.2f", a);
        System.out.print(" i ze stroną b = ");
        System.out.printf("%2.2f", b);
        System.out.print(" jest = ");
        System.out.printf("%2.2f.\n", area);
    }

    static void start() throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        RectangleArea.start();
    }
}