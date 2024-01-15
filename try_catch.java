class try_catch{
    public static void main(String[] args) {
        try {
            int a=40/0;
            System.out.println("divide");
        } catch (Exception e) {
            System.out.println("can't divide by zero");
            // TODO: handle exception
        }
    }
}
