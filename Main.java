public class Main {
    public static void main(String[] args) {
        
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("===========");

        System.out.println("Print Stack");
        s.print();
        System.out.println("===========");

        s.pop();
        System.out.println("Print Stack");
        s.print();
        System.out.println("===========");

        System.out.println("Peek : " + s.peek());
        System.out.println("===========");

    }
}