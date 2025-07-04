class A {
public:
    virtual int func() {
        return 0;
    }
};

class B : public A {
    int func() {
        return 1;
    }
};

B b;
A *a = &b;
cout << a->func();
