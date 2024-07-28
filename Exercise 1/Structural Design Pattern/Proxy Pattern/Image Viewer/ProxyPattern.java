public class ProxyPattern
{
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded and displayed
        image.display();
        System.out.println("");

        // Image will not be loaded again, only displayed
        image.display();
    }
}