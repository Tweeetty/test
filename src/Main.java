public class Main {

    public static void main(String[] args) {
        int[] sales = new int[] {1, 2, 300, 200};
        SalesManager salesManger = new SalesManager(sales);
int max = salesManger.max();
int min = salesManger.min();
int average = salesManger.average();

System.out.println(max);
        System.out.println(min);
        System.out.println(average);

    }
}
