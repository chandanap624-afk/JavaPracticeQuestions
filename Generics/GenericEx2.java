package com.wipro.Java.Generics;

class Test3<T> {
    // An object of type T is declared
    T obj;
    Test3(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

class GenericEx2 {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test3<Integer> iObj = new Test3<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test3<String> sObj
            = new Test3<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        iObj = sObj; // This results an error
    }
}


