package com.gevernova.datastrucutures.stack.stackImplementatoin;

public class StackImplementation {

    public static void main(String[] args) {
        stack st=new stack(10);
        st.push(5);
        st.push(10);
        st.push(15);
        st.peek();
        st.pop();
        st.peek();
        st.printStack();

    }
}
