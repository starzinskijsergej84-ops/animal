
void main() {

    Integer a = 34563565;
    int b = 345633545;


    String x = "Hello, world!";
    long sum = getSum(a, b);
    System.out.println(x);
    System.out.println(sum);

}

private int getSum(int a, int b) {
    int sum = a + b;
    return sum;
}


interface Ass {
    int getSum(int a, int b);
}