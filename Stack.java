public class Stack {

    private int[] stack;  // Isi Data
    private int max;      // Jumlah Tumpukan
    private int top;      // Tumpukan Terakhir / Indeks Terakhir

    public Stack(int max){
        this.max = max;
        stack = new int[max];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max - 1;
    }

    public void push(int value){
        if(!isFull()){
            stack[++top] = value;
        } else {
            System.out.println(value + " tidak bisa ditambahkan, stack penuh!");
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stack[top--];
        } else {
            return -1;
    }
    }

    public int peek(){
        if(!isEmpty()){
            return stack[top];
        } else {
            return -1;
        }
    }

    public void print(){
        if(!isEmpty()){
            for(int i = top ; i >= 0 ; i--){
                System.out.println(i + " . " + stack[i]);
            }
        } else {
            System.out.println("Stack kosong");
        }
    }

}