public class Stack1 {
    char[]s=new char[10];
    int tos;

    Stack1(){
        tos=-1;
    }

    void push(char item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            s[++tos]=item;
    }

    char pop(){
        if(tos>=0)
             return s[tos--];
        else
            System.out.println("Stack is empty");
            return 'z';
    }

}
