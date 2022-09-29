package stack;

interface StackI{
    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    char peek();
    void clear();
}

public class Stack implements StackI{

    private int top;
    private int stackSize;
    private char stackArr[];

    // stack constructor
    public Stack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }

    // 스택이 비어있는 상태인지 확인
    @Override
    public boolean isEmpty() {
        // 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true가 아닌 경우 false를 return;
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        // 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우, false를 return
        return (top == this.stackSize-1);
    }

    @Override
    public void push(char item) {
        if(isFull()){
            System.out.println("스택이 꽉 찼어요.");
        } else {
            stackArr[++top] = item; // 다음 스택 포인터가 가르키는 인덱스에 데이터 추가
            System.out.println("push item : "+item);
        }
    }

    // 스택의 최상위 데이터 추출 후 삭제
    @Override
    public char pop() {
        if(isEmpty()){
            System.out.println("삭제 실패, 스택이 비어있음.");
        } else {
            System.out.println("deleted item : " + stackArr[top]);
            return stackArr[top--];
        }
        return 0;
    }

    // 스택의 최상위 데이터 추출
    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("peek 실패, 스택이 비어있어요");
        } else {
            System.out.println("peek item : " + stackArr[top]);
            return stackArr[top];
        }
        return 0;
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("stack 이 이미 비어있어요");
        } else {
            top = -1;
            stackArr = new char[this.stackSize]; // 새로운 스택 배열 생성
            System.out.println("스택을 초기화 했습니다.");
        }
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("stack이 비어있습니다.");
        } else {
            System.out.print(" stack elements : ");
            for(int i = 0; i <= top; i++){
                System.out.print(stackArr[i] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int stackSize = 5;
        Stack stack = new Stack(stackSize);

        stack.push('A');
        stack.printStack();

        stack.push('B');
        stack.printStack();

        stack.push('C');
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.peek();
        stack.printStack();

        stack.clear();
        stack.printStack();

    }
}
